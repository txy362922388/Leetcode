import java.util.*;

public class Subset {
    
    public static void helper(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> sub, int[] a, int index) {
        //if (sub.size() != 0) {
        	ArrayList<Integer> temp = new ArrayList<Integer>(sub);
        	res.add(temp);
        //}
        
        
        for (int i = index; i < a.length; i++) {
            sub.add(a[i]);
            helper(res,sub,a,i + 1) ;
            sub.remove(sub.size() - 1);
        }
    }
    
    public static ArrayList<ArrayList<Integer>> getSubsets(int[] A, int n) {
        Arrays.sort(A);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = A[n - 1 -i];
        }
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        helper(res,new ArrayList<Integer>(),a,0);
        return res;
    }
    
    public static void main(String[] args) {
    	int[] a = {1,2,3,4,5};
    	ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    	res = getSubsets(a,a.length);
    	int count = 0;
    	for (int i = 0; i < res.size(); i++) {
    		ArrayList<Integer> temp = res.get(i);
    		for (int j = 0; j < temp.size(); j++) {
    			System.out.print(temp.get(j) + " ");
    		}
    		count++;
    		System.out.println();
    	}
    	System.out.println(count);
    }
}

