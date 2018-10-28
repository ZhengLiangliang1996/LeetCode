package day32;

import java.util.List;
import java.util.LinkedList;

public class LetterCasePermutation {
	
	public static List<String> letterCasePermutation(String S) {
		List<String> l = new LinkedList<String>();
		dfs(S.toCharArray(),0,l);
		return l;
    }
	
	private static void dfs(char[] charArray, int i, List<String> l) {
		if(i == charArray.length){
			l.add(new String(charArray));
			return;
		}
		dfs(charArray, i + 1, l);
		if(!Character.isLetter(charArray[i])) return;
		charArray[i] ^= 1 << 5;//a - > A
		dfs(charArray,i + 1,l);
		charArray[i] ^= 1 << 5;//还原
	}

	public static void main(String[] args) {
		String S1 = "a1b2";
		System.out.println(letterCasePermutation(S1));
		
		String S2 = "12345";
		System.out.println(letterCasePermutation(S2));
	}
}
