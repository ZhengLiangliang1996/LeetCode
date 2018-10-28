package day3;

public class HammingDistance {
	
	public static int hammingDistance(int x, int y) {
		int c = x ^ y;
		int sum = 0;
		int incre;
		while(c != 0){
			incre = c & 1; //
			sum += incre;
			c = c >> 1;
		}
		return sum;
    }
	
	public static void main(String[] args) {
		int x = 1;
		int y = 4;
		System.out.println(hammingDistance(x, y));
	}
}
