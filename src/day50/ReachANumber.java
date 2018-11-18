package day50;

public class ReachANumber {
	
	public static int reachNumber(int target) {
		//induction
		//symmetrical
		target = Math.abs(target);
        //steps 
		int i = 0;
		// 1+2+.....+n = n*(n+1)/2
		while(i * (i + 1) < 2 * target) i++;
		
		if(i * (i + 1) == 2 * target) return i;
		
		 //ifn(n+1)/2>target, need to go to left(negation)
        //1 . n(n+1)/2 - target is even，to target, need to go n(n+1)/2 - target even step ，
		else{
			if((i * (i + 1)/ 2 - target) % 2 == 0) return i;
			else{
				//n(n+1)/2 - target is odd，if n is odd ,then n + 1 is even then n+2
		        //if n is even，then n+1 is odd，then n+1
				if(i % 2 == 0) return i + 1;
				else 
					return i+2;
			}
		}
        
    }
	
	public static void main(String[] args) {
		System.out.println(reachNumber(4));
	}
}
