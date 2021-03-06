
public class LinkedListInt {//ssilka na head i na tail, skolko yacheek vsego on ne znaet
	private Node head = null; // ne obyazatlno ukazivat null
	private Node tail = null;// 25;45
	private int size = 0;// miwtanim

	public LinkedListInt(){// constractor default no arguments 
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
		if(head == null){// net elementov
			head = node;
			tail = node;
		}else{ 
			node.setNext(head);//sleduuwii posle node bydet golovoi
			head = node;//golovu perenapravili
		}
		size++;
	}
	public int getSize() {//uznat kol-vo uzlov v liste  
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
		if(head == null) //uslovie pri pustom liste
			return false;
		if(head == tail){
			head = null;
			tail = null;
			size = 0;
			return true;
		}else{ 
			Node curr = head;
			head = curr.getNext();
		}
		size--;
		return true;
	}

	public int findIntIndex (int index){
		if (head == null) {
			return -1;}
		if(index>=size-1){
			return tail.getValue();}
		if(index <= 0){
			return head.getValue();}
		Node curr = head;
		while(index > 0){
			curr = curr.getNext();
			index--;}
		return curr.getValue();
	}
	
 public void addAfter(int index, int value){
	 Node node = new Node(value);
		if(head == null){// net elementov
			return;}
		if(index<0){addIntToHead(value);return;}
		if(index>=size-1){addInt(value);return;}
		Node curr = head;
		while(index>0){
			curr = curr.getNext();
			index--;
		}
		node.setNext(curr.getNext());
		curr.setNext(node);
		size++;
	}



	//		 public boolean removeValByInd(int ind) {
	//			  
	//			  //check - size of list is 1 
	//			  //->  if ind=0 possible delete else impossible 
	//			  if (head == tail) {
	//			   if (ind != 0) {
	//			    tail = null;
	//			    head = null;
	//			    size = 0;
	//			    return true;
	//			   } else {
	//			    return false;
	//
	//			   }
	//			  }
	//			  // ind=0 -> use remove first
	//			  if (ind == 0)
	//			   return removeFirst();
	//			  //if ind=size  use remove last
	//			  if (ind == size - 1)
	//			   return removeLast();
	//			  Node cur = head; // cursor
	//			  Node prev = head; // rev node
	//			  int foundInd = 1; //1 because before check for first
	//			  while (cur.getNext() != null) {// before prev use remove first 
	//			            // tail because before did check for last 
	//			   if (foundInd == ind) {
	//			    prev = cur; //change prev 
	//			    prev.setNext(cur.getNext().getNext()); //change prev +2 two next
	//			    size--;
	//			    return true;
	//			   }
	//			   foundInd++;
	//			   prev = cur;
	//			   cur = cur.getNext();
	//			  }
	//			  return false;
	//			 }
	//		
	//	}




}
