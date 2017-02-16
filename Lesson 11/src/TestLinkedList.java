
public class TestLinkedList {
	public static void main(String[] args) {
LinkedListInt list = new LinkedListInt();
System.out.println("Size = " + list.getSize());
list.addInt(7);
list.addInt(5);
list.addInt(9);
list.addInt(2);
list.displayList();
System.out.println();
System.out.println("---Add to Head--");
list.addIntToHead(6);
list.addIntToHead(98);
System.out.println("Size = " + list.getSize());
System.out.println();
list.displayList();
System.out.println();
System.out.println("-----Find----");
int index = list.find(6);
list.displayList();
System.out.println("In index: " + index);

System.out.println();
System.out.println("---Remove Last---");
list.removeLast();
list.displayList();
System.out.println();
System.out.println("---Remove First---");
list.removeFirst();
list.displayList();
System.out.println();

list.addInt(7);
list.addInt(5);
list.addInt(9);
list.addInt(2);
System.out.println("---Find index---");
System.out.println("Size = " + list.getSize());
int value = list.findIntIndex(4);
list.displayList();
System.out.println("In index " + value);
System.out.println();
list.displayList();
list.addAfter(2, 145);
int index2 = 2;
int value1 = 145;
System.out.println("After index = " + index2 + " " + "set value = " + value1);
list.displayList();



	}
}
