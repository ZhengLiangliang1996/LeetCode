package day3;

import java.util.LinkedList;
import java.util.List;

public class SelfDividingNumber {
	
	private static boolean IsSelfDividingNumber(int i) {
		int always = i;
		int temp,num;
		while(i >= 1){
			temp = i;
			i = i/10;
			num = temp - i*10;
			if(num == 0)
				return false;
			if(always % num != 0 ){
				return false;
			}
		}
		return true;
	}
	
	public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new LinkedList();
        for(int i = left; i<= right; i++){
        	if(i % 10 == 0)
        		continue;
        	if(IsSelfDividingNumber(i))
        		l.add(i);
        }
        return l;
    }
	
	

	public static void main(String[] args) {
		System.out.println(IsSelfDividingNumber(45));
	}
}
