public class Solution43 {
	
	public static String add(String num1,String num2) {
		char[] a = num1.toCharArray();
		char[] b = num2.toCharArray();
		int carry = 0;
		int i = a.length - 1;
		int j = b.length - 1;
		StringBuffer sb = new StringBuffer();
		while (i >= 0 && j >= 0) {
			int val = carry + (a[i] - '0') + (b[j] - '0');
			carry = val / 10;
			val = val % 10;
			sb.append(val);
			i--;
			j--;
		}
		
		while (i >= 0) {
			int val = carry + (a[i] - '0');
			carry = val / 10;
			val = val % 10;
			sb.append(val);
			i--;
		}
		while (j >= 0) {
			int val = carry + (b[j] - '0');
			carry = val / 10;
			val = val % 10;
			sb.append(val);
			j--;
		}
		if (carry == 1)
			sb.append(1);
		return sb.reverse().toString();
	}
	
	
    public static String multiply(String num1, String num2) {
    	String res = "0";
    	char[] a = num1.toCharArray();
    	char[] b = num2.toCharArray();
    	for (int i = a.length - 1; i >= 0; i--) {
    		for (int j = b.length - 1; j >= 0; j--) {
    			StringBuilder mul = new StringBuilder(String.valueOf((a[i] - '0') * (b[j] - '0')));
    			int shift = a.length - 1 - i + b.length - 1 - j;
    			while (shift > 0) {
    				mul.append(0);
    				shift--;
    			}
    			res = add(res,mul.toString());
    		}
    	}
    	
        return res;
    }
    
    public static void main(String[] args) {
    	System.out.println(multiply("8998","8998"));
    	StringBuilder s = new StringBuilder("0");
    	System.out.println(s.toString().equals("0"));
    }
}