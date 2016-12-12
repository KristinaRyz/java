
public class Person {
	//data members, properties, 
	private String name; // teper k nim nlzya dobrat'sya
	private int id;
	private int age;
	
	// setters
	public void setName(String n){
		if(n != null)
			name = n;
		else
			System.out.println("Error: wrong name -> " + n);
	}
	
	public void setID (int i) {
		if(i>0)
			id = i;
		else 
			System.out.println("Error: wrong ID -> " + i);
	}
	
	public void setAge(int a) {
		if(a>0)
			age = a;
		else 
			System.out.println("Error: wrong age -> " + a);
		

	}
	//Getters
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}
	public int getAge(){
		return age;
	}
	//custom methods
	public void display(){
		System.out.print("Name : " + name);
		System.out.print("\tID: " + id);
		System.out.println("\tage: " + age);
	}
}
