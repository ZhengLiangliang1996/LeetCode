package day62;

public class SpecialJudge {
	
	public static void specialjudge(int[] a1, int[] b1, int k) {
		int A = a1.length;
		int B = b1.length;
		//No need for fault tolerant code 
		if(!isBFibonnacci(b1)) {
			System.out.println("Wrong Answer - The participant's answer does not obey the recursion");
		}
		
		if(isBFibonnacci(b1) == true && subSequence(a1, b1) == false) {
			System.out.println("Wrong Answer - Not subSequence");
		}
		
		if(isBFibonnacci(b1) == true && subSequence(a1, b1) == true && B < k) {
			System.out.println("Wrong Answer - The jury gets better answer...");
		}
		
		if(isBFibonnacci(b1) == true && subSequence(a1, b1) == true && B == k) {
			System.out.println("Accepted -- OKOK");
		}
		
		if(isBFibonnacci(b1) == true && subSequence(a1, b1) == true && B > k) {
			System.out.println("Wrong Answer - The paticipant gets better answer than the jury..");
		}
	}
	
	private static boolean subSequence(int[] b, int[] a) {
	    int i = 0;
	    int j = 0;
	    while (i < a.length && j < b.length) {
	        if (a[i] == b[j]) {
	            i++;
	        }
	        j++;
	    }
	    return i == a.length;
	}

	private static boolean isBFibonnacci(int[] b1) {
		int i = b1.length -1;
		while(i >= 2){
			if(b1[i] != b1[i - 1] + b1[i-- - 2])
				return false;
		}
		return true;
	}



	public static void main(String[] args) {
		int[] a1 = {1, 0, 0, 0, 1, 1, 2, 3, 5, 8};
		int[] b1 = {1, 1, 2, 3, 5, 8};
		int k = 8;
		specialjudge(a1, b1, k);
	}
}
