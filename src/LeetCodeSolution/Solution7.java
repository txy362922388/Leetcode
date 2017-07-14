/**
 * Created by EVAN on 2017/7/14.
 */
public class Solution7 {
    public int reverse(int x) {
        boolean isPow = x >=0;
        long tmp = (long) x;
        tmp = Math.abs(tmp);
        StringBuilder sb = new StringBuilder(String.valueOf(tmp));
        String rvs = sb.reverse().toString();
        long res = Long.parseLong(rvs);
        if (!isPow) res = -res;
        if (isPow && res > Integer.MAX_VALUE || !isPow && res < Integer.MIN_VALUE)
            return 0;
        return (int) res;
    }
}
