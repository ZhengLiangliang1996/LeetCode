package day34;

public class MonotonicArray {
	
    public static boolean isMonotonic(int[] A) {  	
    	boolean a = true;
    	boolean b = true;
    	int i = 1;
    	for (; i < A.length; i++) {
			a &= A[i] <= A[i-1];
			b &= A[i] >= A[i-1];
		}
    	return a || b;
	}
	
	public static void main(String[] args) {
		int [] a = {1,3,2};
		System.out.println(isMonotonic(a));
	}
}
