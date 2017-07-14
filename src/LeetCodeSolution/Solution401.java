import java.util.ArrayList;
import java.util.List;

public class Solution401 {
    int[] time = {1,2,4,8,1,2,4,8,16,32};
    
    public void backtrack(boolean[] table, int index, List<String> res, int num) {
        if (num == 0) {
            int h = 0;
            int min = 0;
            for (int i = 0; i < table.length; i++) {
                if (table[i]) {
                    if (i <= 3) {
                        h += time[i];
                    } else {
                        min += time[i];
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append(h);
                sb.append(":");
                if (min < 10)
                    sb.append("0");
                sb.append(min);
                res.add(sb.toString());
                return;
            }
        }
        
        for (int i = index; i < table.length; i++) {
            table[i] = true;
            backtrack(table,index + 1, res, num - 1);
            table[i] = false;
        }
    }
    
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList();
        if (num < 0)
            return res;
        boolean[] table = new boolean[10];
        backtrack(table,0,res,num);
        return res;
    }
    
    public static void main(String[] args) {
    	Solution401 s = new Solution401();
    	List<String> list = s.readBinaryWatch(1);
    	System.out.println(list.toString());
    }
}