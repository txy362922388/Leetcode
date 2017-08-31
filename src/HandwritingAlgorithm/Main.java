package HandwritingAlgorithm;

import java.util.Arrays;

/**
 * Created by Evan on 2017/8/7.
 */
public class Main {
    public static void main(String[] args) {
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(-10 + Math.random() * 20);
        }
        System.out.println(Arrays.toString(a));
//        QucikSort qs = new QucikSort();
//        qs.quickSort(a,0,a.length - 1);
//        BubbleSort bs = new BubbleSort();
//        bs.bubbleSort(a);
        InsertSort is = new InsertSort();
        is.insertSort(a);
        System.out.println(Arrays.toString(a));
    }
}
