import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProConWithCondition {
	
	public static Lock lock = new ReentrantLock();
	public static Condition full = lock.newCondition();
	public static Condition empty = lock.newCondition();
	
	public static class Storage {
		Queue<Integer> q = new LinkedList();
		
		public void put() {
			try {
				lock.lock();
				while (q.size() == 5) {
					full.await();
				}
				empty.signal();
				q.offer(1);
				System.out.println(q.size());
			} catch(Exception e) {
				e.printStackTrace();
				} finally {
				lock.unlock();
			}
		}
		
		public void get() {
			try {
				lock.lock();
				while (q.size() == 0) {
					empty.await();
				}
				full.signal();
				q.poll();
				System.out.println(q.size());
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				lock.unlock();
			}
		}
	}
	
	public static class Pro {
		Storage s;
		public Pro(Storage s) {
			this.s = s;
		}
		public void produce () {
			new Thread(new Runnable(){

				@Override
				public void run() {
					// TODO Auto-generated method stub
					s.put();
				}
				
			}).start();
		}
	}
	
	public static class Con {
		Storage s;
		public Con(Storage s) {
			this.s = s;
		}
		
		public void consum() {
			new Thread(new Runnable(){

				@Override
				public void run() {
					// TODO Auto-generated method stub
					s.get();
				}
				
			}).start();
			
			}
		}
	
	
	
	
	
	public static void main(String[] args) {
		Storage s = new Storage();
		Pro p = new Pro(s);
		Con c = new Con(s);
		p.produce();
		p.produce();
		c.consum();
		c.consum();
		c.consum();
		c.consum();
		p.produce();
		p.produce();
		p.produce();
	}
}
