
public class QuickSort {
	
	public static int helper(int[] a, int left, int right) {
		int pivot = a[left + (right - left) / 2];
		while (left <= right) {
			while (a[left] < pivot) {left++;}
			while (a[right] > pivot) {right--;}
			if (left <= right) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			}
		}
		return left;
	}
	
	public static void quickSort(int[] a, int left, int right) {
		int mid = helper(a,left,right);
		if (left < mid - 1) {
			quickSort(a,left,mid - 1);
		} 
		if (mid < right) {
			quickSort(a,mid,right);
		}
	}
	
	
	public static void main(String[] args) {
		int[] a = {2,1,4,5,2,3,-1,0};
		quickSort(a,0,a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
