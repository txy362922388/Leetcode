/**
 * Created by Evan on 2017/6/26.
 */
public class Solution8 {

    public int myAtoi(String str) {
        str = str.trim();
        char[] c = str.toCharArray();
        boolean isNeg = false;
        int i = 0;
        if (c[0] == '-') {
            isNeg = true;
            i = 1;
        }
        StringBuilder sb = new StringBuilder();
        for (;i < c.length; i++) {
            if (c[i] - '0' < 0 || c[i] - '0' > 9)
                break;
            sb.append(c[i]);
        }
        String max = String.valueOf(Integer.MAX_VALUE);
        if (sb.length() > max.length() && !isNeg)
            return Integer.MAX_VALUE;
        if (sb.length() > max.length() && isNeg)
            return Integer.MIN_VALUE;
        long val = Long.parseLong(sb.toString());
        if (val > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (val < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        int res = (int) val;
        return isNeg ? -res : res;

    }

}
