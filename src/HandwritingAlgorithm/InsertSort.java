package HandwritingAlgorithm;

/**
 * Created by EVAN on 8/9/2017.
 */
public class InsertSort {
    public void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[i] > a[j])
                    break;
            }
            if (j != i - 1) {
                int tmp = a[i];
                for (int k = i - 1; k > j;k--) {
                    a[k + 1] = a[k];
                }
                a[j] = tmp;
            }
        }
    }
}
