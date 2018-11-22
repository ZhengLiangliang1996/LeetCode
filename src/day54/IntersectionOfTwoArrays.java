package day54;


import java.util.HashSet;
import java.util.Set;


public class IntersectionOfTwoArrays {
	//别人的方法是用两个set 第一个先add
	//然后第二个set.contains方法来看存不存在 
	//感觉方法比我的好
	public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if(nums1[i] == nums2[j]){
					set.add(nums1[i]);
				}
			}
		}
        
        int[] a = new int[set.size()];
        int i = 0;
        for(Integer s : set){
        	a[i++] = s;
        }
        
        return a;
    }

	public static void main(String[] args) {
		int[] a = {1, 2, 2, 1};
		int[] b = {2, 2};
	    int[] c = intersection(a, b);
	    for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
