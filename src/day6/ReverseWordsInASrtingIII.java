package day6;

public class ReverseWordsInASrtingIII {
	
	public static String reverseWords(String s) {
        String[] a = s.split(" ");
        for (int i = 0; i < a.length; i++) {
			a[i] = new StringBuilder(a[i]).reverse().toString();
		}
        String reversed = "";
        for (int i = 0; i < a.length - 1; i++) {
			reversed = reversed + a[i] + " ";
		}
        return reversed + a[a.length-1];
    }
	
	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}
}
