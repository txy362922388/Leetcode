/**
 * Created by EVAN on 2017/7/14.
 */
public class Solution598 {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops == null || ops.length == 0 || ops[0] == null || ops[0].length == 0)
            return m * n;
        int xmin = Integer.MAX_VALUE;
        int ymin = Integer.MAX_VALUE;
        for (int i = 0; i < ops.length; i++) {
            xmin = Math.min(ops[i][0],xmin);
            ymin = Math.min(ops[i][1],ymin);
        }
        return xmin * ymin;

    }
}
