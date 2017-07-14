/**
 * Created by evan on 17-6-29.
 */
public class Solution165 {
    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        int i = 0;
        int j = 0;
        while (i < s1.length && j < s2.length) {
            int num1 = Integer.parseInt(s1[i]);
            int num2 = Integer.parseInt(s2[j]);
            if (num1 > num2)
                return 1;
            if (num1 < num2)
                return -1;
        }
        if (i == s1.length && j == s2.length)
            return 0;
        if (i == s1.length)
            return -1;
        else
            return 1;
    }

}
