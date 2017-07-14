import java.util.ArrayList;
import java.util.List;

public class Solution54 {
	
	public static void circle(int[][] matrix, int startX, int startY, int width, int high, List<Integer> list) {
		if (width > 0) {
			for (int i = startY; i < startY + width; i++) {
				list.add(matrix[startX][i]);
			}
		}
		
		if (high > 0) {
			for (int i = startX + 1; i < startX + high; i++) {
				list.add(matrix[i][startY + width - 1]);
			}
		}
		
		if (high > 0 && width > 0) {
			for (int i = startY + width - 2; i > startY; i--) {
				list.add(matrix[startX + high - 1][i]);
			}
		}
		
		if (high > 0 && width > 0) {
			for (int i = startX + high - 2; i > startX; i--) {
				list.add(matrix[i][startY]);
			}
		}
	}
	
	
    public static List<Integer> spiralOrder(int[][] matrix) {
        int startX = 0;
        int startY = 0;
        int width = matrix[0].length;
        int high = matrix.length;
        List<Integer> list = new ArrayList();
        while (startX <= matrix.length / 2 && startY <= matrix[0].length / 2) {
        	circle(matrix,startX,startY,width,high,list);
        	startX++;
        	startY++;
        	width -= 2;
        	high -= 2;
        }
    	return list;
    }
    
    public static void main(String[] args) {
    	int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    	List<Integer> list = spiralOrder(matrix);
    	System.out.println(list.toString());
    }
}