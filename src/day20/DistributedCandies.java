package day20;

import java.util.HashSet;
import java.util.Set;

public class DistributedCandies {
	
	public static int distributeCandies(int[] candies) {
		Set<Integer> num = new HashSet<Integer>();
		for (int candy : candies) {
            num.add(candy);
        }
        int numNums = num.size();
		int average = candies.length / 2;
		return numNums >= average ? average : numNums;
    }
	
	public static void main(String[] args) {
		int[] candies = {1,1,1,1,1,1,1,1,2,3};
		System.out.println(distributeCandies(candies));
	}
}
