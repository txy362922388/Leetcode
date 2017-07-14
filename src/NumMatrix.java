/**
 * Created by EVAN on 2017/7/13.
 */
/**
 * Created by EVAN on 2017/7/13.
 */
public class NumMatrix {

    public int[][] table;
    public NumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0)
            return;
        int row = matrix.length;
        int col = matrix[0].length;
        table = new int[row][col];
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += matrix[i][j];
                table[i][j] = sum;
            }
        }
        for (int i = 0; i < col; i++) {
            int sum = 0;
            for (int j = 0; j < row; j++) {
                sum += table[j][i];
                table[j][i] = sum;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (row1 == 0 && col1 == 0)
            return table[row2][col2];
        if (row1 == 0)
            return table[row2][col2] - table[row2][col1 - 1];
        if (col1 == 0)
            return table[row2][col2] - table[row1 - 1][col2];
        return table[row2][col2] - table[row2][col1 - 1] - table[row1 - 1][col2] + table[row1 - 1][col1 - 1];
    }
}