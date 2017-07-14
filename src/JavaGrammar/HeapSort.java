
public class HeapSort {
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void maxHeap(int[] a, int size, int index) {
		int left = index * 2 + 1;
		int right = index * 2 + 2;
		
		int max = index;
		if (left < size && a[left] > a[index]) {
			max = left;
		}
		
		if (right < size && a[right] > a[max]) {
			max = right;
		}
		if (max != index) {
			swap(a,max,index);
			maxHeap(a,size,max);
		}
		
	}

	public static void HeapSort(int[] a) {
		
		for (int i = a.length / 2; i >= 0; i--) {
			maxHeap(a,a.length,i);
		}
		
		for (int i = a.length - 1; i >= 1; i--) {
			swap(a,i,0);
			maxHeap(a,i,0);
		}
	}
	
	public static void main(String[] args) {
		int[] a = {3,2,1,4,5,6,-1,4};
		HeapSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
