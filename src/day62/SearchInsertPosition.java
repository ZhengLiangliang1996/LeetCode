package day62;

public class SearchInsertPosition {
	
    public static int searchInsert(int[] nums, int target) {
    	for (int i = 0; i < nums.length; i++) {
			if(target == nums[i]){
				return i;
			}
			if(target < nums[i]){
				return i;
			}
		}
    	return nums.length;
    }
    
	public static void main(String[] args) {
		int []nums = {1, 3, 5, 6};
		int target = 0;
		System.out.println(searchInsert(nums, target));
	}
}
