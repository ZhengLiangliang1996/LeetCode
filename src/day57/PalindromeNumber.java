package day57;

public class PalindromeNumber {
	public static boolean isPalindrome(int x) {
		String x1 = Integer.toString(x);
		char[] x2 = x1.toCharArray();
		if (x2.length == 1){
			return true;
		}
		for (int i = 0; i < x2.length / 2; i++) {
			if(x2[i] != x2[x2.length - 1 - i]){
				return false;
			}
		}
		return true;
    }
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(10));
	}
}
