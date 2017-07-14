
public class JoinTest {
	public static void main(String[] args) {
		Father thread = new Father("father");
		thread.start();
	}
}

class Father extends Thread {
	public Father(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("start in " + Thread.currentThread().getName());
		Son s = new Son("son");
		s.start();
		try {
			System.out.println("wait join in " + Thread.currentThread().getName());
			s.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end in " + Thread.currentThread().getName());
	}
}

class Son extends Thread {
	public Son(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("start in " + Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end in " + Thread.currentThread().getName());
		
	}
}