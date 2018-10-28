package day12;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UncommonWordsFrom2Sentences {
	
	public static String[] uncommonFromSentences(String A, String B) {
        String[] aA = A.split(" ");
        String[] bB = B.split(" ");
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        List<String> list = new LinkedList<String>();
        for (String s : aA) {
			if(map1.containsKey(s)){
				map1.put(s, map1.get(s)+1);
			}else{
				map1.put(s, 1);
			}
		}
        
        for (String s : bB) {
        	if(map2.containsKey(s)){
				map2.put(s, map2.get(s)+1);
			}else{
				map2.put(s, 1);
			}
		}
        
        for (String s : aA) {
        	if(!map2.containsKey(s) && map1.get(s) == 1){
        		list.add(s);
        	}
        }
        
        for (String s : bB) {
        	if(!map1.containsKey(s) && map2.get(s) == 1){
        		list.add(s);
        	}
        }
        
        String s[] = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
			s[i] = list.get(i);
		}
        return s;
    }
	
	public static void main(String[] args) {
		String a = "abcd def abcd xyz";
		String b = "ijk def ijk";
		String[] c = uncommonFromSentences(a, b);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
