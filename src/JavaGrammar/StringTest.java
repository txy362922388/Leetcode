import java.lang.ref.SoftReference;

public class StringTest {
	public static void main(String[] args) {
		String a = new StringBuilder("computer").append("science").toString();
		System.out.println(a == a.intern());
		String b = new StringBuilder("ja").append("va").toString();
		System.out.println(b == b.intern());
		String c = new StringBuilder("pub").append("lic").toString();
		System.out.println(c == c.intern());
		long res = 99999999 * 999999999;
		System.out.println(res);
		System.gc();
        
	}
}
