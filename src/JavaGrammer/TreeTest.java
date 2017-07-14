import java.util.*;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode (int val) {
		this.val = val;
	}
}


public class TreeTest {
    public static TreeNode helper(int[] a, int left, int right) {
        if (left > right)
            return null;
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(a[mid]);
        root.left = helper(a, left, mid - 1);
        root.right = helper(a, mid + 1, right);
        return root;
        
    }
    
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        return helper(nums,0,nums.length - 1);
    }
    
	public static TreeNode init(int[] a) {
		return sortedArrayToBST(a);
	}
	
	public static void levelOrder(TreeNode root) {
		Queue<TreeNode> q = new LinkedList();
		q.offer(root);
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				TreeNode temp = q.poll();
				System.out.print(temp.val + " ");
				if (temp.left != null)
					q.offer(temp.left);
				if (temp.right != null)
					q.offer(temp.right);
			}
			System.out.println();
		}
	}
	
	public static void preorder(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> s = new Stack<TreeNode>();
		while (!s.isEmpty() || root != null) {
			while(root != null) {
				//先序遍历
				//System.out.println(root.val);
				s.push(root);
				root = root.left;
			}
			root = s.pop();
			//中序遍历
			//System.out.println(root.val);
			root = root.right;
		}
	}
	
	public static void postorder(TreeNode root) {
		Stack<TreeNode> s1 = new Stack();
		Stack<Integer> s2 = new Stack();
		s1.push(root);
		while (!s1.isEmpty()) {
			TreeNode temp = s1.pop();
			s2.push(temp.val);
			if (temp.left != null)
				s1.push(temp.left);
			if (temp.right != null)
				s1.push(temp.right);
		}
		while (!s2.isEmpty()) {
			System.out.println(s2.pop());
		}
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		TreeNode root = init(a);
		//levelOrder(root);
		//preorder(root);
		postorder(root);
	}
}
