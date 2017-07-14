import java.util.LinkedList;
import java.util.Queue;

public class CCTest {
	public static void main(String[] args) {
		Storage s = new Storage();
		Cons c = new Cons(s);
		Pro p = new Pro(s);
		c.consum();
		c.consum();
		p.produce();
		c.consum();
		p.produce();
		p.produce();
		p.produce();
	}
}

class Storage {
	Queue<Integer> q = new LinkedList();
	
	public synchronized void add() {
		while (q.size() == 3) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		notifyAll();
		int time = (int) (Math.random() * 5) * 1000;
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		q.offer(1);
		System.out.println(q.size());
	}
	
	public synchronized void get() {
		while (q.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		notifyAll();
		int time = (int) (Math.random() * 5) * 1000;
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		q.poll();
		System.out.println(q.size());
	}
}

class Cons {
	Storage s;
	public Cons (Storage s) {
		this.s = s;
	}
	public void consum() {
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				s.get();
			}
			
		}).start();;
	}
}

class Pro {
	Storage s;
	public Pro (Storage s) {
		this.s = s;
	}
	public void produce() {
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				s.add();
			}
			
		}).start();
	}
	
}

