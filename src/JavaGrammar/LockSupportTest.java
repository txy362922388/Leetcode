import java.util.concurrent.locks.LockSupport;

public class LockSupportTest {
	
	public static Thread current;
	
	public static class ThreadX extends Thread {
		public ThreadX(String name) {
			super(name);
		}
		
		public void run() {
			System.out.println(Thread.currentThread().getName() + " wake up");
			System.out.println("before");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			LockSupport.unpark(current);
			System.out.println("after");
		}
	}
	
	
	public static void main(String[] args) {
		ThreadX t = new ThreadX("evan");
		current = Thread.currentThread();
		System.out.println(Thread.currentThread().getName() + " start a thread");
		t.start();
		System.out.println(Thread.currentThread().getName() + " blocked");
		LockSupport.park(current);
		System.out.println(Thread.currentThread().getName() + " continue");
	}
}
