package LeetCodeSolution;

/**
 * Created by EVAN on 2017/7/16.
 */
public class Solution172 {
    public int trailingZeroes(int n) {
        int sum = 0;
        while (n != 0) {
            n = n / 5;
            sum += n;
        }
        return sum;
    }
}
