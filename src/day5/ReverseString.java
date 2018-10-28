package day5;

public class ReverseString {
	
	public static String reverseString(String s) {
        char[] a = s.toCharArray();
        char temp;
        for (int i = 0; i < a.length / 2; i++) {
			temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}
        String b = new String(a);
        return b;
    }
	
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
	    System.out.println(reverseString(s));
	}
}
