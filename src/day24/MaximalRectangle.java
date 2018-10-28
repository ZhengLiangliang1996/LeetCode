package day24;

public class MaximalRectangle {
	
	public static int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length ==0 || matrix[0].length == 0) return 0;
        
        int row = matrix.length;
        int col = matrix[0].length;
        int max = 0;
        int []height = new int[col];
        for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(matrix[i][j] == '1'){
					height[j]++;
				}else{
					height[j] = 0;
				}
			}
			int max_area = largestRectangleArea(height);
			max = Math.max(max, max_area);
		}
        
        
        return max;
    }
	
	public static int largestRectangleArea(int[] heights) {
		    int max_area = 0;
	        int []heightsplus = new int[heights.length+1];
	        for (int i = 0; i < heights.length; i++) {
				heightsplus[i] = heights[i];
			}
	        heightsplus[heights.length] = 0;
	        
	        int []stack = new int[heightsplus.length];
	        stack[0] = heightsplus[0];
	        int i = 1;
	        int stack_index = 0;
	        while(stack_index >= 0 && i < heightsplus.length){
	        	 if (heightsplus[i] >= stack[stack_index]) {
	        		 stack[++stack_index] = heightsplus[i++];
	        		 continue;
	        	 }
	        	 while (stack_index >= 0 && stack[stack_index] > heightsplus[i]) {
	                 int area = stack[stack_index] * (i - stack_index);
	                 if (area > max_area) { max_area = area; }
	                 stack_index--;
	             }
	        	 while(stack_index < i){
	        		 stack[++stack_index] = heightsplus[i];
	        	 }
	        	 i++;
	        }
	        return max_area;
    }
	
	public static void main(String[] args) {
		char [][]matrix = {
						   {'1','0','1','0','0'},
		                   {'1','0','1','1','1'},
		                   {'1','1','1','1','1'},
		                   {'1','0','0','1','0'}
							};
		System.out.println(maximalRectangle(matrix));
	}
}
