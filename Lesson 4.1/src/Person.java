
public abstract class Person {
	private int id;
	private String name;

	public Person() {

	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String toString(){
		String str = "Name: "+ name +"\t Id: "+ id;
		return str;
	}

	@Override
	public boolean equals(Object obj) {
		Person pr = (Person) obj;
		if(this.id == pr.id)
			return true;
		return false;
	}

//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		Person pr = new Person(id,name);
//		return pr;}


}
