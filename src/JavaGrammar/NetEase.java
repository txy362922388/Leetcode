import java.util.*;
public class NetEase {
	
	public static void print(String s) {
		System.out.println(s);
	}
	
//	public static void shuffle(int[] nums, int[] res) {
//		int j = 0;
//		int k = res.length / 2;
//		for (int i = 0;i < nums.length;i++) {
//			if ((i & 1) == 0) {
//				res[i] = nums[j];
//				j++;
//			} else {
//				res[i] = nums[k];
//				k++;
//			}
//		}
//	}
	
	public static void printArray(int[] array) {
		for (int i = 0;i < array.length;i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	public static void getQueue(int num) {
		int[] a = new int[num];
		int skip = 0;
		int index = 0;
		int count = 1;
		while (count <= num) {
			while (true) {
				index = index % num;
				if (a[index] == 0) {
					skip++;
					if (skip == 2)
						break;
				}
				index++;
			}
			a[index] = count;
			skip = 0;
			count++;
			index++;
		}
		printArray(a);
		
	}
	
	public static void main(String[] args) {
//		Scanner s1 = new Scanner(System.in);
//		int numOfData = s1.nextInt();
//		while (numOfData > 0) {
//			numOfData--;
//			Scanner s2 = new Scanner(System.in);
//			int a = s2.nextInt();
//			int b = s2.nextInt();
//			Scanner s3 = new Scanner(System.in);
//			int[] nums = new int[2 * a];
//			for (int i = 0;i < 2 * a;i++) {
//				nums[i] = s3.nextInt();
//			}
//			int[] res = new int[nums.length];
//			int[] temp;
//			while (b > 0) {
//				shuffle(nums,res);
//				temp = res;
//				res = nums;
//				nums  = temp;
//				b--;
//			}
//			printArray(nums);
//		}
		Scanner s1 = new Scanner(System.in);
		int numOfData = s1.nextInt();
		while (numOfData > 0) {
			numOfData--;
			Scanner s2 = new Scanner(System.in);
			int a = s2.nextInt();
			getQueue(a);
		}
	}
}
