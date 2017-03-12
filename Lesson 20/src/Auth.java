//package qa10_less20_skype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public class Auth {
	HashMap<String, LinkedHashSet<String>> listUsers = new HashMap<String, LinkedHashSet<String>>();

	public boolean addUser(User user) {
		LinkedHashSet<String> passwords = new LinkedHashSet<String>();
		passwords.add(user.getPassword());
		
		if(listUsers.containsKey(user.getLogin())){
			return false;
		}else{
			listUsers.put(user.getLogin(), passwords);
			return true;
		}
//		if (listUsers.put(user.getLogin(), passwords) == null){
//				return true;
//		}
//		return false;

	}
	
	
	public boolean deleteUser(User user) {
		if(listUsers.containsKey(user.getLogin())){
			listUsers.remove(user.getLogin());
			System.out.println("removed");
			return true;
		}else{
			System.out.println("cant remove");
			return false;
		}
	}

	public boolean replacePassword(User user){
		
		if(listUsers.containsKey(user.getLogin())){
			LinkedHashSet<String> passwords =listUsers.get(user.getLogin());
			if(passwords.contains(user.getPassword())){
				System.out.println("pass allready used");
				return false;
			}else{
				passwords.add(user.getPassword());
				System.out.println("pass changed");
				 listUsers.replace(user.getLogin(), passwords);
				 return true;
			}	
			
		}else{
			System.out.println("cant replace password");
			return false;
		}
	}
	
	
	public boolean printUserPasswords(User user){
		
		if(listUsers.containsKey(user.getLogin())){
			LinkedHashSet<String> passwords =listUsers.get(user.getLogin());
			System.out.println(user.getLogin()+" has passwords : ");
			for (String string : passwords) {
				System.out.println(string);
			}
				 return true;
		
			
		}else{
			System.out.println("no such user in db");
			return false;
		}
	}
	
	public void display() {
		System.out.println("_______________________");
		Set<Entry<String, LinkedHashSet<String>>> users = listUsers.entrySet();
		for(Entry<String, LinkedHashSet<String>> user:users){
			ArrayList<String> listPass= new ArrayList<String>(user.getValue());
			System.out.println(user.getKey()+"="+listPass.get(listPass.size()-1));
		}

	}
	

}
