import java.util.Arrays;

public class MergeSort {
	
	public static void merge(int[] a, int left, int mid, int right) {
		int[] temp = new int[right - left  + 1];
		int i = left;
		int j = mid + 1;
		int k = 0;
		while (i <= mid && j <= right) {
			if (a[i] < a[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = a[j++];
			}
		}
		
		while (i <= mid) {
			temp[k++] = a[i++];
		}
		while (j <= right) {
			temp[k++] = a[j++];
		}
		
		for (int m = 0; m < temp.length; m++) {
			a[m + left] = temp[m];
		}
	}
	
	public static void mergeSort(int[] a, int left, int right) {
		int mid = left + (right - left) / 2;
		if (left != right) {//判断条件很重要
			mergeSort(a,left,mid);

			mergeSort(a,mid + 1,right);
		
			merge(a,left,mid,right);
		}
	}
	
	public static void main(String[] args) {
		//int[] a = {1,5,4,2,7,5,8,8,-2,-3,0,2,3,-1,-1};
		int[] a = {5,3,6,3,8,4,2,1,4,0,0,-1,-5,-3,-6,-3,7,2,3};
		mergeSort(a,0,a.length - 1);
		System.out.println(Arrays.toString(a));
	}
}
