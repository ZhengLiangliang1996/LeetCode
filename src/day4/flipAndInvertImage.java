package day4;

//import java.lang.reflect.Array;

public class flipAndInvertImage {
	
	
	public static void main(String[] args) {
		int aArray[][] = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		int array[][] = flipAndInvertImage(aArray);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
			System.out.println("");
		}
	}

	private static int[][] flipAndInvertImage(int[][] aArray) {
		//flip the array
		for (int i = 0; i < aArray.length; i++) {
			for (int j = 0; j < aArray[i].length / 2; j++) {
				int temp = aArray[i][j];
				aArray[i][j] = aArray[i][aArray[i].length - 1 - j];
				aArray[i][aArray[i].length - 1 - j] = temp;
			}
		}
		
		//invert the array
		for (int i = 0; i < aArray.length; i++) {
			for (int j = 0; j < aArray[i].length; j++) {
				aArray[i][j] = aArray[i][j] ^ 1;
			}
		}
		return aArray;
	}
}
