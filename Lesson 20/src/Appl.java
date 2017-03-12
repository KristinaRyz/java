//package qa10_less20_skype;

public class Appl {

	public static void main(String[] args) {
		User u1 = new User("petya", "p1");
		User u2 = new User("petya", "p2");
		User u3 = new User("vanya", "v1");
		User u4 = new User("sveta", "s1");
		
		Auth users = new Auth();
		System.out.println(users.addUser(u1));
		System.out.println(users.addUser(u2));
		System.out.println(users.addUser(u3));
		System.out.println(users.addUser(u4));
		
	 
		users.display();
		
		users.deleteUser(u2);
		users.display();
		users.deleteUser(new User("anya", "superpass"));
		users.display();
		users.replacePassword(new User("vanya","v2"));
		users.display();
		users.replacePassword(new User("vanya","v3"));
		users.display();
		users.replacePassword(new User("vanya","v3"));
		users.display();
		users.replacePassword(new User("vanya","v4"));
		users.display();
		users.replacePassword(new User("vanya","v5"));
		users.printUserPasswords(u3);
	}

}