
public class WebSite implements Readable{
	private String url;

	public WebSite(String url) {
		super();
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public void read(int quantity) {
		System.out.println("Website " + url + " read " + quantity +" times in a month");	
	}


}
