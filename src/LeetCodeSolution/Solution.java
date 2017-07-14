import java.util.*;
public class Solution {
	
	public static void backtrack(List<List<String>> res, List<String> sub, String[] s) {
		if (sub.size() == s.length) {
			List<String> temp = new ArrayList<String>(sub);
			res.add(temp);
		}
		for (int i = 0; i < s.length; i++) {
			if (sub.contains(s[i]))
				continue;
			sub.add(s[i]);
			backtrack(res,sub,s);
			sub.remove(sub.size() - 1);
		}
	}
	
	
    public static ArrayList<String> Permutation(String str) {
    	String[] s = new String[str.length()];
    	for (int i = 0; i < str.length(); i++) {
    		s[i] = "" + str.charAt(i);
    	}
    	List<List<String>> res = new ArrayList<List<String>>();
    	backtrack(res,new ArrayList<String>(),s);
    	List<String> val = new ArrayList<String>();
    	for (int i = 0; i < res.size(); i++) {
    		List<String> sub = res.get(i);
    		StringBuilder sb = new StringBuilder();
    		for (int j = 0; j < sub.size(); j++) {
    			sb.append(sub.get(j));
    		}
    		val.add(sb.toString());
    	}
		return (ArrayList<String>) val;
    }
    public static void main(String[] args) {
    	String s = "abc";
    	ArrayList<String> res = new ArrayList<String>();
    	res = Permutation(s);
    	for (int i = 0; i < res.size(); i++) {
    		System.out.println(res.get(i));
    	}
    }
}