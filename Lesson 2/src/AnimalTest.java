
public class AnimalTest {

	public static void main(String[] args) {
//Animal an1;//ssilka type animal smotrit null

		Animal an1 = new Animal(); // ssilka an1 type Animal smotrit na age = 0, name = null, kind = null;
//an1.age = -12;//vozmognost napryamyu dobratsya
//an1.name = null;
//nujna inkapsulyaciya, vozvrat i piwem private vsem properties

an1.setAge(9);
an1.setName("Tiger");
an1.setKind("Mammals");//mlekopitauwie

Animal an2 = new Animal(); // object 2 classa Animal
an2.setAge(7);
an2.setName("Dolfin");
an2.setKind("Mammals");

Animal an3 = an1;//object 3 smotrit na object 1
Animal an4 = an2;
// 2 objecta classa Animal i 4etire ssilki 

an3 = new Animal();//novaya ssilka //po default constructor
int age = an2.getAge();// emu 7 let kak i u an2
an3.setAge(age);
an3.setName("Cat");
an3.setKind("Mammals");

Animal an5 = new Animal(10,"Dog","Mammals"); // stroim object po constructor s 3 parametrami
an5.display();

//Fish f1 = new Fish();

	}

}