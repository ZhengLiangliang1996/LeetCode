package day43;

import java.util.Arrays;

public class RelativeRanks {
	  public static String[] findRelativeRanks(int[] nums) {
		    int a[] = new int[nums.length];
		    for (int i = 0; i < a.length; i++) {
				a[i] = nums[i];
			}
		    String b[] = new String[a.length];
	        Arrays.sort(a);
	        for (int i = 0; i < nums.length; i++) {
				if(nums[i] == a[a.length-1]){
					b[i] = "Gold Medal";
				}else if(nums[i] == a[a.length-2]){
					b[i] = "Silver Medal";
				}else if(nums[i] == a[a.length-3]){
					b[i] = "Bronze Medal";
				}else{
					int c = a.length - printArray(a, nums[i]);
					b[i] = Integer.toString(c);
				}
			}
	       return b;
	  }
	  
	//遍历数组 得到下标
		public static int printArray(int[] array,int value){
			for(int i = 0;i<array.length;i++){
				if(array[i]==value){
					return i;
				}
			}
			return -1;//当if条件不成立时，默认返回一个负数值-1
		}
	  
	  public static void main(String[] args) {
		int[] a = {5, 4, 3, 2, 1};
		String[] b = findRelativeRanks(a);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
	}
}
