package day35;

public class BothGreaterElementI {
	
    public static int[] BothGreaterElement(int[] nums1, int[] nums2) {
        int[] a = new int[nums1.length];
        int leftindex = 0;
        int rightindex = 0;
        for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if(nums1[i] == nums2[j]){
					leftindex = j - 1;
					rightindex = j + 1;
					if(j == 0){
						leftindex = -1;
					}
					if(j == nums2.length -1 ){
						rightindex = -1;
					}
				}
			}
			if(leftindex != -1 && rightindex != -1){
				int max = nums2[leftindex] > nums2[rightindex] ? nums2[leftindex] : nums2[rightindex];
				a[i] = max > nums1[i] ? max : -1; 
			}
			if(leftindex == -1){
				a[i] = nums2[rightindex] > nums1[i] ? nums2[rightindex] : -1;
			}
			if(rightindex == -1){
				a[i] = nums2[leftindex] > nums1[i] ? nums2[leftindex] : -1;
			}
		}
        return a;
    }
	
	public static void main(String[] args) {
		int[] num1 = {4,1,2};
		int[] num2 = {1,3,4,2};
		int[] a = BothGreaterElement(num1,num2);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
