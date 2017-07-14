
public class ExcpetionTest {

	
//	public static void main(String[] args) throws Exception {
//		ExcpetionTest et = new ExcpetionTest();
//		et.methodA();
//	}
	
	public void methodA() throws Exception {
//		try {
//			methodB();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("catch in A");
//		}
		methodB();
	}
	
	public void methodB() throws Exception {
//		try {
//			methodC();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("catch in B");
//		}
		methodC();
	}
	
	
	public void methodC() throws Exception {
		System.out.println("In C");
		throw new Exception();
		
	}
	
	
	public static void main(String[] args) throws Exception   {
		ExcpetionTest et = new ExcpetionTest();
		et.methodA();
	}
}
