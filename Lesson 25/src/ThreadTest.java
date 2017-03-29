
public class ThreadTest {

	public static void main(String[] args) throws Exception {
		System.out.println("Main thread started");
		MyThread t1 = new MyThread();
		t1.start();
		AnotherThread a1 = new AnotherThread();//nujno sozdat nov obj t.k. on delaet implements
		Thread t2 = new Thread(a1);
		t2.start();
		for(int i = 0; i<10; i++){
			System.out.println("Main thread :" + i);
		}
		t1.join();//garantirovano, 4to main zakonchitsya posle vseh thread
		t2.join();
		System.out.println("Main thread finished");
	}

}
