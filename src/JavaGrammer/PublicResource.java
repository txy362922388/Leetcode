/**
 * 公共资源类
 */
public class PublicResource {
	private int number = 0;

	/**
	 * 增加公共资源
	 */
	public synchronized void increace() {
		int add = (int)Math.random() * 5;
		while (number + add > 10) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		number = number + add;
		System.out.println(number);
		notify();
	}

	/**
	 * 减少公共资源
	 */
	public synchronized void decreace() {
		int rmv = (int)Math.random() * 5;
		while (number - rmv < 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		number = number - rmv;
		System.out.println(number);
		notify();
	}
}
