package day39;

public class ThirdMaximumNumber {
	
	public static int thirdMax(int[] nums) {
        quicksort(nums, 0, nums.length-1);
        Integer max1 = nums[nums.length-1];
        Integer max2 = null;
        Integer max3 = null;
        for (int i = nums.length-2; i >= 0; i--) {
			if(nums[i] == max1){
				continue;
			}else if(nums[i] != max1 && max2 == null){
				max2 = nums[i];
			}else if(nums[i] != max1 && nums[i] == max2){
				continue;
			}else{
				max3 = nums[i];
				break;
			}
		}
        if(max3 == null){
        	return max1;
        }
        return max3;
    }
	
	public static void quicksort(int n[], int left, int right){
		int dp;
		if(left < right){
			dp = partition(n, left, right);
			quicksort(n, left, dp - 1);
			quicksort(n, dp + 1, right);
		}
	}
	
	static int partition(int n[], int left, int right){
		int pivot = n[left];
		while(left < right){
			while(right > left && n[right] >= pivot)
				right--;
			if(n[right] <= pivot){
				int temp = n[right];
				n[right] = n[left];
				n[left] = temp;
			}
			
			while(right > left && n[left] <= pivot)
				left++;
			if(n[left] >= pivot){
				int temp = n[left];
				n[left] = n[right];
				n[right] = temp;
			}
		}
		n[left] = pivot;
		return left;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2, 2, 5, 3, 5};
	
		System.out.println(thirdMax(a));
	}
}
