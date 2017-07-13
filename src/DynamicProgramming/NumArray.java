package DynamicProgramming;

/**
 * Created by EVAN on 2017/7/13.
 */
public class NumArray {

    int[] table;
    public NumArray(int[] nums) {
        int size = nums.length;
        table = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += nums[i];
            table[i] = sum;
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0)
            return table[j];
        return table[j] - table[i - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */