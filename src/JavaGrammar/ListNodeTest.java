
public class ListNodeTest {
	public static ListNode init() {
		int num = 10;
		ListNode dum = new ListNode(0);
		ListNode head = dum;
		while (num > 0) {
			int rand = (int)(Math.random() * 20);
			System.out.print(rand + " ");
			ListNode node = new ListNode(rand);
			dum.next = node;
			dum = dum.next;
			num--;
		}
		System.out.println();
		head = head.next;
		return head;
	}
	
	public static ListNode helper(ListNode head,ListNode tail) {
		ListNode p = head;
		ListNode q = p.next;
		int pivot = p.val;
		while (q != tail) {
			if (q.val < pivot) {
				p = p.next;
				int temp = p.val;
				p.val = q.val;
				q.val = temp;
			} 
			q = q.next;
		}
		int val = head.val;
		head.val = p.val;
		p.val = val;
		return p;
	}
	
	public static void quickSort(ListNode head,ListNode tail) {
		if (head != tail) {
			ListNode mid = helper(head,tail);
			quickSort(head,mid);
			quickSort(mid.next,tail);	
		}
		
	}
	
	public static ListNode mergeSort(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode slow = head;
		ListNode fast = head;
		ListNode pre = null;
		while (fast != null && fast.next != null) {
			pre = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		pre.next = null;
		ListNode l1 = mergeSort(head);
		ListNode l2 = mergeSort(slow);
		return merge(l1,l2);
	}
	
	public static ListNode merge(ListNode l1, ListNode l2) {
		ListNode dum = new ListNode(0);
		ListNode head = dum;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				dum.next = l1;
				l1 = l1.next;
			} else {
				dum.next = l2;
				l2 = l2.next;
			}
			dum = dum.next;
		}
		if (l1 != null) {
			dum.next = l1;
		}
		if (l2 != null) {
			dum.next = l2;
		}
		return head.next;
	}
	
//	public static ListNode merge1(ListNode l1, ListNode l2) {
//		ListNode dum = new ListNode(0);
//		ListNode p = dum;
//		while (l1 != null && l2 != null) {
//			if (l1.val < l2.val) {
//				p.next = l1;
//				l1 = l1.next;
//				p = p.next;
//			} else {
//				p.next = l2;
//				l2 = l2.next;
//				p = p.next;
//			}
//		}
//		if (l1 != null) {
//			p.next = l1;
//		}
//		if (l2 != null) {
//			p.next = l2;
//		}
//		return dum.next;
//	}
//	
//	public static ListNode mergeSort1(ListNode list) {
//		if (list == null || list.next == null)
//			return list;
//		ListNode slow = list;
//		ListNode fast = list;
//		ListNode pre = null;
//		while (fast != null && fast.next != null) {
//			pre = slow;
//			slow = slow.next;
//			fast = fast.next.next;
//		}
//		pre.next = null;
//		
//		return merge1(mergeSort1(list),mergeSort1(slow));
//	}
	
	public static ListNode partition(ListNode head, ListNode tail) {
			ListNode p = head;
			ListNode q = head.next;
			int pivot = p.val;
			while (q != null) {
				if (q.val < pivot) {
					p = p.next;
					int temp = p.val;
					p.val = q.val;
					q.val = temp;
					q = q.next;
					
				} else {
					q = q.next;
				}
			}
			
			int temp1 = head.val;
			head.val = p.val;
			p.val = temp1;
			return p;
	}
	
	public static void quickSort1(ListNode head, ListNode tail) {
		if (head != tail) {
			ListNode mid = partition(head,tail);
			quickSort1(head, mid);
			quickSort1(mid.next,tail);
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		ListNode head = init();
		quickSort1(head,null);
		
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
}
