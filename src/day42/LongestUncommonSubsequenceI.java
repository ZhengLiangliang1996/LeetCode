package day42;

public class LongestUncommonSubsequenceI {
	
    public static int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }	
	
	public static void main(String[] args) {
		System.out.println(findLUSlength("abc","cvc"));
	}
}
