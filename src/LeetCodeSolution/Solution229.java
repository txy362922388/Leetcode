import java.util.*;

public class Solution229 {
    public List<Integer> majorityElement(int[] nums) {
        int thresh = nums.length / 3;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        List<Integer> list = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
        	if (hm.containsKey(nums[i]))
        		hm.put(nums[i],hm.get(nums[i]) + 1);
        	else 
        		hm.put(nums[i],1);
        }
    	Iterator it = hm.entrySet().iterator();
    	
    	
    	return null;
    }
}