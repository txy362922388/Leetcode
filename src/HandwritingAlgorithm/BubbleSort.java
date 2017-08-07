package HandwritingAlgorithm;

/**
 * Created by Evan on 2017/8/7.
 */
public class BubbleSort {
    public void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public void bubbleSort(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j <i; j++) {
                if (a[j] > a[j + 1])
                    swap(a,j,j + 1);
            }
        }
    }
}
