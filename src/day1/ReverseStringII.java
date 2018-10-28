package day1;

public class ReverseStringII {
	
	public static void swap(char[] a, int i, int j){
		char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
	}
	
	public static void reverseall(char[] a,int start ,int len) {
		for(int i = start; i <= len /2; i++){
			swap(a, i, len-i);
		}
	}
	
	public static char[] reverseStr(String s, int k) {
        int len = s.length();
        char[] a = s.toCharArray();
        if (len <= k) {
        	reverseall(a, 0, len-1);
		}else{
			for(int i = 0; i < len; i = i + 2*k - 1){
				reverseall(a, i, i + k - 1);
			}
		}
        return a;
    }
	
	public static void main(String[] args) {
		char[] a = {'a','b','c'};
		reverseall(a, 0 ,2);
		System.out.println(a);
		String s = "abcdefg";
		int k = 2;
		System.out.println(reverseStr(s,k));
	}
}
