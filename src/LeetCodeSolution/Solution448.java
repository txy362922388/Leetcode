import java.util.Arrays;
import java.util.List;

public class Solution448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] == i + 1)
    			continue;
    		int index = nums[i] - 1;
    		while (true) {
    			if (nums[index] == index + 1)
    				break;
    			int temp = nums[index] - 1;
    			nums[index] = index + 1;
    			index = temp;
    		}
    	}
    	System.out.println(Arrays.toString(nums));
        return null;
    }
    public static void main(String[] args) {
    	int[] nums = {3,4,2,5,1,6,8,7};
    	findDisappearedNumbers(nums);
    }
}