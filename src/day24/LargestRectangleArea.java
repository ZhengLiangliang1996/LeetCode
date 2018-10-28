package day24;

public class LargestRectangleArea {
	
	public static int largestRectangleArea(int[] heights) {
        //if(heights.length == 1){
        //	return heights[0];
        //}
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
                 stack_index--; //代替了pop的动作
             }
        	//入栈
        	 while(stack_index < i){
        		 stack[++stack_index] = heightsplus[i];
        	 }
        	 i++;
        }
        return max_area;
    }
	
	public static void main(String[] args) {
		int[] height = {2,1,5,6,2,3};
		System.out.println(largestRectangleArea(height));
	}
}
