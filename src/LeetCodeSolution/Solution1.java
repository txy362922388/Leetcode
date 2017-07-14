import java.util.*;

public class Solution1 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int sum = -nums[i];
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[j] + nums[k] == sum) {
                    List<Integer> list = new ArrayList();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    if (!res.contains(list))
                        res.add(list);
                    j++;
                    k--;
                } else if (nums[j] + nums[k] < sum) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
    	int[] num = {-1,0,1,2,-1,-4};
    	List<List<Integer>> res = threeSum(num);
    	System.out.println(res.toString());
    }
}