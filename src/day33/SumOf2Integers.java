package day33;

public class SumOf2Integers {
	public static int getSum(int a, int b) {
        if(a == 0) return b;
        int x = a ^ b;// xor 
        int c = (a & b) << 1; //得到进位
        return getSum(c, x);      		
	}
	
	public static void main(String[] args) {
		System.out.println(getSum(-2, 3));
	}
}
