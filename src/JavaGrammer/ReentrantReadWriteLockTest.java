import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockTest {
	public static void main(String[] args) {
		Account a = new Account("123",7);
		User u = new User("evan",a);
		for (int i = 0; i < 3; i++) {
			u.read();
			u.write();
		}
	}
}

class User {
	String name;
	Account account;
	ReentrantReadWriteLock lock;
	
	public User(String name, Account account) {
		this.name = name;
		this.account = account;
		lock = new ReentrantReadWriteLock();
	}
	
	public void read() {
		new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					lock.readLock().lock();
					account.getMoney();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					lock.readLock().unlock();
				}
			}
			
		}).start();
	}
	
	public void write() {
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					lock.writeLock().lock();
					int num = (int) (Math.random() * 10);
					account.setMoney(num);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					lock.writeLock().unlock();
				}
			}
			
		}).start();
	}
	
}

class Account {
	String id;
	int money;
	
	public Account(String id,int money) {
		this.id = id;
		this.money = money;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public int getMoney() {
		System.out.println(Thread.currentThread().getName() + " get money " + money);
		return money;
	}
	
	public void setMoney(int money) {
		System.out.println(Thread.currentThread().getName() + " set money " + money);
		this.money = money;
	}
}