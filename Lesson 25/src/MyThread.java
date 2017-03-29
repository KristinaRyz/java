
public class MyThread extends Thread{

	@Override 
	// sourse/override run
	public void run() {
		//	super.run();
		System.out.println("My thread started");

		for(int i = 0; i< 10; i++){
			System.out.println("My thread : " + i);
		}
		System.out.println("My thread finished");

	}

}
