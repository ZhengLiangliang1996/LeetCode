package day48;


public class validPerfectSquare {
	
    public static boolean isPerfectSquare(int num) {
//    	if(num == 1){
//    		return true;
//    	}
//    	if(num >= 4){
//    		for (int i = 2; i <= num/2; i++) {
//				if(i * i == num)
//					return true;
//			}
//        }
//        return false;
    	
    	double s = Math.sqrt(num);
    	return (s - Math.floor(s) == 0) ? true : false;
    }
	
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(14));
	}
	
}
