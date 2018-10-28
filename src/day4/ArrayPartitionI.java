package day4;

import java.util.Arrays;

public class ArrayPartitionI {
	public static int arrayPairSum(int[] nums) {
		//BubbleSort
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < nums.length; i+=2) {
			sum += nums[i];
		}
		return sum;
    }
	
	public static void main(String[] args) {
		int array[] = {1,4,3,2};
		System.out.println(arrayPairSum(array));
	}
}
