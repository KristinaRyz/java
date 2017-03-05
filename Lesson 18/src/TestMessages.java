
public class TestMessages {

	public static void main(String[] args) {
		Organization org1 = 
				new Organization("Tel-Ran", "Plaut 10",
						"08-9479977","tel-ran@tel-ran.co.il", 
						"08-9478787");
		Message m1 = new Message("01.03.2017","Stam",
				             "Vlad","Very,very well");
		Message m2 = new Message("28.02.2017","Ne Stam",
	             "Igor","not so well");
		Message m3 = new Message("23.02.2017","OK",
	             "Tatiana","not so good");
		org1.addMessage(m3);
		org1.addMessage(m2);
		org1.addMessage(m1);
		org1.displayMessages();
		System.out.println("========================");
		org1.sortMessagesBySender();
		org1.displayMessages();
		org1.sortMessagesByNumber();
		org1.displayMessages();
	}

}
