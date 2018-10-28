package day2;

public class sortArrayByParity {
	public static int[] sortArrayByParity1(int[] A) {
        int [] B = new int[A.length];
        int countOdd = 0;
        int counteven = 0;
        for(int i = 0;i < A.length; i++){
        	if(A[i] %2 == 0){ //even
        		B[counteven] = A[i];
        		counteven++;
        	}else{//odd
        		countOdd++;
        		B[A.length-countOdd] = A[i];
        	}
        }
        return B;
    }

	
	public static void main(String[] args) {
		int[] a = {3,1,2,4,6,7,3,7,4,2,6,8};
		int[] b = sortArrayByParity1(a);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
