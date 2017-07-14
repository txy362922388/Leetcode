class WaitThread extends Thread {
	public WaitThread(String name) {
		super(name);
	}
	
	public void run() {
		//synchronized (this) {
			System.out.println(Thread.currentThread().getName() + " call notify");
			//notify();
			while(true);
		//}
	}
	
}
public class WaitAndNotifyTest {
	public static void main(String[] args) throws InterruptedException {
		WaitThread t = new WaitThread("evan");
		synchronized (t) {
			System.out.println("start in " + WaitThread.currentThread().getName());
			t.start();
			
			System.out.println("notify in " + WaitThread.currentThread().getName());
			t.wait();
			
			System.out.println("end in " + WaitThread.currentThread().getName());
		}
	}
}
