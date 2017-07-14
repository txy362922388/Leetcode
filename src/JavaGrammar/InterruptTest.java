
public class InterruptTest {
	public static void main(String[] args) {
		ThreadE t = new ThreadE("evan");
		t.start();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.interrupt();
	}

}

class ThreadE extends Thread {
	public ThreadE(String name) {
		super(name);
	}
	
	public void run() {

		int i = 0;
		while (!isInterrupted()) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			i++;
		}
	
		
	}
	
}