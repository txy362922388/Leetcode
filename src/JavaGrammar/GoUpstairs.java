import java.util.*;

public class GoUpstairs {
    public static int countWays(int n) {
        n = n % 1000000007;
        // write code here
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (n == 3)
            return 4;
        return countWays(n - 3) + countWays(n - 2) + countWays(n - 1);
    }
    public static void main(String[] args) {
    	System.out.println(countWays(40));
    }
    
}