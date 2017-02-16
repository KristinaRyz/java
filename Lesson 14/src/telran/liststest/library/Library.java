package telran.liststest.library;

import java.util.ArrayList;

import telran.liststest.testclasses.Book;

public class Library {
	private String name;
	private String address;
	private ArrayList<Book> stock = new ArrayList<Book>();//colection book//click po type (import java.util.ArrayList), click po Book(import telran.liststest.testclasses.Book);)

	public Library(String name, String address) {
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

	public void addBook(Book bk){
		stock.add(bk);
	}
	
	public int booksCount(){
		return stock.size();
	}
	public void removeBook(int isbn){
		for(int i=0; i<stock.size(); i++){
	  int j = stock.get(i).getIsbn();	
			if(j == isbn){
				stock.remove(i);
			}
		}
	}
	public void displayLibrary(){
		System.out.println("Library name : " + name);
		System.out.println("Address : " + address);
		System.out.println("Books count : " + stock.size());
		System.out.println("Books list :");
		for(int i = 0; i< stock.size(); i++){
			System.out.println(stock.get(i));
		}
	}
}
