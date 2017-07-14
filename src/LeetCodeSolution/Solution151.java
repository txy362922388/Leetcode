/**
 * Created by evan on 17-6-28.
 */
public class Solution151 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s.trim());
        sb.reverse();
        String[] ss = sb.toString().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < ss.length; i++) {
            res.append(new StringBuilder(ss[i]).reverse()).append(" ");
        }
        return res.toString().trim();

    }


}
