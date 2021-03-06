public class MyIntArray {
	private int[] array = null; //ssilka na inkapsulirovanii massiv , 
	private int size = 0;//razmer massiva, skolko est elementov v massive
	private int capacity = 0;// obem massiva = 0
	private static final int DEFAULT_CAPACITY = 5;//	kone4nii result

	public MyIntArray(int capacity){//emkost, obwii ob'em, skolko mojno dobavit, constructor, name kak i class, i ni4ego ne vozvrawaet
		//v buduwem postroim object tipa myintarray, vnutri kotogo massiv
		array = new int[capacity]; //peredali ob'em massivu
		this.capacity = capacity;//zapisali v pole chemu raven ob'em massiva
	}
	public int getSize(){ 
		return size;
	}
	public int getCapacity(){
		return capacity;
	}

	public void add(int a){//method add
		if(size<capacity){ // potomu4to 5 elementa net v massive, ot 0 do 4
			array[size] = a;
			size++;
		}
		else{
			capacity = capacity+DEFAULT_CAPACITY;
			int[] ar1 = new int[capacity];
			for(int i = 0; i<size; i++){
				ar1[i] = array[i];
			}
			ar1[size] = a;//sleduuwii element posle 5go pisat budet
			size++;
			array = ar1;
		}
	}
	public void printArray(){
		for(int i = 0; i<size; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public int elementAt(int i){ //charAt
		return array[i];

	}
	public int indexOf(int a){
		for(int i = 0; i<size; i++){
			if( array[i] == a)
				return i;
		}

		return -1;
	}
	public void removeLast(){
		if(size<capacity){
			array[size] = array.length-1;
			size--;
		}
		else{
			capacity = capacity+DEFAULT_CAPACITY;
			int[] ar1 = new int[capacity];
			for(int i = 0; i<size; i++){
				ar1[i] = array[i];
			}
			ar1[size] = ar1.length;//sleduuwii element posle 5go pisat budet
			size--;
			array = ar1;
		}
	}
	public void removeAll(){
		size = 0;
	}
//b = index
//a = 4islo
	public void addAfter(int a, int b){
		int[] ar3 = new int[capacity];
		for(int i = 0; i<size; i++){
			ar3[i] = array[i];
			array[size-b] = a;
		}
	}
}
