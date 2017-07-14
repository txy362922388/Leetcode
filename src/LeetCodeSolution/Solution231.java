/**
 * Created by EVAN on 2017/7/14.
 */
public class Solution231 {
    public class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n <= 0)
                return false;
            return (n & (n - 1)) == 0;
        }
    }
}
