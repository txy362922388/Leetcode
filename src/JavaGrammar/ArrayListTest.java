import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Vector;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("a");
		a.add("b");
		a.add("c");
		String[] b = (String[])a.toArray(new String[0]);
		//System.out.println(Arrays.toString(b));
		Vector<Integer> v = new Vector(10,5);
		for (int i = 0; i < 11; i++) {
			v.add(7);
		}
		//System.out.println(v.size() + " " + v.capacity());
		
		HashMap<String,Integer> hm = new HashMap();
		hm.put("a", 1);
		hm.put("b", 2);
		hm.put("c", 3);
		Iterator e = hm.entrySet().iterator();
		while(e.hasNext()) {
			Entry m = (Entry) e.next();
			System.out.println(m.toString());
		}
	}
}
