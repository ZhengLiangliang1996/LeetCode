package day60;

public class printRandM {
	
	//N个数中等概率打印M个数
	//相同的数字不要重复打印
	//时间复杂度 O(M) 额外空间复杂度 O(1)
	public static void printRandM(int[] arr, int m){
		// space limit, so hash map can not 
		// be used in this case, in-place trick, 
		// swap the printed one to the end of the array
		// 容错处理 
		if (arr == null || arr.length == 0 || m < 0) {
			return;
		}
		
		m = Math.min(arr.length,m);
		int count = 0;
		int i = 0;
		while(count < m) {
			i = (int) (Math.random() * (arr.length - count));
			System.out.println(arr[i]);
			swap(arr, arr.length - count++ - 1, i);
		}
	}
	
	private static void swap(int[] arr, int index, int index2) {
		// TODO Auto-generated method stub
		int tmp = arr[index];
		arr[index] = arr[index2];
		arr[index2] = tmp;
	}

	public static void main(String[] args) {
		int []arr = {1,6,3,6,2,7,9,0};
		printRandM(arr, 5);
		
	}
}
