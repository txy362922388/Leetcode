import java.util.Arrays;

/**
 * Created by EVAN on 2017/7/14.
 */
public class Solution453 {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int count = nums.length - 1;
        for (int i = 1; i < nums.length; i++) {
            sum = sum +  count * (nums[i] - nums[i - 1]);
            count--;
        }
        return sum;
    }
}
