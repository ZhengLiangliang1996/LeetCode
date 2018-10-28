package day13;


public class ReverseOnlyLetters {
	
	public static String reverseOnlyLetters(String S) {
		char[] a = S.toCharArray();
		int l = 0;
		int r = S.length() - 1;
		char temp;
		while(l < r){
			if(((a[l] <= 'Z' && a[l] >= 'A')
               || (a[l] <= 'z' && a[l] >= 'a'))
               && ((a[r] <= 'Z' && a[r] >= 'A')
               || (a[r] <= 'z' && a[r] >= 'a'))){
				temp = a[r];
				a[r] = a[l];
				a[l] = temp;
				r--;
				l++;
			}	
			else if(!((a[l] <= 'Z' && a[l] >= 'A')
		               || (a[l] <= 'z' && a[l] >= 'a'))
		               && ((a[r] <= 'Z' && a[r] >= 'A')
		               || (a[r] <= 'z' && a[r] >= 'a'))){
				l++;
			}
			else if(((a[l] <= 'Z' && a[l] >= 'A')
               || (a[l] <= 'z' && a[l] >= 'a'))
               && !((a[r] <= 'Z' && a[r] >= 'A')
               || (a[r] <= 'z' && a[r] >= 'a'))){
				r--;
			}
			else{
				l++;
				r--;
			}
		}
		String s = new String(a);
		return s;
    }
	
	public static void main(String[] args) {
		String a = "a-bC-dEf-ghIj";
		System.out.println(reverseOnlyLetters(a));
	}
}
