import java.util.*;

public class Coins {
    public static int countWays2(int n) {
        // write code here
        int[] coins = {1,5,10,25};
        int[] dp = new int[100000];
        dp[0] = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = coins[i]; j <= n; j++) {
                dp[j] = (dp[j] + dp[j - coins[i]]) % 1000000007;
            }
        }
        return dp[n];
    }
	
	
    public static int countWays(int n) {
        int[] coins = {1,5,10,25};
        int[] dp = new int[100000];
        dp[0] = 1;

        
        for(int j = 1; j <= n; j++){
            for(int i = 0; i < 4; i++){
                if(j-coins[i] >= 0){
                    dp[j] = dp[j] + dp[j - coins[i]];
                }
            }
        }
        
        return dp[n];
    }
    
    public static void main(String[] args) {
    	int i = 50;
    	System.out.println(countWays(i) + " " + countWays2(i));
    }
    
}