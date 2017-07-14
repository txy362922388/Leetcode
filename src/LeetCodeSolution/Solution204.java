package LeetCodeSolution;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by EVAN on 2017/7/14.
 */
public class Solution204 {
    public int countPrimes(int n) {
        if (n <= 1)
            return 0;
        int size = (int)Math.sqrt(n);
        boolean[] table = new boolean[n];
        Arrays.fill(table,true);
        table[0] = false;
        table[1] = false;
        for (int i = 2; i <= size; i++) {
            int factor = 2;
            while (table[i] && i * factor < n) {
                table[i * factor] = false;
                factor++;
            }
        }
        int count = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i])
                count++;
        }
        return count;
    }
}
