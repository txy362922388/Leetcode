import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo implements Runnable{
	static CountDownLatch cdl = new CountDownLatch(10);
	static CountDownLatchDemo demo = new CountDownLatchDemo();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int time = (int)(Math.random() * 10);
		time *= 1000;
		System.out.println("Do my work in " + time + " ms");
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cdl.countDown();
	}
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			es.submit(demo);
		}
		cdl.await();
		System.out.println("finish!");
		es.shutdown();
	}
}
