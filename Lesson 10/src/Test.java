import javax.sound.midi.Synthesizer;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("Masha", 22);
		p1.setAge(44);
		System.out.println(p1);
		Person.birthday(p1);
		System.out.println(p1);
		Person.foo();
		
		Chinese[] china = new Chinese[1000000];
		for (int i = 0; i < china.length; i++) {
			china[i] = new Chinese();
		}
		System.out.println(china[50000]);
		System.out.println(china[0]);
		china[50000].setName("Mao");//pereimenovali
		System.out.println(china[50000]);
		System.out.println(china[0]);

		Cat[] telAviv = new Cat[10000000];
		for (int i = 0; i < telAviv.length; i++) telAviv[i] = new Cat();
		
		telAviv[5000].setHungry(true);
		System.out.println(telAviv[0]);
		
		Kolkhoz[] selsovet = new Kolkhoz[7];
		for (int i = 0; i < selsovet.length; i++)  selsovet[i] = new Kolkhoz();
		for (int i = 0; i < selsovet.length; i++)  selsovet[i].arbeit();
		System.out.println(Kolkhoz.zakroma);
		
			
		Person p2 = new Person("Victor", 45);
		System.out.println(p2);
	
	Employee emp = new Employee("Masha", 22, 15000);
   System.out.println(emp);
	}

	}
	
	


