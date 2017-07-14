import java.util.*;
import java.util.Map.Entry;

public class Coder {
	
	public static int count(String s) {
		int count = 0;
		for (int i = 0; i <= s.length() - 5; i++) {
			if (s.charAt(i) == 'c' && s.substring(i,i + 5).equals("coder")) {
				count++;
			}
		}
		
		return count;
	}
	
    public static String[] findCoder(String[] a, int n) {
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        for (int i = 0; i < a.length; i++) {
        	String s = a[i].toLowerCase();
        	if (s.contains("coder")) {
        		int num = count(s);
        		hm.put(i, num);
        	}
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(hm.entrySet());  
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {    
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {  
                return o2.getValue().compareTo(o1.getValue());  
            }  
        }); 
        String[] res = new String[list.size()];
        int j = 0;
        for (Map.Entry<Integer, Integer> map : list) {
        	res[j] = a[map.getKey()];
        	j++;
        }
        
        return res;
    }
    
    public static void main(String[] args) {
    	String[] a = {"coder","tsfncoderfykdqcoderysjcodermrrscodermrcoderthswcodernicoderdjfcoderitktccoderavqtcoderkcoderjmdacoderncoderxzksacoderncoderlmxhcodereyuzcoder","bjcodermqkgacoderbbacoderykcoderycoderutmlscodercxecoderkcodergcoderunsrcoderkhcoderzcoderaafcoderayvcoderkzjcoderacoderacoderrcoderibpycoder","jvcoderhcoderblcoderyjcoderaoycodersadxccodermxrcoderkbmyncoderfocoderqcoder","qfpcodermcoderyjftcoderfghfcoderocoderuxcoderblngccoderpjshcoderjyprcoderkcoderprucodersumcoder","ihcoderfawecodertpvmfcoderxcoderjbdcoderqcoderpfcaqcoder","nycoder","ffgicoderxecoderpqzcoderwjcoder","yjscoderbcoderahncodercrbzcoderfvetcodergmzpqcoderqzeocoderdmpcoderqqajcoderhhjacoderpcoderwycoderpyzcoder","csbcoder"};
    	int n = 3;
    	String[] res = findCoder(a,n);
    	for (int i = 0;i < res.length; i++) {
    		System.out.println(res[i]);
    	}
    }
}