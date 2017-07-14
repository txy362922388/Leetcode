/**
 * Created by EVAN on 2017/7/14.
 */
public class Solution326 {
    public boolean isPowerOfThree(int n) {
        if (n <= 0)
            return false;
        double x = Math.log10(n) / Math.log10(3);
        int y = (int)x;
        return x - y == 0;
    }
}
