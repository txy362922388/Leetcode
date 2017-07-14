/**
 * Created by Evan on 2017/6/26.
 */
public class Solution583 {
    public int minDistance(String word1, String word2) {
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        int[][] dp = new int[c1.length + 1][c2.length + 1];
        for(int i = 0; i <= c1.length; i++) {
            for (int j = 0; j <= c2.length; j++) {
                if (i == 0 || j == 0)  {
                    dp[i][j] = 0;
                } else if (c1[i - 1] == c2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i][j - 1]);
                }
            }
        }
        return c1.length + c2.length - 2 * dp[c1.length][c2.length];
    }
}
