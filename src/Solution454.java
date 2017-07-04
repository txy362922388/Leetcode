import java.util.HashMap;

/**
 * Created by evan on 17-7-4.
 */
public class Solution454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int size = A.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                hm.put(A[i] + B[j],hm.getOrDefault(A[i] + B[j],0) + 1);
            }
        }

        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int val = hm.getOrDefault(-(C[i] + D[j]),0);
                count += val;
            }
        }
        return count;
    }
}
