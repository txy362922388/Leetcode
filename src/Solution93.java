import java.util.ArrayList;
import java.util.List;

/**
 * Created by evan on 17-6-28.
 */
public class Solution93 {

    public void backtrack(String s, String sub, List<String> res, int count) {
        if (count == 4 && s.length() == 0) {
            res.add(sub.substring(0,sub.length() - 1));
            return;
        }
        for (int i = 1; i <=3; i++) {
            if (s.length() < i) continue;
            int val = Integer.parseInt(s.substring(0,i));
            if (val > 255 || String.valueOf(val).length() != i) continue;
            backtrack(s.substring(i),sub + val + ".",res,count + 1);
        }
    }

    public List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<>();
        backtrack(s,"",list,0);
        return list;
    }
}
