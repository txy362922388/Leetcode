package HandwritingAlgorithm;

/**
 * Created by Evan on 2017/8/7.
 */
public class QucikSort {
    public void quickSort(int[] a, int l, int r) {
        if (l < r) {
            int i = l;
            int j = r;
            int pivot = a[i];
            while (i < j) {
                while (i < j && a[j] > pivot) {
                    j--;
                }
                if (i < j)
                    a[i++] = a[j];
                while (i < j && a[i] <pivot) {
                    i++;
                }
                if (i < j)
                    a[j--] = a[i];
            }
            a[i] = pivot;
            quickSort(a,l,i - 1);
            quickSort(a,i + 1,r);
        }
    }
}
