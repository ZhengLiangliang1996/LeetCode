package day49;

import java.security.KeyStore.Builder;

public class Base7 {
	
    public static String convertToBase7(int num) {
    	if (num == 0){
    		return "0";
    	}
    	int num1 = Math.abs(num);
    	StringBuilder a = new StringBuilder();
    	while(num1 != 0){
    		a.append(num1 % 7);
    		num1 /= 7;
    	}
    	if(num < 0){
    		a.append('-');
    	}
    	return a.reverse().toString();
	}
	
	public static void main(String[] args) {
		int a = 100;
		System.out.println(convertToBase7(a));
	}
}
