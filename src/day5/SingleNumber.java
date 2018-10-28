package day5;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	
    public static int singleNumber(int[] nums) {
       int zero = 0;
       for (int i = 0; i < nums.length; i++) zero ^= nums[i];
       return zero;
    }
	
	public static void main(String[] args) {
		int a[] = {1,1,2,2,4,5,5};
		System.out.println(singleNumber(a));
	}
}
