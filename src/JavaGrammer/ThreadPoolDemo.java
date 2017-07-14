import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


public class ThreadPoolDemo {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		ExecutorService es = Executors.newFixedThreadPool(7);
		for (int i = 0; i < 10; i++) {
			es.submit(t);
		}
	}
}
