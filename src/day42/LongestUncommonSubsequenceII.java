package day42;

import java.util.Arrays;
import java.util.Comparator;

public class LongestUncommonSubsequenceII {
	//refer to : https://blog.csdn.net/zshouyi/article/details/71247703
    public static int findLUSlength(String[] strs) {
        //sorting because if it exists a subSuq, it must be the 
    	//shortest one
    	Arrays.sort(strs, new Comparator<String>() {
        	public int compare(String s1, String s2) {
				return s2.length() - s1.length();
			}
		});
        
    	//traversal strs, if str is not the only subSeq of all strs , then 
    	//return length of str, or return -1
        for (int i = 0; i < strs.length; i++) {
			int noMatches = strs.length - 1;
        	for (int j = 0; j < strs.length; j++) {
				if (i != j && isSubString(strs[i], strs[j])){
					noMatches --;
				}
				if (noMatches == 0){
					return strs[i].length();
				}
			}
		}
        return -1;
    }	
	
	private static boolean isSubString(String string, String string2) {
		int i = 0;
		for(char ch: string2.toCharArray()){
			if(i < string.length() && string.charAt(i) == ch){
				i++;
			}
		}
		if(i == string.length()){
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String[] a = {"aba", "cdc", "eae"};
		System.out.println(findLUSlength(a));
	}
}
