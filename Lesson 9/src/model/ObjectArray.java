package model;

public class ObjectArray {
	private static final int DEFAULT_CAPACITY = 10; // 10 i 16
	//       deistvitelnoi
	//int - rezultat perescheta, a double - rezultat izmereniya
	//2.5 rebenka ne bivaet, i 3,5 zemlyakov toge, a rost - 1.67 i td
	private static final double ENLARGE_COEFF = 1.57; // ��������� �����������

	private Object[] arr; // massive Objecta// null //peremennaya
	private int capacity;
	private int size; //16;15

	public ObjectArray(){ // default constructor
		capacity = DEFAULT_CAPACITY; // nachalnaya emkost // celoe
		arr = new Object[capacity];// novii massiv objectov
		size = 0;
	}
	//                     capasity    
	public ObjectArray(int cap){ // other constructor
		capacity = cap;
		arr = new Object[capacity];
		size = 0;// net elementov
	}

	public void add(Object obj){ // 22;30
		if(size == capacity) enlargeArray();
		arr[size++] = obj;
		//arr[size] = obj;
		//size++
	}

	private void enlargeArray() {// pi/2 v 1,57 raz uveli4it ili v 2 raza uveli4it // 28;56
		//                      deistvitelnoe 4islo * na celoe = deistvitelnoe // 10*1.57+1 = 16
		int newCapacity = (int)(capacity * ENLARGE_COEFF) + 1;// kasting // nujno delat potomuchto raznica v int i double, int otrivaet hvostik
		// massiv objecta newArray novii array obemom new capacity
		Object[] newArray = new Object[newCapacity]; 
		for(int i = 0; i < capacity; i++) newArray[i] = arr[i];// kopiruem iz starogo v new array
		arr = newArray; 
		capacity = newCapacity; // starii ob'em raven new
	}

	public void display(){//41;47
		if(isEmpty()){
			System.out.println("OA is Empty");
			return;
		}
		for(int i=0; i<size; i++)System.out.println(arr[i]);
	}
	
	public int size(){
		return size;
	}
	
	public Object get(int index){
		if(index<0 || index>=size)return null;
		return arr[index];}
	public Object removeLast(){
		return isEmpty() ? null : arr[(size--)-1];//��������� ��������
	}
	public boolean isEmpty(){return size ==0;}

	public Object removeFirst(){
		if(isEmpty())return null;
		Object removed = arr[0];
		for(int i=0; i<size-1; i++)arr[i] = arr[i+1];
		size--;
		return removed;
	}
	/* �������� �������
	 * 1 public Object remove(int index){
	 * 			return index;}		
		2 *���������� for(int i=0; i<size-1; i++)
		3 public boolean addTOIndex(Object obj, int index){}
		4 ** public void merge(ObjectArray oa){}��������� ��� �������� 
	 */
	public void addToHead(Object obj){
		if(size == capacity)enlargeArray();
		for(int i = size; i>0; i--)arr[i] = arr[i-1];
		arr[0] = obj;
		size++;
	}
}