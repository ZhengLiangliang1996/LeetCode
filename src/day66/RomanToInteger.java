package day66;

public class RomanToInteger {
	public static int romanToInt(String s) {
        char[] a = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
        	if(i < a.length -1 && a[i] == 'I' && a[i+1] == 'V'){
				sum = sum + 4;
				i++;
				continue;
			}
        	
        	if(i < a.length -1 && a[i] == 'I' && a[i+1] == 'X'){
				sum = sum + 9;
				i++;
				continue;
			}
        	
        	if(i < a.length -1 && a[i] == 'X' && a[i+1] == 'C'){
				sum = sum + 90;
				i++;
				continue;
			}
        	
        	if(i < a.length -1 && a[i] == 'X' && a[i+1] == 'L'){
				sum = sum + 40;
				i++;
				continue;
			}
        	
        	
        	if(i < a.length -1 && a[i] == 'C' && a[i+1] == 'D'){
				sum = sum + 400;
				i++;
				continue;
			}
        	
        	if(i < a.length -1 && a[i] == 'C' && a[i+1] == 'M'){
				sum = sum + 900;
				i++;
				continue;
			}
        	
			if(a[i] == 'I'){
				sum = sum + 1;
			}
			
			if(a[i] == 'V'){
				sum = sum + 5;
			}
			
			if(a[i] == 'X'){
				sum = sum + 10;
			}
			
			if(a[i] == 'L'){
				sum = sum + 50;
			}
			
			if(a[i] == 'c'){
				sum = sum + 100;
			}
			
			if(a[i] == 'D'){
				sum = sum + 500;
			}
			
			if(a[i] == 'M'){
				sum = sum + 1000;
			}
		}
        return sum;
    }
	
	public static void main(String[] args) {
		String a = "DCXXI";
		System.out.println(romanToInt(a));
	}
}
