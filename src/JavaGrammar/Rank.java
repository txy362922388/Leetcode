import java.util.*;

public class Rank {
	Node root = null;
    public int[] getRankOfNumber(int[] A, int n) {
        // write code here
    	int[] res = new int[n];
    	for (int i = 0; i < n; i++) {
    		res[i] = helper(A[i]);
    	}
    	return res;
    }
    
    public int helper(int a) {
    	if (root == null) {
    		root = new Node(a);
    	} else {
    		root.insert(a);
    	}
    	return root.getRank(a);
    }
    
    public static void main(String[] args) {
    	int A= 3;
    	int B= 4;
    	A=A^B;
    	B=B^A;
    	A=A^B;
    	System.out.println(A+" "+B);
    	
    }
}


class Node {
	int leftcount = 0;
	Node left;
	Node right;
	int val;
	public Node(int val) {
		this.val = val;
	}
	
	public void insert(int v) {
		if (v <= val) {
			if (left == null) {
				left = new Node(v);
			} else {
				left.insert(v);
			}
			leftcount++;
		} else {
			if (right == null) {
				right = new Node(v);
			} else {
				right.insert(v);
			}
		}
	}
	
	public int getRank(int v) {
		if (v == val)
			return leftcount;
		if (v > val) 
			return getRank(right.getRank(v) + leftcount + 1);
		if (v < val)
			return getRank(left.getRank(v));
		return 0;
	}
	
	
}