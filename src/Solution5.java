/**
 * Created by Evan on 2017/6/23.
 */
public class Solution5 {
    private int max ;
    private String res;

    public void helper(String s, int i, int j ) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        int curSize = j - i - 1;
        if (curSize > max) {
            res = s.substring(i + 1, j);
            max = curSize;
        }
    }

    public String longestPalindrome(String s) {
        if (s.equals(""))
            return "";
        if (s.length() == 1)
            return s;
        for (int i = 0; i < s.length() - 1; i++) {
            helper(s,i,i);
            helper(s,i,i + 1);
        }
        return res;
    }
}
