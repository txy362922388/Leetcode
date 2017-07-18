package LeetCodeSolution;

/**
 * Created by EVAN on 2017/7/18.
 */
public class Solution168 {
    String table = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public String convertToTitle(int n) {
        if (n <= 0)
            return "";
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int remain = n % 26;
            if (remain == 0) {
                sb.append('Z');
                n = n / 26 - 1;
                continue;
            }
            sb.append(table.charAt(remain - 1));
            n = n / 26;
        }
        sb.reverse();
        return sb.toString();
    }
}
