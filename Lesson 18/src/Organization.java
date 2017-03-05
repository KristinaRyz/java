import java.util.*;

public class Organization {
    private String name;
    private Contact contactData;
    private LinkedList<Message> messages =
    		             new LinkedList<Message>();
    private int messageCount = 1;
    
    public Organization(String name,String address,
    		String phone,String email,String fax){
    	this.name = name;
    	contactData = new Contact(address, 
    			          phone, email, fax);
    }
    public String getName(){
    	return name;
    }
    public String getAddress(){
    	return contactData.getAddress();
    }
    public String getPhone(){
    	return contactData.getPhone();
    }
    public String getEmail(){
    	return contactData.getEmail();
    }
    public String getFax(){
    	return contactData.getFax();
    }
    public void changeAddress(String address){
    	contactData.setAddress(address);
    }
    public void changePhone(String phone){
    	contactData.setPhone(phone);
    }
 public void changeEmail(String email){
   contactData.setEmail(email);   
}
 public void changeFax(String fax){
	 contactData.setFax(fax);
 }
 public void addMessage(Message message){
	 message.setNumber(messageCount);
	 messageCount++;
	 messages.add(message);
 }
 public void displayMessages(){
	 System.out.println("Total messages : " 
                       + messages.size());
	 System.out.println("Messages list :");
	 int count = 1;
	 for(Message m : messages){
		 System.out.println(count + "." + m);
		 count++;
	 }
	 
 }
 public void sortMessagesByDate(){
	 Collections.sort(messages);
 }
 public void sortMessagesByNumber(){
	 ComparatorMessagesByNumber comp = new ComparatorMessagesByNumber();
	 Collections.sort(messages,comp);
 }
 public void sortMessagesByTopic(){
	 ComparatorMessagesByTopic comp =  new ComparatorMessagesByTopic();
	 Collections.sort(messages,comp);
 }
 public void sortMessagesBySender(){
	 ComparatorMessagesBySender comp =  new ComparatorMessagesBySender();
	 Collections.sort(messages,comp);
 }
}




