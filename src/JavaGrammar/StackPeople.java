import java.util.*;

public class StackPeople {
    public static int getHeight(int[][] actors, int n) {
        // write code here
    	Comparator<int[]> com = new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if (o1[0] < o2[0])
					return -1;
				else if (o1[0] > o2[0])
					return 1;
				else 
					return 0;
			}
    		
    	};
    	
    	Arrays.sort(actors,com);
    	int[] dp = new int[n];
    	Arrays.fill(dp, 1);
    	for (int i = 1; i < actors.length; i++) {
    		for (int j = 0; j < i; j++) {
    			if (actors[j][1] < actors[i][1]) {
    				if (dp[j] + 1 > dp[i])
    					dp[i] = dp[j] + 1;
    			}
    		}
    	}
    	int max = 0;
    	for (int i = 0; i < n; i++) {
    		max = Math.max(dp[i], max);
    	}
    	return max;
    }

}