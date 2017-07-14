import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionTest {
	public static Lock lock = new ReentrantLock();
	public static Condition c = lock.newCondition();
	public static void main(String[] args) {
		ConThread t = new ConThread("evan");
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName() + " before thread");
			t.start();
			System.out.println(Thread.currentThread().getName() + " blocked");
			c.await();
			} 
		catch(Exception e) {
			e.printStackTrace();
			}
		finally {
			lock.unlock();
		}
	}
static class ConThread extends Thread {
		public ConThread(String name) {
			super(name);
		}
		
		public void run() {
			try {
				lock.lock();
				System.out.println(Thread.currentThread().getName() + " nofity");
				c.signalAll();
				System.out.println(Thread.currentThread().getName() + " wake up");
			} finally {
				lock.unlock();
			}
		}
	}
}
