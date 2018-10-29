package day33;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	
	public static int majorityElement(int[] nums) {
        if(nums.length == 0) return nums[0];
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
			if(!map1.containsKey(nums[i])){
				map1.put(nums[i], 1);
			}else{
				map1.put(nums[i], map1.get(nums[i]) + 1);
			}
		}
        
        int max = 0;
        int majority = -1;
        for (Integer key : map1.keySet()) { 
        	  if(map1.get(key) > max){
        		  max = map1.get(key);
        		  majority = key;
        	  }
        	} 
        return majority;
    }
	
	public static void main(String[] args) {
		int [] a = {3,3,4};
		System.out.println(majorityElement(a));
	}
}
