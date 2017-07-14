import java.util.*;

public class Clearer {
    
    public static void set(int[][] a, int i, int j, int n) {
        for (int k = 0; k < n; k++) {
            a[i][k] = 1;
            a[k][j] = 1;
        }
    }
    
    public static int[][] clearZero(int[][] mat, int n) {
        if (mat == null || mat.length == 0 || 
            mat[0] == null || mat[0].length == 0)
            return mat;
        int[][] res = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0)
                    set(res,i,j,n);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (res[i][j] == 1)
                	mat[i][j] = 0;
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
    	int[][] a = {{1,2,3},{0,1,2},{0,0,1}};
    	clearZero(a,3);
    	for (int i = 0; i < a.length; i++) {
    		for (int j = 0; j < a[0].length; j++) {
    			System.out.print(a[i][j] + " ");
    		}
    		System.out.println();
    	}
    }
}