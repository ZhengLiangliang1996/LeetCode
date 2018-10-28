package day25;

import java.util.LinkedList;
import java.util.List;


public class ShortestDistanceToACharacter {
	
	public static int[] shortestToChar(String S, char C) {
        //记录C的位置
		char[] array = S.toCharArray();
		int [] result = new int[array.length];
		List<Integer> pos = new LinkedList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if(array[i] == 'e'){
				pos.add(i);
			}
		}
		
		for (int j = 0; j < array.length; j++) {
			if(array[j] == 'e'){
				result[j] = 0;
			}else{
				//每一个e到这个数字位置的距离abs
				int min = Integer.MAX_VALUE;
				for (int k = 0; k < pos.size(); k++) {
					min = Math.min(min, Math.abs(j - pos.get(k)));
				}
				result[j] = min;
			}
		}
		return result;
    }
	
	public static void main(String[] args) {
		String S = "aaab";
		char C = 'b';
		int[] a = shortestToChar(S, C);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
