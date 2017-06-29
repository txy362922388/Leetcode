/**
 * Created by evan on 17-6-28.
 */
public class Solution468 {

    public boolean containsLeadingZero(String s) {
        if (s.length() == 1)
            return false;
        if (s.length() >= 2 && s.charAt(0) == '0')
            return true;
        return false;
    }

    public boolean isValid(String s) {
        if (s.equals(""))
            return false;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] - '0' < 0 || c[i] - '0' > 9)
                return false;
        }
        return true;
    }

    public boolean isIPv4(String s) {
        String[] ss = s.split("\\.");
        if (ss.length != 4)
            return false;
        for (int i = 0; i < ss.length; i++) {
            if (containsLeadingZero(ss[i]) || !isValid(ss[i]))
                return false;
            int num = Integer.parseInt(ss[i]);
            if (num < 0 || num > 255)
                return false;
        }
        return true;
    }

    public boolean isIPv6(String s) {
        String[] ss = s.split("\\:");
        if (ss.length != 8)
            return false;
        for (int i = 0; i < ss.length; i++) {
            if (ss[i].length() < 1 || ss[i].length() > 4)
                return false;
        }
        return true;
    }

    public String validIPAddress(String IP) {

        if (IP.length() < 7 || IP.length() > 39)
            return "Neither";
        if (IP.charAt(0) == ':' || IP.charAt(0) == '.' || IP.charAt(IP.length() - 1) == ':' || IP.charAt(IP.length() - 1) == '.')
            return "Neither";
        if (isIPv4(IP))
            return "IPv4";
        if (isIPv6(IP))
            return "IPv6";
        return "Neither";
    }

}
