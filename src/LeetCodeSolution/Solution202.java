package LeetCodeSolution;

import java.util.HashSet;

/**
 * Created by EVAN on 2017/7/14.
 */
public class Solution202 {
    public int helper(int n) {
        int sum = 0;
        while (n != 0) {
            int tmp = n % 10;
            sum += tmp * tmp;
            n = n / 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> h = new HashSet<>();
        while (!h.contains(n)) {
            h.add(n);
            n = helper(n);
            if (n == 1)
                return true;
        }
        return false;
    }
}
