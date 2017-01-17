
public class Person implements Moveable {
private String name;

public Person(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public void move(int speed) {
System.out.println("Person " + name + " walk step by step" + " whith speed " + speed);	
}

}
