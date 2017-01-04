
public class Computer {
   private int memory;
   private int disk;
   private String company;
    
   
public Computer(int memory, int disk, 
		                  String company) {
	super();
	this.memory = memory;
	this.disk = disk;
	this.company = company;
}

public int getMemory() {
	return memory;
}
public void setMemory(int memory) {
	this.memory = memory;
}
public int getDisk() {
	return disk;
}
public void setDisk(int disk) {
	this.disk = disk;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}

@Override
public String toString() {
	String str = "Company : " + company	+ " Memory : " + memory	+ " Disk : " + disk;
	return str;
}



@Override
public boolean equals(Object obj) {
    Computer comp = (Computer)obj; //kasting
    
	if(this.disk == comp.disk//primitive
		&& this.memory == comp.memory
		&& this.company.equals(comp.company)){ //eto string po raznomy sravnivaem
		return true;
	}
	return false;
}

   
   
}
