
public class Magazine implements Readable {
	private String title;

	public Magazine(String title) {
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
	public void read(int quantity) {
		System.out.println("Magazine " + title + " read " + quantity +" times in a month");		
		// discovery 
	}




}