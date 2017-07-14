import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution125 {
    public static boolean isVaild(char c) {
        if (c - 'a' >= 0 && c - 'a' < 26 ||
            c - '0' >= 0 && c - '0' < 10)
            return true;
        return false;
    }	
	
    public static boolean isPalindrome(String s) {
        String ss = s.toLowerCase();
        char[] c = ss.toCharArray();
        int i = 0;
        int j = c.length - 1;
        while (i < j) {
            while (i < j && !isVaild(c[i])) {
                i++;
            }
            while (j > i && !isVaild(c[i])) {
                j--;
            }
            if ( i < j && c[i] != c[j])
                return false;
            i++;
            j--;
        }
        return true;
    
    	
    }
    public static void main(String[] args) {
    	//String s = "A man, a plan, a canal: Panama";
    	List<String> list = new ArrayList();
    	list.add("bca");
    	list.add("bac");
    	list.add("acb");
    	Collections.sort(list);
    	System.out.println(list.toString());
    }
}