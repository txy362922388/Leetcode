import java.util.Collections;
import java.util.List;

public class Solution524{
    public static int helper(String s, String t) {
        if (s.length() < t.length())
            return 0;
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        int i = 0;
        int j = 0;
        while (i < c1.length && j < c2.length) {
            int tmp = c2[j];
            while (i < c1.length && c1[i] != tmp) {
                i++;
            }
            i++;
            j++;
        }
        if (j == c2.length)
            return c2.length;
        
        return 0;
        
    }
    
    public String findLongestWord(String s, List<String> d) {
        //System.out.println(helper("abpcplea","plea"));
        Collections.sort(d);
        int max = 0;
        int index = -1;
        for (int i = 0; i < d.size(); i++) {
            int val = helper(s,d.get(i));
            if (val > max) {
                max = val;
                index = i;
            }
        }
        return index == -1 ? "" : d.get(index);
    }
    
    public static void main(String[] args) {
    	String s = "mjmqqjrmzkvhxlyruonekhhofpzzslupzojfuoztvzmmqvmlhgqxehojfowtrinbatjujaxekbcydldglkbxsqbbnrkhfdnpfbuaktupfftiljwpgglkjqunvithzlzpgikixqeuimmtbiskemplcvljqgvlzvnqxgedxqnznddkiujwhdefziydtquoudzxstpjjitmiimbjfgfjikkjycwgnpdxpeppsturjwkgnifinccvqzwlbmgpdaodzptyrjjkbqmgdrftfbwgimsmjpknuqtijrsnwvtytqqvookinzmkkkrkgwafohflvuedssukjgipgmypakhlckvizmqvycvbxhlljzejcaijqnfgobuhuiahtmxfzoplmmjfxtggwwxliplntkfuxjcnzcqsaagahbbneugiocexcfpszzomumfqpaiydssmihdoewahoswhlnpctjmkyufsvjlrflfiktndubnymenlmpyrhjxfdcq";
        String t = 	"ettphsiunoglotjlccurlre";
        System.out.println(helper(s,t));
        int[] a = {1,2,3};
        int[] b = {1,2,3};
        System.out.println(a.equals(b));
    }
}