package day31;

public class LargestTriangleArea {
	
	public static double largestTriangleArea(int[][] points) {
		double res = 0;
        for (int i = 0; i < points.length; ++i) {
            for (int j = i + 1; j < points.length; ++j) {
                for (int k = j + 1; k < points.length; ++k) {
                    int x1 = points[i][0], y1 = points[i][1];
                    int x2 = points[j][0], y2 = points[j][1];
                    int x3 = points[k][0], y3 = points[k][1];
                    double area = Math.abs(0.5 * (x2 * y3 + x1 * y2 + x3 * y1 - x3 * y2 - x2 * y1 - x1 * y3));
                    res = Math.max(res, area);
                }
            }
        }
        return res;
    }
    	
	public static void main(String[] args) {
		int[][] point = {{4,6},{6,5},{3,1}};
		//System.out.println(point.length);
		System.out.println(largestTriangleArea(point));
	}
}
