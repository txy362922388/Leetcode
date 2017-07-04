import java.util.PriorityQueue;

/**
 * Created by evan on 17-7-4.
 */
public class Solution378 {

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

    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Turple> q = new PriorityQueue<>();
        for (int i = 0; i < matrix[0].length; i++)
            q.offer(new Turple(0,i,matrix[0][i]));
        for (int i = 1; i < k; i++) {
            Turple t = q.poll();
            if (t.x == matrix.length - 1) continue;
            q.offer(new Turple(t.x + 1,t.y,matrix[t.x + 1][t.y]));
        }
        return q.poll().val;
    }
}
