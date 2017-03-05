import java.util.Comparator;

public class ComparatorMessagesBySender 
                implements Comparator<Message>{

	@Override
	public int compare(Message msg1, Message msg2) {
		String sender1 = msg1.getSenderName();
		String sender2 = msg2.getSenderName(); 
				return sender1.compareToIgnoreCase(sender2);
	}

}
