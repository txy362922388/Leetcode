import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionTest {
	public static void main(String[] args) {
		Map m = new HashMap();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		Object[] array = list.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		String a = "abc";
		String b = new String("abc");
		String c = "a" + "bc";
		boolean bool1 = (a==b);
		boolean bool2 = (a==c);
		System.out.println(bool1 + " " + a.equals(b));
		System.out.println(bool2 + " " + a.equals(c));
	}
}
