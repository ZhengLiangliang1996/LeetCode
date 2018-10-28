package day3;

public class RobotReturnToOrigin {
	public static boolean judgeCircle(String moves) {
        int firstDot = 0;
        int secondDot = 0;
        char[] move = moves.toCharArray();
        for (int i = 0; i < move.length; i++) {
			if(move[i] == 'R')
				firstDot +=1;
			if(move[i] == 'L')
				firstDot -=1;
			if(move[i] == 'U')
				secondDot +=1;
			if(move[i] == 'D')
				secondDot -=1;
		}
        if(secondDot == 0 && firstDot == 0) 
        	return true;
        else {
			return false;
		}
    }
	
	public static void main(String[] args) {
		String input = "UD";
		System.out.println(judgeCircle(input));
	}
}
