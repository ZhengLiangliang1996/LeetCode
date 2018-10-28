package day9;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;

public class FizzBuzz {
	
	public static List<String> fizzBuzz(int n) {
        List<String> a = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
			if(i % 3 == 0 && i %5 == 0){
				a.add("FizzBuzz");
			}
			else if(i % 5 == 0){
				a.add("Buzz");		
			}
			else if(i % 3 == 0){
				a.add("Fizz");
			}
			else{
				a.add(String.valueOf(i));
			}
		}
        return a;
    }
	
	public static void main(String[] args) {
		
	}
}
