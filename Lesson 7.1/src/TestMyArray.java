
public class TestMyArray {

	public static void main(String[] args) {

		MyIntArray ar = new MyIntArray(5);//peredaem ob'em
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
		System.out.println();
		ar.add(45);
		ar.add(56);
		ar.printArray();
		
		ar.removeLast();
		ar.printArray();
		size = ar.getSize();
		System.out.println("The size is " +size);
		capacity = ar.getCapacity();
		System.out.println("The capacity is " + capacity);
		System.out.println();
		System.out.println();
		
		ar.addAfter(19, 6);
		ar.printArray();
		size = ar.getSize();
		System.out.println("The size is " +size);
		capacity = ar.getCapacity();
		System.out.println("The capacity is " + capacity);
		System.out.println();
		System.out.println();
		
		ar.removeAll();
		ar.add(5);
		ar.printArray();
		size = ar.getSize();
		System.out.println("The size is " +size);
		capacity = ar.getCapacity();
		System.out.println("The capacity is " + capacity);	
	}

}