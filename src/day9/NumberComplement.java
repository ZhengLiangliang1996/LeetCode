package day9;

public class NumberComplement {
	
	public static int findComplement(int num) {
        int yanma=0;
        int tmp = num;
        while(tmp >0){
        	tmp /=2;
        	yanma++;
        }
        
        return ~num & ((1 << yanma) - 1);
    }
	
	public static void main(String[] args) {
		System.out.println(findComplement(5));
	}
}
