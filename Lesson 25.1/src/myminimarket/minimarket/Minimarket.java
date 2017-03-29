package myminimarket.minimarket;
import java.util.*;
import myminimarket.product.Product;
public class Minimarket {
	private String name;
	private String adress;
	private TreeMap<Product, Integer> stock = new TreeMap<Product,Integer>();

	public Minimarket(String name, String adress) {
		super();
		this.name = name;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void addProduct(Product pr, int quantity){
		Set<Product> keys = stock.keySet();
		for(Product p: keys){
			if(p.equals(pr)){
				int q = stock.get(p);
				q+=quantity;
				stock.replace(p, q);
				return;
			}
		}
		stock.put(pr, quantity);
	}

	public void display(){
		System.out.println("Name : " + name);
		System.out.println("Adress : " + adress);
		System.out.println("============");
		Set<Product> keys = stock.keySet();
		for(Product p : keys){
			System.out.println(p + " -> " + stock.get(p));
		}
	}
	public void removeProduct(Product pr){
		Set<Product> keys = stock.keySet();//vitawili vse kley iz kolleccii
				for(Product p: keys){//idem po vsei kolleccii
				if(pr.getCode()==p.getCode()){
					int q = stock.get(pr);//skolko wtuk  est?
					if(q > 1){//esli bolwe 1
						q--;//umenwaem na 1
						stock.replace(pr, q);//pe4at
					}else{ 
						stock.remove(pr);//esli odna v kollekcii remove
							
						}
						return;
					}
				}
System.out.println("This product doesn't exist");
	}
	public int getTotalProduct(){//pe4at obwee kil-vo 
		int res = 0;//kol-vo 0
		Collection<Integer> values = stock.values();//vitaskivaem vse values
		for(Integer i: values){//pechat kagdoe zna4enie
			res += i;//plusovat
		}
	return res;//pe4at res
	}
	
}
