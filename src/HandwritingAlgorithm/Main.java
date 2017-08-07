package HandwritingAlgorithm;

import java.util.Arrays;

/**
 * Created by Evan on 2017/8/7.
 */
public class Main {
    public static void main(String[] args) {
        int[] a = {2,1,2,4,5,3,1,2,3,7,4,6,7,8,-1,-4,-2,-1,-5,9};
//        QucikSort qs = new QucikSort();
//        qs.quickSort(a,0,a.length - 1);
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
