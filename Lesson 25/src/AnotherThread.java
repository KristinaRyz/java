
public class AnotherThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Another thread started");

		for(int i = 0; i< 10; i++){
			System.out.println("Another thread : " + i);
		}
		System.out.println("Another thread finished");

	}

}
