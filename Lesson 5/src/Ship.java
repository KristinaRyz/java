
public class Ship implements Moveable{
private String title;

public Ship(String title) {
	super();
	this.title = title;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

@Override
public void move(int speed) {
System.out.println("Ship " + title + "sailing in ocean" + " whith speed " + speed);	
}


}
