package day32;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Permutation {
	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        List<Integer> cList = new LinkedList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        
        if(nums == null || nums.length == 0) return res;
        permuteHelp(res, cList, nums, set);
        return res;
    }
	
	private static void permuteHelp(List<List<Integer>> res, List<Integer> cList,
			int[] nums, Set<Integer> set) {
		if(cList.size() == nums.length) res.add(cList);
		else {
			for (int i = 0; i < nums.length; i++) {
				if(!set.contains(nums[i])){
					cList.add(nums[i]);
					set.add(nums[i]);
					int last_index = cList.size() - 1;
					permuteHelp(res,cList,nums,set);
					set.remove(nums[i]);
					cList.remove(last_index);
				}
			}
		}
	}

	public static void main(String[] args) {
//		int [] a = {1,2,3};
//		List<List<Integer>> res = permute(a);
//		System.out.println(res.size());
//		for (int i = 0; i < res.size(); i++) {
//			for (int j = 0; j < ; j++) {
//				
//			}
//		}
	}
}
