package inputoutput.testcar;

public class Car {
private String model;
private int year;
private int id;

public Car(String model, int year, int id) {
	super();
	this.model = model;
	this.year = year;
	this.id = id;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return model + " ; " + year + " ; " + id ;
 }
@Override
public boolean equals(Object obj) {
	if(obj instanceof Car){
		Car car = (Car)obj;
		if(this.model.equalsIgnoreCase(car.model)&& this.year==car.year&& this.id==car.id){
			return true;
		}else{
			return false ;
		}
	}else{
		return false;
	}
}

}