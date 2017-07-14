class Count {
	public void method1() {
		synchronized(this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(i + " in synchronized");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public void method2() {
		synchronized(this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(i + " in unsynchronized");
			    try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}


public class ThreadTest2 {
	public static void main(String[] args) {
		final Count c = new Count();
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				c.method1();
			}
			
		});
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				c.method2();
			}
			
		});
		t1.start();
		t2.start();
	}
}
