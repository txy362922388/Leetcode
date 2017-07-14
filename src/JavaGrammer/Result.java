import java.util.*;

public class Result {
    public static int[] calcResult(String A, String guess) {
        // write code here
       char[] a = A.toCharArray();
       char[] b = guess.toCharArray();
       int count1 = 0;
       HashMap<Character,Integer> hm = new HashMap();
       for (int i = 0; i < a.length; i++) {
    	   if (hm.containsKey(a[i])) 
    		   hm.put(a[i], hm.get(a[i]) + 1);
    	   else 
    		   hm.put(a[i],1);
    	   if (a[i] == b[i])
    		   count1++;
       }
       
       int count2 = 0;
       for (int i = 0; i < b.length; i++) {
    	   if (hm.containsKey(b[i])) {
    		   count2++;
    		   int val = hm.get(b[i]);
    		   val--;
    		   if (val == 0)
    			   hm.remove(b[i]);
    		   else 
    			   hm.put(b[i], val);
    	   }
       }
       count2 -= count1;
       int[] res= new int[2];
       res[0] = count1;
       res[1] = count2;
       System.out.println(res[0] + " " + res[1]);
       return res;
    }
    
    public static void main(String[] args) {
    	calcResult("RGBY","GGRR");
    }
}