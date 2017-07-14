/**
 * 生产者线程，负责生产公共资源
 */
public class ProducerThread implements Runnable {
	private PublicResource resource;

	public ProducerThread(PublicResource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			resource.increace();
		}
	}
}
/**
 * 消费者线程，负责消费公共资源
 */
