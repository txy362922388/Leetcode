import java.util.Scanner;

public class QuickSortMain {
	
//	public static int partition(int[] a, int l, int r) {
//		int mid = l + (r - l) / 2;
//		while (l <= r) {
//			while (a[l] < a[mid]) {
//				l++;
//			}
//			
//			while (a[mid] < a[r]) {
//				r--;
//			}
//			if (l <= r) {
//				int temp = a[l];
//				a[l] = a[r];
//				a[r] = temp;
//				l++;
//				r--;
//			}
//		}
//		return l;
//	}
//	
//	public static void quickSort(int[] a, int l, int r) {
//		
//		int mid = partition(a, l ,r);
//		if (l < mid - 1) {
//			quickSort(a,l,mid - 1);
//		}
//		if (mid < r) {
//			quickSort(a,mid,r);
//		}
//		
//	}
	
	
	public static int partition(int[] a, int l, int r) {
		int pivot = a[l + (r - l) / 2];
		while (l <= r) {
			while (a[l] < pivot) {
				l++;
			}
			while (pivot < a[r]) {
				r--;
			}
			if (l <= r) {
				int temp = a[l];
				a[l] = a[r];
				a[r] = temp;
				l++;
				r--;
			}
		}
		return l;
	}
	
	public static void quickSort(int[] a, int l, int r) {
		int mid = partition(a,l,r);
		if (l < mid - 1) {
			quickSort(a,l,mid - 1);
		}
		if (mid < r) {
			quickSort(a,mid,r);
		}
	}
	
    public static void main(String[] args) {
    	int[] a = {5,2,1,3,5,6,2,4,7,8,5,4,-3};
    	quickSort(a,0,a.length - 1);
    	for (int i = 0; i < a.length; i++) {
    		System.out.println(a[i]);
    	}
    }
    
}