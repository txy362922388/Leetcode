class RandomListNode {
	int label;
    RandomListNode next, random;
    RandomListNode(int x) { this.label = x; }
  };

public class Solution138 {
    public static RandomListNode copyRandomList(RandomListNode head) {
        if (head == null)
            return head;
        RandomListNode ptr = head;
        while (ptr != null) {
            RandomListNode node = new RandomListNode(ptr.label);
            RandomListNode tmp = ptr.next;
            ptr.next = node;
            node.next = tmp;
            ptr = tmp;
        }
        ptr = head;
        while (ptr != null) {
        	if (ptr.random != null)
        		ptr.next.random = ptr.random.next;
            ptr = ptr.next.next;
        }
        RandomListNode newHead = head.next;
        RandomListNode q = head.next;
        ptr = head;
        while (ptr.next.next != null) {
            ptr.next = ptr.next.next;
            q.next = q.next.next;
            ptr = ptr.next;
            q = q.next;
        }
        return newHead;
    }
    public static void main(String[] args) {
    	RandomListNode a = new RandomListNode(1);
    	RandomListNode b = new RandomListNode(2);
    	RandomListNode c = new RandomListNode(3);
    	a.next = b;
    	b.next = c;
    	a.random = c;
    	RandomListNode d = copyRandomList(a);
    	System.out.println(d.label + " " + d.next.label + " " + d.next.next.label);
    	System.out.println(d.random.label);
    }
}