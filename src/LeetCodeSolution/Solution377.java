import java.util.Arrays;

public class Solution377 {
    static int count = 0;
    
    public static void backtrack(int[] nums, int index, int target) {
        if (target == 0) {
            count++;
            return;
        }
        if (target < 0)
            return;
        for (int i = 0; i < nums.length; i++) {
            backtrack(nums,i,target - nums[i]);
        }
    }
    
    public static int combinationSum4(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return 0;
        Arrays.sort(nums);
        backtrack(nums,0,target);
        return count;
    }
    
    public static void main(String[] args) {
    	int[] nums = {1,2,3};
    	int target = 32;
    	System.out.println(combinationSum4(nums,target));
    }
}