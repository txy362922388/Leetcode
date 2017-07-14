import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Evan on 2017/6/26.
 */
public class Solution49 {

    public String trans(String s) {
        char[] c = s.toCharArray();
        int[] table = new int[26];
        for (int i = 0; i < c.length; i++) {
            table[c[i] - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        //System.out.printf(Arrays.toString(cc));
        for (int i = 0; i < table.length; i++) {
            sb.append(table[i]);
        }
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<String, List<String>>();
        for (int i = 0; i < strs.length; i++) {
            String key = trans(strs[i]);
            System.out.println(key);
            if (!hm.containsKey(key)) {
                List<String> list = new ArrayList();
                list.add(strs[i]);
                hm.put(key,list);
            } else {
                List<String> tmp = hm.get(key);
                tmp.add(strs[i]);
            }
        }
        List<List<String>> res = new ArrayList();
        Iterator it = hm.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            List<String> tmp = (List<String>) e.getValue();
            res.add(tmp);
        }
        return res;

    }

}

