
public class Car {

private	String model;
private int year;

public Car(String model, int year){
	this.model = model;
	this.year = year;
}

public void setModel(String model){
this.model = model;
}
public String getModel(){
	return model;
}

public void setYear(int year){
	this.year = year;
}
 public int getYear(){
	 return year;
 }
 @Override
 public String toString(){
	 return "Car [model = " + model + " , year = " + year + "]"; 
 }
 
}
