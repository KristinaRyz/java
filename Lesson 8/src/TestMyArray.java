
public class TestMyArray {

	public static void main(String[] args) {
		MyIntArray ar = new MyIntArray(5);
		int size = ar.getSize();
		System.out.println("The size is " +size);
		int capacity = ar.getCapacity();
		System.out.println("The capacity is " + capacity);
		ar.add(7);//dobavili 7 size = 1
		ar.add(9);//dobavili elemen vtoroy 9, size = 2
		ar.add(8);
		ar.add(2);
		ar.add(3);
		//ar.add(6); dlya 6 elementa net mesta
		ar.add(6); // pomenyali capacity


		size = ar.getSize();
		System.out.println("The size is " +size);
		capacity = ar.getCapacity();
		System.out.println("The capacity is " + capacity);
		ar.printArray();
		System.out.println(ar.elementAt(3));//otvet 2
		System.out.println(ar.indexOf(3));//otvet 4

		System.out.println();
		ar.printArray();
		ar.remove(3);
		ar.printArray();
		System.out.println();
		ar.printArray();
		ar.removeInt(8);
		ar.printArray();

		System.out.println();
		ar.printArray();
		ar.addFirst(5);
		ar.printArray();


		System.out.println();
		ar.printArray();
		ar.addElementAfter(4, 2);//dobav 4 posle 2 indexa
		ar.printArray();

		System.out.println();
		ar.printArray();
		ar.reverseArray();
		ar.printArray();
		
		System.out.println();
		ar.printArray();
		System.out.println("Max index : "+ar.searchMaxInd());
		System.out.println("Min index : "+ar.searchMinInd());
		
		
		System.out.println();
		ar.printArray();
		ar.removeFirst();
		ar.printArray();
		
		
		System.out.println();
		ar.sortAscending();
		ar.printArray();
		
		
		System.out.println();
		ar.sortDescending();
		ar.printArray();
		
	}
}
