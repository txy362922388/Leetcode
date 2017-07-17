package LeetCodeSolution;

/**
 * Created by EVAN on 7/17/2017.
 */
public class Solution171 {
    public int titleToNumber(String s) {
        if (s.equals(""))
            return 0;
        char[] c = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += (c[i] - 'A' + 1) * Math.pow(26,c.length - 1 -  i);
        }
        return sum;
    }
}
