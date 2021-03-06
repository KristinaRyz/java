
public class LinkedListInt {//ssilka na head i na tail, skolko yacheek vsego on ne znaet
	private Node head = null; // ne obyazatlno ukazivat null
	private Node tail = null;//
	private int size = 0;

	public LinkedListInt(){

	}

	public void addInt(int value){
		Node node = new Node(value);//object tipa Node
		if(head == null){//esli head =null, to element stanovitsya head
			head = node;
			tail = node;
		}else{
			tail.setNext(node); // sdelai posle tail element
			tail = node; // oboznachili poslednii element tail
		}
		size++;
	}
	public void addIntToHead(int value){
		Node node = new Node(value);
		if(head == null){
			head = node;
			tail = node;
		}else{ 
			node.setNext(head);//sleduuwii posle node bydet golovoi
			head = node;//golovu perenapravili
		}
		size++;
	}
	public int getSize() {
		return size;
	}

	public void displayList(){
		Node curr = head;
		while(curr != null){
			System.out.print(curr.getValue() + " ");//raspechatai cho tam lejit
			curr = curr.getNext();//postav tuda, gde bil next(sleduuwii posle next)
		}
		System.out.println();

	}
	public int find(int value){
		if(head == null)
			return -1;
		int count = 0;
		Node curr = head;
		while(curr != null){
			if (curr.getValue() == value){
				return count;//esli pi if return - to else ne nujen
			}
			count++;
			curr =curr.getNext();
		}
		return -1;
	}

	public boolean removeLast(){
		if(head == null) //uslovie pri pustom liste
			return false;
		if(head == tail){//uslovie pri odnom node
			head = null;
			tail = null;
			size = 0;
			return true;
		}
		Node curr = head; // usloviya poiskaa poslednego elementa
		while(curr.getNext() != tail){
			curr = curr.getNext();// cuur eto poslednii pered hostom
		}
		tail = curr;//peremestili tail na odnu nazad
		tail.setNext(null);
		size--;
		return true;
	}
	public boolean removeFirst(){
		if(head==null){ return false;}
		if(head==tail){ head=tail=null; size = 0; return true;}
		Node curr = head;
		head = head.getNext();////sdvigaem golovu
		size--;
		curr.setNext(null); // posle curr sled element null 
		return true;
	}

	public int findIntIndex(int index){
		if(head==null) {
			return -1;}
		if(index<=0){
			return head.getValue();}
		if(index>=size-1){
			return tail.getValue();}
		Node curr = head;
		while(index>0){
			curr = curr.getNext();
			index--;}
		return curr.getValue();}


	public void addAfter(int index, int value){
		if(index<0 || head == null){
			addIntToHead(value);
			return;
		}
		if(index>=size-1){
			addInt(value); 
			return;
		}			
		Node node = new Node(value);
		Node curr = head;
		while(index>0){
			curr = curr.getNext();
			index--;}
		//			Node next = curr.getNext(); 
		//			node.setNext();to ge samoe 4to isled stroka
		node.setNext(curr.getNext());
		curr.setNext(node);
		size++;
	}

	public boolean remove (int index){
		if(head==null || index < 0 || index > size-1)
			return false;
		if(index == 0) {
			removeFirst();
			return true;
		}
		if(index == size-1){
			removeLast();
			return true;
		}
		Node curr = head;
		while(index > 1){
			curr = curr.getNext();
			index--;}
		Node currNext = curr.getNext();
		curr.setNext(currNext.getNext());
		currNext.setNext(null);
		size--;
		return true;
	}

	public void reverceList(){
		if(head == null || head == tail)
			return;
		Node  prev = null;
		Node curr = head;
		Node next = head.getNext();
		while(next != null){
			curr.setNext(prev);
			prev = curr;
			curr = next;
			next = next.getNext();
		}
		tail = head;
		head = curr;
		head.setNext(prev);
	}
	public void removeAll(){
		head =tail = null;
		size=0;
	}

	public boolean removeValue(int value){
		if(head==null)
			return false;
		Node curr = head;
		int index =0;
		while(curr.getValue() != value){
			index++;
				curr = curr.getNext();
		}
		return remove(index);
	}
	public boolean removeValue2(int value){
		if(head==null)
			return false;
		Node curr = head;
		boolean isDeleted=false;
		
		while(curr.getNext() != null){
			if(curr.getNext().getValue()==value){
				Node currNext = curr.getNext();
				curr.setNext(currNext.getNext());
				currNext.setNext(null);
				isDeleted=true;
			}else{
				curr = curr.getNext();
			}
		}
		return isDeleted;
		
	}
}






