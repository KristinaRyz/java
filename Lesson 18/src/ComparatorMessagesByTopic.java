import java.util.Comparator;

public class ComparatorMessagesByTopic 
                      implements Comparator<Message>{

	@Override
	public int compare(Message msg1, Message msg2) {
	 String topic1 = msg1.getTopic();
	 String topic2 = msg2.getTopic();
		return topic1.compareToIgnoreCase(topic2);
	}
	

}
