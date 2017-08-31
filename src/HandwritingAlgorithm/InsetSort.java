package HandwritingAlgorithm;

/**
 * Created by Evan on 2017/8/10.
 */
public class InsetSort {
    public void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[i] > a[j])
                    break;
            }
            int tmp = a[i];
            for (int k = i - 1; k > j; k--) {
                a[k + 1] = a[k];
            }
            a[j + 1] = tmp;
        }
    }
}
