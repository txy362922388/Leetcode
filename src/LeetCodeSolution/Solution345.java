public class Solution345 {
    
    public static boolean isVow(char c) {
        if (c == 'a' || c == 'A' ||
        c == 'e' || c == 'E' ||
        c == 'i' || c == 'I' || 
        c == 'o' || c == 'O' ||
        c == 'u' || c == 'U')
            return true;
        else 
            return false;
    }
    
    public static String reverseVowels(String s) {
        if (s == null || s.equals(""))
            return "";
        
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length - 1;
        while (i < j) {
            while (!isVow(c[i]) && i < c.length) {
                i++;
            }
            while (!isVow(c[j]) && j >= 0) {
                j--;
            }
            if (i < j) {
                char tmp = c[i];
                c[i] = c[j];
                c[j] = tmp;
            }
        }
        return new String(c);
    }
    
    public static void main(String[] args) {
    	String ss = "HelLo!!";
    	//System.out.println(reverseVowels(ss));
    	String res = ss.toLowerCase();
    	System.out.println(res);
    }
}