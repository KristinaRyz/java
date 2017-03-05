
public class Message implements Comparable<Message> {
   private int number;
   private String date;
   private String topic;
   private String senderName;
   private String messageText;
   
   
   
public Message(String date, String topic, 
		String senderName, String messageText) {
	super();
	this.date = date;
	this.topic = topic;
	this.senderName = senderName;
	this.messageText = messageText;
}
public String getTopic(){
	return topic;
}
public String getSenderName(){
	return senderName;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getDate() {
	return date;
}
public String getMessageText() {
	return messageText;
}
@Override
public String toString() {
	return "Message [number=" + number + ", date=" + date + ", topic=" + topic + ", senderName=" + senderName
			+ ", messageText=" + messageText + "]";
}
@Override
public int compareTo(Message msg) {
 	return this.date.compareToIgnoreCase(msg.date);
}
  
   
}
