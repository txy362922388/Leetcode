/**
 * Created by Evan on 2017/6/23.
 */
public class Solution6 {


    public String convert(String s, int r) {
        if (s.equals(""))
            return "";
        char[] c = s.toCharArray();
        StringBuilder[] sb = new StringBuilder[r];
        for (int i = 0; i < r; i++) {
            sb[i] = new StringBuilder();
        }
        int flag = 0;
        int row = 0;
        for (int i = 0; i < c.length; i++) {
            if (flag == 0) {
                if (row == r - 1) {
                    flag = 1;
                    sb[row].append(c[i]);
                    row--;
                } else {
                    sb[row].append(c[i]);
                    row++;
                }
            } else {
                if (row == 0) {
                    flag = 0;
                    sb[row].append(c[i]);
                    row++;
                } else {
                    sb[row].append(c[i]);
                    row--;
                }
            }
        }
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < r; i++) {
            ss.append(sb[i]);
        }
        return ss.toString();
    }
}
