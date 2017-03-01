
public class Subject {
 private String name;
 private String location;
 
 public Subject(String name, String location){
	 setName(name);
	 setLocation(location);
 }
 
 public void setName(String name){
	 if(name != null)
	 this.name=name;
 }
 
 public String getName(){
	 return name;
 }
 
 public void setLocation(String location){
	 if(location != null)
	 this.location = location;
 }
 
 public String getLocation(){
	 return location;
 }
 
 public String toString(){
	 return "\tClass Name: " + name + "\t\tClass Location: " + "\t" +location;
 }
}