package day40;

import java.util.Arrays;



public class KdiffPairsInAnArray {
	

        public static int findPairs(int[] nums, int k) {
        	Arrays.sort(nums);

        	int x = 0;
        	for (int i = 0; i < nums.length; i++) {
    			for (int j = i+1; j < nums.length; j++) {
    					if(nums[j] - nums[i] == k){
    					    x++;
    					    break;
    					}
    			   
    			}
                while(i<nums.length-1 && nums[i] == nums[i+1])
    			       i++;
    		}
        	return x;
        }


	


	private static void quicksort(int[] nums, int left, int right) {
		int partitionIndex;
		if(left < right){
			partitionIndex = partition(nums, left, right);
			quicksort(nums, left, partitionIndex - 1);
			quicksort(nums, partitionIndex + 1, right);
		}
	}



	private static int partition(int[] nums, int left, int right) {
		int pivot = nums[left];
		while(left < right){
			while(left < right && pivot <= nums[right])
				right--;
			if(nums[right] <= pivot){
				int temp;
				temp = nums[right];
				nums[right] = nums[left];
				nums[left] = temp;
			}
			
			while(left < right && pivot >= nums[left])
				left++;
			if(nums[left] >= pivot){
				int temp;
				temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
			}
		}
		nums[left] = pivot;
		return nums[left];
	}



	public static void main(String[] args) {
		int[] a = {3, 1, 4, 1, 5};
		System.out.println(findPairs(a,2));
	}
}
