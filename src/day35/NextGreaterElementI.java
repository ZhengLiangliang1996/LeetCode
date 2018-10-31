package day35;

public class NextGreaterElementI {
	public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int findLen = findNums.length;
		int numsLen = nums.length;
		int i, j, k;
		int[] res = new int[findLen];
		for (i = 0; i < findLen; i++) {
			for (j = 0; j < numsLen; j++) {
				if (findNums[i] == nums[j]) {
					for (k = j + 1; k < numsLen; k++) {
						if (nums[k] > findNums[i]) {
							res[i] = nums[k];
							break;
						}
					}
					if (k == numsLen)
						res[i] = -1;
					break;
				}
			}
		}
		return res;
    }
}
