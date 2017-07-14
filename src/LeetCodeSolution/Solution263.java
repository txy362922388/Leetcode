/**
 * Created by EVAN on 2017/7/14.
 */
public class Solution263 {
    public boolean isUgly(int num) {
        if (num <= 0)
            return false;
        if (num == 1)
            return true;
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }
}
