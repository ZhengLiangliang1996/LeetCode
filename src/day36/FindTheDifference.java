package day36;

public class FindTheDifference {
	
	 public static char findTheDifference(String s, String t) {
		    char[] a = s.toCharArray();
		    char[] b = t.toCharArray();
		    char res = 0;
	        for (char c : a) res ^= c;
	        for (char c : b) res ^= c;
	        return res;
	 }
	
	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		System.out.println(findTheDifference(s,t));
	}
}
