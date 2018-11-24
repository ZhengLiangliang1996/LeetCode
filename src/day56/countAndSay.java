package day56;

public class countAndSay {
	
	public static String countAndSay(int n) {
        if(n == 1) {
        	return "1";
        }
        
        //recursive 
        String str = countAndSay(n - 1) + "*";
        char[] c = str.toCharArray();
        int count = 1;
        String s = "";
        for (int i = 0; i < c.length - 1; i++) {
			if(c[i] == c[i+1]){
				count++;
			}else{
				s = s + count + c[i];
				count = 1;
			}
		}
        
        return s;
    }
	
	public static void main(String[] args) {
		int n = 4;
		countAndSay(4);
	}
}
