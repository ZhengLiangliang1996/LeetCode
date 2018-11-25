package day57;

import day1.ToLowerCase;

public class ValidPalindrome {
	
	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		s = s.replaceAll(" +","");
		System.out.println(s);
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
			if (!Character.isLetterOrDigit(s.charAt(i))) {
				i++;
				continue;
			}
			if (!Character.isLetterOrDigit(s.charAt(j))) {
				j--;
				continue;
			}
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else
				return false;
		}
		return true;
    }
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}
}
