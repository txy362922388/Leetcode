public class Solution79 {
    
public static boolean backtracking(char[][] board, int i, int j, char[] c, int index, boolean[][] visit) {
        
        if (index == c.length)
            return true;
        
        if (c[index] != board[i][j] || visit[i][j])
            return false;
        
            
        visit[i][j] = true;
        if (j - 1 >= 0 && backtracking(board,i,j - 1,c,index + 1,visit) ||
            j + 1 < board[0].length && backtracking(board,i,j + 1,c,index + 1,visit) ||
            i - 1 >= 0 && backtracking(board,i - 1,j,c,index + 1,visit) ||
            i + 1 < board.length && backtracking(board,i + 1,j,c,index + 1,visit)
        ) {
            return true;
        } 
        visit[i][j] = false;
        return false;
        
        
            
    }
    
    
    public static boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0] == null || board[0].length == 0)
            return false;
            
        char[] c = word.toCharArray();
        int row = board.length;
        int col = board[0].length;
        boolean[][] visit = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
                    if (backtracking(board,i,j,c,0,visit))
                        return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
    	char[][] board = {{'a'}};
    	String s = "a";
    	System.out.println(exist(board,s));
    	}
}