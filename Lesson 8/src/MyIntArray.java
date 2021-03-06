public class MyIntArray {
	private int[] array = null; //ssilka na inkapsulirovanii massiv
	private int size = 0;//razmer massiva, skolko est elementov
	private int capacity = 0;
	private static final int DEFAULT_CAPACITY = 5;//	kone4nii resault
	public MyIntArray(int capacity){//emkost, obwii ob'em, skolko mojno dobavit, constructor, name kak i class, i ni4ego ne vozvrawaet
		array = new int[capacity];
		this.capacity = capacity;
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
			array = ar1;//perenapravili ssilku na novii massiv
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
		//array[size - 1] = 0; ili tolko sled stroka 
		size--;
	}
	public void removeAll(){
		array = new int [capacity];
		size = 0;
	}
	//udalit element po indexu
	public boolean remove(int i){
		if(i>= size || i< 0){//kogda size = 0, >= size ili <0
			return false;
		}
		for(int j = i+1; j<size; j++){
			array[j-1] = array[j];
		}	
		array[size - 1] = 0;
		size--;
		return true;

	} //udalit 4islo iz massiva
	public boolean removeInt(int a){
		int i = this.indexOf(a);//nahodit gde lejit 4islo
		if(i == -1)
			return false;
		this.remove(i); // po indexu udalyaet element
		return true;	
	}

	public void addFirst(int number){
		if(size>=capacity){
			//addCapacity();}//sozdali novii method dlya postoyannogo polzovaniya
			capacity = capacity + DEFAULT_CAPACITY;
			int ar1[] = new int[capacity];
			for(int i = 0; i< size; i++){
				ar1[i] = array[i];
			}
			array = ar1;
		}
		for(int i = size-1; i>=0; i--){
			array[i+1] = array[i];
		}
		array[0] = number;
		size++;
	}	
	public void addCapacity(){
		capacity = capacity+DEFAULT_CAPACITY;
		int[] ar1 = new int[capacity];
		for(int i = 0; i<size; i++){
			ar1[i] = array[i];
		}
		array = ar1;
	}
	public void addElementAfter(int number, int i){
		if(i>=size){
			add(number);
			return;
		}
		if(i < 0){
			addFirst(number);
			return;
		}
		if(size>=capacity){
			addCapacity();
		}
		for(int j = size-1; j > i; j--){
			array[j+1] = array[j];
		}
		array[i+1] = number;
		size++;

	}

	public void reverseArray(){
		for (int i = 0, j = size - 1; i<j; i++, j--){
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}
	public  int searchMaxInd(){
		int max = array[0];
		int maxInd = 0;
		for(int i = 0; i<array.length; i++){
			if(array[i]>max){
				max=array[i];
				maxInd =i;
			}
		}
		return maxInd;
	}
	public  int searchMinInd(){
		int min = array[0];
		int minInd = 0;
		for(int i = 0; i<array.length; i++){
			if(array[i]<min){
				min=array[i];
				minInd = i;
			}
		}
		return minInd;
	}

	public boolean removeFirst(){
		//		int[] ar1 = new int[size];
		//		for(int i = 0; i<size; i++){
		//			ar1[i] = array[i+1];
		//		}
		//		array=ar1;
		//		size--;
		//		return true;

		return remove(0);
	}

	public void sortAscending(){
		int temp =0;
		for (int  i = 0;  i < size;  i++) {
			for (int j = 0; j < size-1; j++) {
				if(array[j]>array[j+1]){
					temp = array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
		}

	}
	public void sortDescending(){
		int temp =0;
		for (int  i = 0;  i < size;  i++) {
			for (int j = 0; j < size-1; j++) {
				if(array[j+1]>array[j]){
					temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
}






