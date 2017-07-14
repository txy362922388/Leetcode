/**
 * Created by Evan on 2017/6/28.
 */
public class Solution537 {

    public int[] reslover(String a) {
        String[] ss = a.split("\\+");
        int[] res = new int[2];
        res[0] = Integer.parseInt(ss[0]);
        res[1] = Integer.parseInt(ss[1].substring(0,ss[1].length() - 1));
        return res;

    }

    public String complexNumberMultiply(String a, String b) {
        int[] num1 = reslover(a);
        int[] num2 = reslover(b);
        int real = num1[0] * num2[0] - num1[1] * num2[1];
        int com = num1[0] * num2[1] + num1[1] * num2[0];
        StringBuilder sb = new StringBuilder();
        sb.append(real).append("+").append(com).append("i");
        return sb.toString();
    }

}
