import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Evan on 2017/6/27.
 */
public class Solution539 {

    public int helper(String t1, String t2) {
        String[] s1 = t1.split(":");
        String[] s2 = t2.split(":");
        int h1 = Integer.parseInt(s1[0]);
        int h2 = Integer.parseInt(s2[0]);
        int min1 = Integer.parseInt(s1[1]);
        int min2 = Integer.parseInt(s2[1]);
        int res = 0;
        if (h1 > h2) {
            res = (h1 - h2) * 60 + min1 - min2;
        } else if (h1 == h2) {
            res = min1 > min2 ? min1 - min2 : min2 - min1;
        } else {
            res = (h2 - h1) * 60 + min2 - min1;
        }
        return Math.min(24 * 60 - res,res);
    }

    public int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);
       int size = timePoints.size();
       int min = Integer.MAX_VALUE;
       for (int i = 1; i < size; i++) {
           min = Math.min(min,helper(timePoints.get(i),timePoints.get(i - 1)));
       }
       return min;
    }


}
