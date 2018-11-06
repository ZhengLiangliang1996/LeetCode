package day41;

public class DetectCapital {
	
    public static boolean detectCapitalUse(String word) {
        char[] a = word.toCharArray();
        if(a.length >= 2){
	        for (int i = 1; i < a.length; i++) {
				//if the first letter is in capital and second is in capital
	        	if(a[0] < 97 && a[1] < 97){
					if(a[i] >= 97){
						return false;
					}
				}
	        	
	        	if(a[0] < 97 && a[1] >= 97){
	        		if(a[i] < 97){
	        			return false;
	        		}
	        	}
	        	//if the second letter is not in capital
	        	if(a[0] >= 97){
	        		if(a[i] < 97){
						return false;
					}
	        	}
			}
        }
        return true;
    }
	
	public static void main(String[] args) {
		String s ="ZIIQa";
		System.out.println(detectCapitalUse(s));
	}
}
