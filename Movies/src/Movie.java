
public class Movie {
	//data members, fills, properties
	private String title;
	private String director;
	private int year;
	
	public void setTitle(String title){
		if(title != null)
			this.title = title;
	}
	
	public String getTitle(){
		return title;
	
	}
	
	public void setDirector(String director){
		if(director != null)
			this.director = director;
	}
	
	public String getDirector(){
		return director; 
	}
	
	public void setYear(int year){
		if(year > 1899 && year <= 2016)
			this.year = year;
			}
	public int getYear(){
		return year;
	}
	
	public Movie(){
		System.out.println("Constructor");
	}
	
	public Movie(String title, String director, int year){
		this.setDirector(director);
		this.setTitle(title);
		this.setYear(year);
	}
	@Override
	public String toString(){
		String str = "Title:" + title + "Director:" + director + "Year: " + year;
				return str;
	}

	@Override
	public boolean equals(Object obj) {
 		return super.equals(obj);
	}
	
}
