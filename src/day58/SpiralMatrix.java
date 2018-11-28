package day58;

import java.util.LinkedList;
import java.util.List;
public class SpiralMatrix {
	
	public static List<Integer> spiralOrder(int[][] matrix) {
		int tR = 0;
		int tC = 0;
		int dR = matrix.length;
		int dC = matrix[0].length;
		List<Integer> L1 = new LinkedList<Integer>();
		while (tR <= dR && tC <= dC) {
			List<Integer> l = ListgetEdge(matrix, tR++,tC++, dR--,dC--);
			for(int i : l){
				L1.add(i);
			}
		}
		return L1;
    }
	
	//左上角的坐标 tR tC 右下角的坐标dR dC
	public static List<Integer> ListgetEdge(int[][] m, int tR,int tC,int dR,int dC){
		List<Integer> l = new LinkedList<Integer>();
		if(tR == dR){ //只有一行
			for (int i = tC; i <= dC; i++) {
				l.add(m[tR][i]);
			}
		} else if(tC == dC) {// 子矩阵只有一列{
			for (int i = tR; i <= dR; i++) {
				l.add(m[i][tC]);
			}
		} else{ // 一般情况
			int curC = tC;
			int curR = tR;
			
			while(curC != dC){
				l.add(m[tR][curC]);
				curC++;
			}
			while(curR != dR){
				l.add(m[curR][dC]);
				curR++;
			}
			
			while(curC != dC){
				l.add(m[dR][curC]);
				curC--;
			}
			
			while(curC != dC){
				l.add(m[curR][tC]);
				curR--;
			}
		
		}
		return l;
	}
	
	public static void main(String[] args) {
		int [][] matrix = {
				  {1, 2, 3, 4},
				  {5, 6, 7, 8},
				  {9,10,11,12}
		};
		List<Integer> l  = spiralOrder(matrix);
		for(int i : l){
			System.out.println(i+" ");
		}
	}
	
	
}
