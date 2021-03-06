public class TestBooks {

	public static void main(String[] args) {
		
		Books[] booksArray = new Books[5];
		
		Books b1 = new Books();
		b1.setAuthor("Dale Carnegie");
		b1.setTitle("HOW TO WIN FRIENDS AND INFLUENCE PEOPLE");
		b1.setPages(500);
		b1.setISBN(456123456);
		b1.display();
		
		booksArray[0]=b1;
		
		Books b2 = new Books();
		b2.setAuthor("Peter Drucker");
		b2.setTitle("MANAGEMENT: TASKS, RESPONSIBILITIES, PRACTICES");
		b2.setPages(800);
		b2.setISBN(987456321);
		b2.display();
		
		booksArray[1]=b2;
		
		
		Books b3 = new Books();
		b3.setAuthor("Stephen R. Covey");
		b3.setTitle("7 HABITS OF HIGHLY EFFECTIVE PEOPLE: POWERFUL LESSONS IN PERSONAL CHANGE");
		b3.setPages(400);
		b3.setISBN(951783654);
		b3.display();
		
		booksArray[2]=b3;
		
		Books b4 = new Books();
		b4.setAuthor("Peter Drucker");
		b4.setTitle("THE ESSENTIAL DRUCKER");
		b4.setPages(350);
		b4.setISBN(84629513);
		b4.display();
		
		
		booksArray[3]=b4;
		
		Books b5 = new Books();
		b5.setAuthor("David Allen");
		b5.setTitle("GETTING THINGS DONE: THE ART OF STRESS-FREE PRODUCTIVITY");
		b5.setPages(750);
		b5.setISBN(26481593);
		b5.display();
		
		
		booksArray[4]=b5;
		
		
		
		findMaxPages(booksArray);
		
	}
	
	public static void findMaxPages(Books[] booksArray){
		int maxPages=0;
		int maxPagesPosition=0;
		for (int i = 0; i < booksArray.length; i++) {
			if(booksArray[i].getPages()>maxPages){
				maxPages=booksArray[i].getPages();
				maxPagesPosition=i;
			}
		}
		System.out.println("Max pages in the book:");
		booksArray[maxPagesPosition].display();
	}

}
