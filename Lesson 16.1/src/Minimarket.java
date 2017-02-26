import java.util.*;

public class Minimarket {
	private String name;
	private String address;
//	private HashSet<Product> stock = new HashSet<Product>();
//	private LinkedHashSet<Product> stock = new LinkedHashSet<Product>();
	private TreeSet<Product> stock = new TreeSet<Product>();
	public Minimarket(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public void addProduct(Product p){
		stock.add(p);
	}

	public void displayMinimarket(){
		System.out.println("Minimarket name : \t" + name);
		System.out.println("Address : \t\t" + address);
		System.out.println("Products count :\t " + stock.size());
		System.out.println("====================================");
		System.out.println("Products  set :  ");
		for(Product p: stock){ // for each
			System.out.println(p);
		}
	}



}
