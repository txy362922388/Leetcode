import java.util.Arrays;

public class SortCollection {
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static int partition(int[] a, int left, int right) {
		int pivot = a[left + (right - left) / 2];
		while (left <= right) {
			while (a[left] < pivot) {left++;}
			while (pivot < a[right]) {right--;} 
			if (left <= right) {
				swap(a,left,right);
				left++;
				right--;
			}
		}
		return left;
	}
	//快速排序
	public static void quickSort(int[] a, int left, int right) {
		int mid = partition(a,left,right);
		if (left < mid - 1) {
			quickSort(a,left,mid - 1);
		}
		if (mid < right) {
			quickSort(a,mid,right);
		}
	}
	//冒泡排序
	public static void bubleSort(int[] a) {
		for (int i = a.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[i])
					swap(a,i,j);
			}
		}
	}
	//插入排序
	public static void insertSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0 && a[j - 1] > a[j]; j--) {
				swap(a,j - 1,j);
			}
		}
	}
	//选择排序
	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[i])
					swap(a,i,j);
			}
		}
	}
	
	
	public static void maxHeap (int[] a, int size, int index) {
		int left = 2 * index + 1;
		int right = 2 * index + 2;
		int max = index;
		if (left < size && a[left] > a[index]) {
			max  = left;
		}
		if (right < size && a[right] > a[max]) {
			max = right;
		}
		if (max != index) {
			swap(a,max,index);
			maxHeap(a,size,max);
		}
	}
	//堆排序
	public static void heapSort(int[] a) {
		for (int i = a.length / 2; i >= 0; i--) {
			maxHeap(a,a.length,i);
		}
		for (int i = a.length - 1; i >= 0 ; i--) {
			swap(a,i,0);
			maxHeap(a,i,0);
		}
	}
	//归并排序
	public static void merge(int[] a, int left, int mid, int right) {
		int size = right - left + 1;
		int[] temp = new int[size];
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
		for (int m = 0; m < size; m++) {
			a[m + left] = temp[m];
		}
	}
	
	public static void mergeSort(int[] a, int left, int right) {
		int mid = left + (right - left) / 2;
		if (left < right) {
			mergeSort(a,left,mid);
			mergeSort(a,mid + 1,right);
			merge(a,left,mid,right);
		}

	}
	
	//桶排序（限制于正整数）
	public static void buckSort(int[] a, int max) {
		int[] buck = new int[max];
		for (int i = 0; i < a.length; i++) {
			buck[a[i]]++;
		}
		int k = 0;
		for (int i = 0; i < buck.length; i++) {
			while (buck[i] != 0) {
				a[k++] = i;
				buck[i]--;
			}
		}
	}
	//最大连续子数和并打印
	public static int maxSubSum(int[] a) {
		int curMax = 0;
		int max = Integer.MIN_VALUE;
		int tail = 0;
		for (int i = 0; i < a.length; i++) {
			curMax += a[i];
			max = Math.max(curMax, max);
			if(max == curMax)
				tail = i;
			if (curMax < 0)
				curMax = 0;
		}
		int head = tail;
		int temp = max;
		while (temp != 0) {
			temp -= a[head--];
		}
		for (int i = head + 1; i <= tail; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		return max;
	}
	public static void main(String[] args) {
		int[] a = {5,3,6,3,8,4,2,1,4,0,0,-1,-5,-3,-6,-3,7,2,3};
		int[] b = {3,2,1,4,5,6,7,3,4,5,6,7,3,4,5,6,7,8};
		int[] c = {-3,4,-3,5,2,-4,6,-1,-7,2,5,-1};
		//quickSort(a,0,a.length - 1);
		//bubleSort(a);
		//insertSort(a);
		//selectionSort(a);
		//heapSort(a);
		mergeSort(a,0,a.length - 1);
		//buckSort(b,10);
		//System.out.println(maxSubSum(c));
		System.out.println(Arrays.toString(a));
	}
}
