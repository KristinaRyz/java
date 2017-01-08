
public class Animal { // eto class i ego opisanie
	private int age; // u kagdogo jivotnogo est eto svoistvo 
	private String name;
	private String kind;

	//constructor
	public Animal(){//4tobi ne propal napisat yavno
		System.out.println("Default constructor");
	}
	public Animal(int age, String name, String kind){//razli4ie po kol-vy parametrov, etot konst s 3 parametrami
		//	this.age = age; obrawaemsya 2 sposobami
		this.setAge(age);// plus v tom 4to set proveryaet
		this.setName(name);//eto vizov setters, ssilka na method setters
		this.setKind(kind);

	}

	//setters methods
	public void setAge(int age){
		if(age >= 0)
			this.age = age;
	}
	public void setName (String name){
		if(name != null)
			this.name= name;
	}
	public void setKind(String kind){
		if(kind != null)
			this.kind = kind;
	}
	//getters
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public String getKind(){
		return kind;
	}
	// custom methods
	public void display(){
		System.out.print("Name : " + name);
		System.out.print("\t Age : " + age);
		System.out.println("\tKind : " + kind);
	}

}
