
public class HeapSort1 {
	public static void swap(int[] a, int left, int right) {
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}
	
	public static void maxHeap(int[] a, int size, int index) {
		int left = 2 * index + 1;
		int right = 2 * index + 2;
		
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
	
	public static void heapSort(int[] a) {
		for (int i = a.length / 2; i >= 0; i--) {
			maxHeap(a,a.length,i);
		}
		
		for (int i = a.length - 1; i > 0; i--) {
			swap(a,0,i);
			maxHeap(a,i,0);
		}
	}
	
	
	public static void main(String[] args) {
		int[] a = {1,5,4,2,7,5,8,8,-2,-3,0,2,3,-1,-1};
		heapSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}		
	}
}
