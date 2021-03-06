
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
list.displayList();
list.removeLast();
list.displayList();

System.out.println();
System.out.println("---Remove First---");
list.displayList();
list.removeFirst();
list.displayList();

System.out.println();
System.out.println("---Find IntIndex---");
list.displayList();
int index1 = list.findIntIndex(2);
System.out.println(index1);


System.out.println();
System.out.println("---Add After---");
list.displayList();
list.addAfter(2, 145);
int index2 = 2;
int value = 145;
System.out.println("After index = " + index2 + " " + "set value = " + value);
list.displayList();


System.out.println();
System.out.println("---Remove---");
list.displayList();
list.remove(3);
list.displayList();
System.out.println();
System.out.println("-----Reverse-----");
list.displayList();
list.reverceList();
list.displayList();

System.out.println();
System.out.println("----Remove all----");
list.displayList();
list.removeAll();
list.displayList();
list.addInt(45);
list.addInt(65);
list.addInt(78);
list.addInt(25);
list.displayList();

System.out.println();
System.out.println("-----Remove Value-----");
list.displayList();
list.removeValue2(65);
list.displayList();
	}
}
