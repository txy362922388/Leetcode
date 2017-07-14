import java.util.HashSet;

/**
 * Created by EVAN on 2017/7/14.
 */
public class Solution633 {
    public boolean judgeSquareSum(int c) {
        int root = (int)Math.sqrt(c) + 1;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0;  i <= root; i++) {
            hs.add(i * i);
            if (hs.contains(c - i * i))
                return true;
        }
        return false;
    }
}
