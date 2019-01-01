package day68;

import org.omg.CORBA.INTERNAL;

import day37.SumOfLeftLeaves;

public class NumberOfDigitOne {
	
	public static int digitCounts(int n) {
        int count = 0;
        int k = 1;
        char kChar = (char)(k + '0');
        for (int i = k; i <= n; i++) {
            char[] iChars = Integer.toString(i).toCharArray();
            for (char iChar : iChars) {
                if (kChar == iChar) count++;
            }
        }

        return count;
    }
	
	public int countDigitOne(int n) {

	    if (n <= 0) return 0;
	    int q = n, x = 1, ans = 0;
	    do {
	        int digit = q % 10;
	        q /= 10;
	        ans += q * x;
	        if (digit == 1) ans += n % x + 1;
	        if (digit >  1) ans += x;
	        x *= 10;
	    } while (q > 0);
	    return ans;

	}

	public static void main(String[] args) {
		System.out.println(digitCounts(13));
	}
}
