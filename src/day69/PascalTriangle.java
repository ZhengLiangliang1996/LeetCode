package day69;

import java.util.*;

import day60.printRandM;

public class PascalTriangle {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> l1 = new LinkedList<List<Integer>>();
        for (int i = 1; i <= numRows; i++) {
        	List<Integer> cur = new LinkedList<Integer>();
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					cur.add(1);
				} else {
					 List<Integer> prev = l1.get(l1.size() - 1);
					 cur.add(prev.get(j - 2) + prev.get(j - 1));
				}
				
			}
			l1.add(cur);
		}
        return l1;
    }
	
	public static void main(String[] args) {
		List<List<Integer>> l1 = generate(5);
		for (int i = 0; i < l1.size(); i++) {
			for (int j = 0; j < l1.get(i).size(); j++) {
				System.out.print(l1.get(i).get(j)+" ");
			}
			System.out.println("");
		}
	}
}
