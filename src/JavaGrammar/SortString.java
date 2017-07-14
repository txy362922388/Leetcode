import java.util.*;
import java.util.Map.Entry;

public class SortString {
	public static String convert(String s) {
		s.toLowerCase();
		char[] c = s.toCharArray();
		Arrays.sort(c);
		String res = new String(c);
		return res;
	}
	
    public static ArrayList<String> sortStrings(String[] str, int n) {
    	ArrayList<String> res = new ArrayList();
    	HashMap<String,Integer> hm = new HashMap();
    	for (int i = 0; i < str.length; i++) {
    		String temp = convert(str[i]);
    		if (hm.containsKey(temp)) {
    			int index = hm.get(temp);
    			if (str[i].compareTo(str[index]) < 0) {
    				hm.put(temp,i);
    			}
    		} else {
    			hm.put(temp, i);
    		}
    	}
    	Iterator it = hm.entrySet().iterator();
    	while (it.hasNext()) {
    		Entry e = (Entry<String, Integer>) it.next();
    		int val = (int) e.getValue();
    		res.add(str[val]);
    	}
    	Collections.sort(res);
    	return res;
    }
	public static void main(String[] args) {
		String[] s = {"ab","ba","abc","cba"};
		ArrayList<String> res = sortStrings(s,s.length);
		for (String ss : res) {
			System.out.println(ss);
		}
	}
    
    
}
