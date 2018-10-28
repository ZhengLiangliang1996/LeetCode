package day1;



public class JewerlsAndStones {
	
	public static int numJewelsInStones(String J, String S) {
        int lenA = S.length();
        int lenB = J.length();
        char[] A = S.toCharArray();
        char[] B = J.toCharArray();
        int sum = 0;
        for(int i = 0; i < lenA; i++){
        	for(int j = 0; j < lenB; j++){
        		if(A[i] == B[j])
        			sum++;
        	}
        }
        return sum;
    }
	
	public static void main(String[] args) {
		String J = "a";
		String S = "aAAbbbb";
		System.out.println(J.length());
		System.out.println(numJewelsInStones(J,S));
	}
}
