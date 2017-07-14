
interface A {
	public void method();
}

class B implements A {
	public void method() {
		System.out.println("I am B");
	}
	
}

class Proxy implements A {
	B b;
	public Proxy() {
		b = new B();
	}
	public void method() {
		before();
		b.method();
		after();
	}
	public void before() {
		System.out.println("before");
	}
	public void after() {
		System.out.println("after");
	}
	
}


public class ProxyTest {
	public static void main(String[] args) {
		A a = new Proxy();
		a.method();
	}
}
