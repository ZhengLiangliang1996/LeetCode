package day31;

public class PeakIndexInAMountainArray {
	
	public static int peakIndexInMountainArray(int[] A) {
        if(A.length < 3){
        	return 0;
        }
        int i =1;
        for (; i < A.length; i++) {
        	if(A[i] < A[i-1]){
        		break;
        	}
		}
        
        int j = A.length - 1;
        for (; j > 0; j--) {
			if(A[j] > A[j-1]){
				break;
			}
		}
        
        if(i-1 == j){
        	return i;
        }
        
        return i;
    }
	
	public static void main(String[] args) {
		int[] array = {3,4,5,1};
		System.out.println(peakIndexInMountainArray(array));
	}
}
