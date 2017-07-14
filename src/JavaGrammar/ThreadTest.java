
public class ThreadTest implements Runnable {
	
//	public ThreadTest(String name) {
//		super(name);
//	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.println(Thread.currentThread().getName());
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println(i + " " + Thread.currentThread().getName());
			}
		}
	}
	
	public static void main(String[] args) {
		Runnable thread = new ThreadTest();
		Thread t1 = new Thread(thread,"thread1");
		Thread t2 = new Thread(thread,"thread2");
		t1.start();
		t2.start();
	}
	
}
