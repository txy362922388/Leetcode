import java.util.Arrays;

/**
 * Created by EVAN on 2017/7/14.
 */
public class Solution628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        return Math.max(nums[size - 1] * nums[size - 2] * nums[size - 3], nums[0] * nums[1] * nums[size - 1]);
    }
}