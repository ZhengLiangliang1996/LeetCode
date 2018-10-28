package day5;

import java.lang.reflect.Array;

public class TransposeMatrix {
	
	public static int[][] transpose(int[][] A) {
        int row = A.length;
        int coloum = A[0].length;
        
        int transM[][] = new int[coloum][row];
        for (int i = 0; i < coloum; i++) {
			for (int j = 0; j < row; j++) {
				transM[i][j] = A[j][i];
			}
		}
        return transM;
    }
	
	public static void main(String[] args) {
		int aArray[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int bArray[][] = transpose(aArray);
		for (int i = 0; i < bArray.length; i++) {
			for (int j = 0; j < bArray[0].length; j++) {
				System.out.print(bArray[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
