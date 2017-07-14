import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evan on 2017/6/26.
 */
public class Solution438 {
    public boolean helper(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int[] table = new int[26];
        for (int i = 0; i < c1.length; i++) {
            table[c1[i] - 'a']++;
        }
        for (int i = 0; i < c2.length; i++) {
            table[c2[i] - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (table[i] != 0)
                return false;
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        assert (p != null && !p.equals(""));
        List<Integer> res = new ArrayList();
        if (s.length() < p.length())
            return res;
        for (int i = 0; i <= s.length() - p.length(); i++) {
            String tmp = s.substring(i,i + p.length());
            if (helper(tmp,p))
                res.add(i);
        }
        return res;

    }

}
