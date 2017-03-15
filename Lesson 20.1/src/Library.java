import java.util.*;
import java.util.Map.Entry;
public class Library {
	
	  private String name;
	  private String address;
	  
	  private TreeMap<Book,Integer> stock =
			           new TreeMap<Book,Integer>();
	  
	  public Library(String name,String address){
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
	public void addBook(Book b){
		Set<Book> books = stock.keySet();//vitawili set books
		for(Book bk : books){//po kagdoi knige
			if(bk.equals(b)){//sravnivau
				int q = stock.get(bk);//kol-vo knig v stock
				q++;
				stock.replace(bk, q);
				return;
			}
		}
		stock.put(b, 1);
	}
//	public void display(){
//		Set<Entry<Book, Integer>> entries = stock.entrySet();//java.util, raspe4atali set objectov Entry(u nego est 2 polya Book i Integer)
//		for(Entry<Book, Integer> e: entries){
//			System.out.println(e.getKey() + "\t Items : " + e.getValue());//kniga pe4at i kol-vo
//		}
//		
//	}
	
	public void display(){
		Set<Book> books = stock.keySet();//vitaskivaem vse knigi
		for(Book bk: books){    //dlya kagd knigi           
//			int q = stock.get(bk);
//			System.out.println(bk + " Items : " + q);
			System.out.println(bk + " Items : " + stock.get(bk));
		}
	}
	public void removeBook(String author, String title){
		Set<Book> books = stock.keySet();//vitawili vse kley iz kolleccii
				for(Book bk: books){//idem po vsei kolleccii
				if(bk.getTitle().equalsIgnoreCase(title) && bk.getAuthor().equalsIgnoreCase(author)){
					int q = stock.get(bk);//skolko wtuk knig est?
					if(q > 1){//esli etih knig bolwe 1
						q--;//umenwaem na 1
						stock.replace(bk, q);//pe4at
					}else{ 
						stock.remove(bk);//esli odna v kollekcii remove
							
						}
						return;
					}
				}
System.out.println("This book doesn't exist");
	}
	
	public int getTotalBooks(){//pe4at obwee kil-vo bnig
		int res = 0;//kol-vo 0
		Collection<Integer> values = stock.values();//vitaskivaem vse values
		for(Integer i: values){//pechat kagdoe zna4enie
			res += i;//plusovat
		}
	return res;//pe4at res
	}
	
}
	
	

