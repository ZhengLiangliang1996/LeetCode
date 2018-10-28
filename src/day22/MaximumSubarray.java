package day22;

public class MaximumSubarray {
	
	
	
	public static void main(String[] args) {
		int[] array = {-2, 1, -3, 4, -1, 2, 1, -5,4};
		System.out.println(maxSubArray(array));
	}

	private static int maxSubArray(int[] array) {
		int max = array[0];
		int dp = array[0];
		for (int i = 1; i < array.length; i++) {
			dp = Math.max(array[i], array[i] + dp);
			max= Math.max(dp,max);
		}
		return max;
	}
}
