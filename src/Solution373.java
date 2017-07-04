import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by evan on 17-7-4.
 */

public class Solution373 {
    class Turple implements Comparable<Turple> {
        int x;
        int y;
        int val;
        public Turple(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }

        @Override
        public int compareTo(Turple o) {
            return val - o.val;
        }
    }
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Turple> q = new PriorityQueue<>();
        int m = nums1.length;
        int n = nums2.length;
        List<int[]> res = new ArrayList<>();
        if (nums1 == null || m == 0 || nums2 == null || n == 0)
            return res;
        for (int i = 0; i < m; i++) {
            q.offer(new Turple(i,0,nums1[i] + nums2[0]));
        }

        for (int i = 0; i < k; i++) {
            Turple t = q.poll();
            int[] tmp = {nums1[t.x],nums2[t.y]};
            res.add(tmp);
            if (t.y == n - 1) continue;
            q.offer(new Turple(t.x,t.y + 1,nums1[t.x] + nums2[t.y + 1]));
        }
        return res;
    }
}
