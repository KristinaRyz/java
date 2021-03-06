
public class Product implements Comparable<Product>  {
	private String name;
	private double price;
	private int code;


	public Product(String name, double price, int code) {
		super();
		this.name = name;
		this.price = price;
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", \tprice=" + price + ", \tcode=" + code + "]";
	}
	@Override
	public int hashCode() {// dlya kajdogo elementa unikalnii hashCode
		//		return super.hashCode(); //automat
		return code;
	}
//	@Override
//	public int compareTo(Object obj) {//sortiruet po vozrastaniu
//		Product p = (Product) obj;//kasting
//		return this.code-p.code;//moi code compare s tem Obj 4to priwel
//	}

//	@Override
//	public int compareTo(Object obj) {//sortiruet po price
//		Product p = (Product) obj;//kasting
//		if(this.price>p.price)
//		return 1;
//		else if(this.price == p.price)
//			return 0;
//		return -1;
	
	@Override
	public int compareTo(Product p) {//sortiruet po price
//		Product p = (Product) obj;//kasting
		return this.name.compareTo(p.name);
	}


}
