
public class Person {
private String name;
private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
}
public static void foo(){
	System.out.println("Ku-ky!");
}
public static void birthday(Person p){
	p.setAge(p.getAge()+1);
}
}
