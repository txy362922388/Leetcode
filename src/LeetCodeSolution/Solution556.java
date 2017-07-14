/**
 * Created by Evan on 2017/6/26.
 */
public class Solution556 {

    public boolean isOverflow(String s1) {
        String s = String.valueOf(Integer.MAX_VALUE);
        if (s1.length() < s.length())
            return false;
        if (s1.length() > s.length())
            return true;
        char[] c1 = s1.toCharArray();
        char[] c2 = s.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] > c2[i])
                return true;
        }
        return false;
    }

    public void swap(char[] c, int i, int j) {
        char tmp = c[i];
        c[i] = c[j];
        c[j] = tmp;
    }
    public void reverse(char[] c, int i, int j) {
        while (i < j) {
            swap(c,i,j);
            i++;
            j--;
        }
    }

    public int nextGreaterElement(int n) {
        String ss = String.valueOf(n);
        if (ss.length() <= 1)
            return -1;
        char[] c = ss.toCharArray();
        int i = c.length - 1;
        while (i > 0 && c[i - 1] >= c[i]) {
            i--;
        }
        int first = i - 1 >= 0 ? i - 1 : 0;
        int second = i;
        i = c.length - 1;
        while (i > 0 && c[i] <= c[first]) {
            i--;
        }
        swap(c,first,i);
        reverse(c,second,c.length - 1);
        String s = new String(c);
        if (isOverflow(s))
            return -1;
//        System.out.println(s.compareTo(String.valueOf(Integer.MAX_VALUE)));
//        System.out.println(String.valueOf(Integer.MAX_VALUE).compareTo(s));

        int res = Integer.parseInt(new String(c));
        return res > n ? res : -1;
        //return -1;
    }

}
