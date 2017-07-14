/**
 * Created by Evan on 2017/6/30.
 */
public class Solution367 {
    public boolean isPerfectSquare(int num) {
        if (num <= 0)
            return false;
        if (num == 1)
            return true;
        long tmp = num;
        long i = 2;
        long j = tmp / 2;
        while (i <= j) {
            long mid = i + (j - i) / 2;
            long val = mid * mid;
            if (tmp ==  val)
                return true;
            else if (tmp < val) {
                j = mid - 1;
            }
            else {
                i = mid + 1;
            }
        }
        return false;
    }

}
