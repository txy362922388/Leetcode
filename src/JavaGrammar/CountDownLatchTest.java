import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
	public static CountDownLatch cd = new CountDownLatch(5);
	
	public static class CdThread extends Thread {
		public void run() {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cd.countDown();
		}
	}
	
	public static void main(String[] args) {
		for (int i = 0 ; i < 5; i++) {
			CdThread t = new CdThread();
			t.start();
		}
		
		try {
			cd.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("after");
	}
}
