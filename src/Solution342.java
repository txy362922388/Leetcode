import java.util.ArrayList;
import java.util.List;

/**
 * Created by evan on 17-6-29.
 */
public class Solution342 {
    public static List<Integer> res = new ArrayList<>();
    static {
        int val = 1;
        for (int i = 0; i <= 15; i++) {
            res.add(val);
            val *= 4;
        }
    }

    public boolean isPowerOfFour(int num) {
        return res.contains(num);
    }

}
