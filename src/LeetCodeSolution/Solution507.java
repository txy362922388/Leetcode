import java.util.ArrayList;
import java.util.List;

/**
 * Created by EVAN on 2017/7/14.
 */
public class Solution507 {
    public boolean checkPerfectNumber(int num) {
        if (num < 0)
            return false;
        int res = 1;
        int end = (int)Math.sqrt(num);
        for (int i = 2; i <= end; i++) {
            if (num % i == 0)
                res = res + i + num / i;
        }
        return res == 1 ? false : res == num;


    }
}
