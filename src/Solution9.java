/**
 * Created by EVAN on 2017/7/14.
 */
public class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        long target = x;
        long std = x;
        int count = 0;
        while (x != 0) {
            x = x / 10;
            count++;
        }
        long reverse = 0;
        while (target != 0) {
            count--;
            int res = (int)target % 10;
            reverse += res * Math.pow(10,count);
            target = target / 10;
        }
        return std == reverse;
    }
}
