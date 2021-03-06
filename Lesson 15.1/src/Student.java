import java.util.*;

public class Student {
	private String name;
	private String degreeType;
	private ArrayList<Subject> list= new ArrayList<Subject>();

	public Student (String name, String degreeType){
		this.name = name;
		this.degreeType = degreeType;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDegreeType() {
		return degreeType;
	}
	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}

	public void addSubject(Subject sub){
		list.add(sub);
	}

	public void displayStudent(){   
		System.out.println("Name: \t\t" + name);
		System.out.println("Degree Type: \t" + degreeType);
		System.out.println("Classes: ");

		for(int i = 0; i< list.size(); i++){
			System.out.println(list.get(i));
		}

	}


}
