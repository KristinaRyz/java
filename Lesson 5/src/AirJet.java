
public class AirJet implements Moveable{
private String kind;

public AirJet(String kind) {
	super();
	this.kind = kind;
}

public String getKind() {
	return kind;
}

public void setKind(String kind) {
	this.kind = kind;
}

@Override
public void move(int speed) {
System.out.println("AirJet " + kind + " Fly in the sky"+ " whith speed " + speed);	
}

}
