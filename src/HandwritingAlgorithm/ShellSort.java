package HandwritingAlgorithm;

/**
 * Created by Evan on 2017/8/10.
 */
public class ShellSort {
    public void shellSort(int[] a) {
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            for (int i = 0; i < gap; i++) {
                for (int j = i + gap; j < a.length; j += gap) {
                    int tmp = a[j];
                    int k = j - gap;
                    while ( k >= 0 && a[k] > tmp) {
                        a[k + gap] = a[k];
                        k -= gap;
                    }
                    a[k + gap] = tmp;
                }
            }
        }
    }
}
