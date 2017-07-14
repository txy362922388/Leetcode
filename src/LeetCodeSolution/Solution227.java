import java.util.Stack;

/**
 * Created by Evan on 2017/6/26.
 */
public class Solution227 {

    public int opt(char c) {
        if (c == '*' || c == '/')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return 0;
    }

    public int cal(int num1, int num2, char op) {
        switch (op) {
            case '+' : return num1 + num2;
            case '-' : return num1 - num2;
            case '*' : return num1 * num2;
            case '/' : return num1 / num2;
        }
        return -1;
    }


    public int calculate(String s) {
        char[] c = s.toCharArray();
        Stack<Integer> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        int pre = 0;
        for (int i = 0; i < c.length; i++) {
            if (opt(c[i]) != 0) {
                int num = Integer.parseInt(s.substring(pre,i).trim());
                s1.push(num);
                pre = i + 1;
                if (s2.isEmpty()) {
                    s2.push(c[i]);
                    continue;
                }
                if (opt(c[i]) > opt(s2.peek()))
                    s2.push(c[i]);
                else {
                    while (!s2.isEmpty() && opt(s2.peek()) >= opt(c[i])) {
                        int num2 = s1.pop();
                        int num1 = s1.pop();
                        s1.push(cal(num1,num2,s2.pop()));
                    }
                    s2.push(c[i]);
                }
            }
        }
        int num = Integer.parseInt(s.substring(pre,s.length()).trim());
        s1.push(num);
        while (!s2.isEmpty()) {
            int num2 = s1.pop();
            int num1 = s1.pop();
            s1.push(cal(num1,num2,s2.pop()));
        }
        return s1.peek();
    }
}
