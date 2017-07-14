import java.util.Stack;

public class Solution67 {
    public String addBinary(String a, String b) {
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        int i = c1.length - 1;
        int j = c2.length - 1;
        Stack<Integer> s = new Stack();
        int carry = 0;
        while (i >= 0 && j >= 0) {
        	int val1 = c1[i] - '0';
        	int val2 = c2[j] - '0';
        	int sum = val1 + val2 + carry;
        	carry = sum / 2;
        	sum = sum % 2;
        	s.push(sum);
        	
        	i--;
        	j--;
        }
        while (i >= 0) {
        	int val = c1[i] - '0';
        	int sum = val + carry;
            carry = sum / 2;
        	sum = sum % 2;
        	s.push(sum);
        	i--;
        }
        while (j >= 0) {
        	int val = c2[j] - '0';
        	int sum = val + carry;
            carry = sum / 2;
        	sum = sum % 2;
        	s.push(sum);
        	j--;
        }
        if (carry == 1)
        	s.push(1);
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
        	sb.append(s.pop());
        }
        return sb.toString();
    }
}