import java.util.*;

public class Queens {
    
    public static boolean isVaild(int n,int row,int[] col) {
        for (int i = 0; i < row; i++) {
            int occ = col[i];
            if (occ == n)
                return false;
            int dis = Math.abs(occ - n);
            if (row - i == dis)
                return false;
        }
        return true;
    }
    
    public static void place(int n, int row, int[] col, int[] way) {
        if (row == n) {
            way[0]++;
            System.out.println(way[0]);
        } else {
            for (int i = 0; i < n; i++) {
                if (isVaild(i,row,col)) {
                    col[row] = i;
                    place(n,row + 1,col,way);
                }
            }
        }
    }
    
    public static int nQueens(int n) {
        // write code here
        int[] way = new int[1];
        int[] col = new int[n];
        place(n,0,col,way);
        return way[0];
        
    }
    
    public static void main(String[] args) {
    	System.out.println(nQueens(15));
    }
}