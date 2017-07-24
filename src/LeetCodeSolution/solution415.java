package LeetCodeSolution;

/**
 * Created by Evan on 2017/7/24.
 */
public class solution415 {
    public String addStrings(String num1, String num2) {
        if (num1 == null || num1.equals("") || num2 == null || num2.equals(""))
            return "";
        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();
        int i = c1.length - 1;
        int j = c2.length - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 && j >= 0) {
            int x = c1[i] - '0';
            int y = c2[j] - '0';
            int sum = x + y + carry;
            carry = sum / 10;
            sum = sum % 10;
            sb.append(sum);
            i--;
            j--;
        }
        char[] c3 = i >= 0 ? c1 : c2;
        int k = i >= 0 ? i : j;
        while (k >= 0) {
            int x = c3[k] - '0';
            int sum = x + carry;
            carry = sum / 10;
            sum = sum % 10;
            sb.append(sum);
            k--;
        }
        if (carry == 1)
            sb.append(1);
        return sb.reverse().toString();
    }
}
