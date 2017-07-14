import java.util.Arrays;

public class Solution566 {
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums == null || nums.length == 0 || nums[0] == null || nums[0].length == 0)
            return nums;
        int row = nums.length;
        int col = nums[0].length;
        if (row * col != r * c)
            return nums;
        int k = 0;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int indexI = k / col;
                int indexJ = k % col;
                res[i][j] = nums[indexI][indexJ];
                k++;
            }
        }
        return res;
        
    }
    
    public static void main(String[] args) {
    	int[][] nums = {{1,2},{3,4}};
    	int[][] res = matrixReshape(nums,1,4);
    	System.out.println(res[0].length);
    }
}