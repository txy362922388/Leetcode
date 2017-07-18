package LeetCodeSolution;

/**
 * Created by EVAN on 2017/7/18.
 */
public class Solution400 {
    public int findNthDigit(int n) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (i <= n) {
            sb.append(i);
            i++;
        }
        return sb.charAt(n) - '0';
    }
}
