package LeetCodeSolution;

/**
 * Created by Evan on 2017/7/24.
 */
public class Solution645 {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        if (nums == null || nums.length == 0)
            return res;
        for (int i = 0; i <nums.length; i++) {
            nums[Math.abs(nums[i]) - 1] = -nums[Math.abs(nums[i]) - 1];
        }
        int j = 0;
        for (int i = 0; i <nums.length; i++) {
            if (nums[i] > 0) {
                res[j++] = i + 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i]) == res[0])
                return res;
        }
        int tmp = res[0];
        res[0] = res[1];
        res[1] = tmp;
        return res;
    }
}
