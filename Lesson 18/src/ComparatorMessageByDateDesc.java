import java.util.Comparator;

public class ComparatorMessageByDateDesc
         implements Comparator<Message>{

	@Override
	public int compare(Message msg1, Message msg2) {
		String date1 = msg1.getDate();
		String date2 = msg2.getDate();
		return date2.compareToIgnoreCase(date1);
	}

}
