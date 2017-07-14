import java.util.Scanner;

public class JD {
	public static boolean isWin(char[] board, char c) {
		if (board[0] == c && board[1] == c && board[2] == c ||
		    board[3] == c && board[4] == c && board[5] == c	||
		    board[6] == c && board[7] == c && board[8] == c	||
		    board[0] == c && board[3] == c && board[6] == c	||
		    board[1] == c && board[4] == c && board[7] == c	||
		    board[2] == c && board[5] == c && board[8] == c	||
		    board[0] == c && board[4] == c && board[8] == c	||
		    board[2] == c && board[4] == c && board[6] == c) 
			return true;
		return false;
	}
	
	public static boolean isValid(char[] board) {
		int x = 0;
		int o = 0; 
		for (int i = 0; i < board.length; i++) {
			if (board[i] == 'X')
				x++;
			if (board[i] == '0')
				o++;
		}
		if (x - o == 0 || x - o == 1)
			return true;
		return false;
	}
	
	public static boolean isDrawn(char[] board) {
		int x = 0;
		int o = 0; 
		for (int i = 0; i < board.length; i++) {
			if (board[i] == 'X')
				x++;
			if (board[i] == '0')
				o++;
		}
		if (x == 5 && o == 4)
			return true;
		return false;
	}
	
	public static String next(char[] board) {
		int x = 0;
		int o = 0; 
		for (int i = 0; i < board.length; i++) {
			if (board[i] == 'X')
				x++;
			if (board[i] == '0')
				o++;
		}
		if (x - o == 0)
			return "1";
		else 
			return "2";
	}
	
	public static String result(char[] board) {
		if (isValid(board)) {
			if (isWin(board, 'X') && isWin(board, '0'))
				return "x";
			if (isWin(board, 'X'))
				return "1 won";
			else if (isWin(board, '0'))
				return "2 won";
			else if (isDrawn(board))
				return "Draw";
			else 
				return next(board);
		}
		return "x";
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			int k = 0;
			char[] board = new char[9];
			for (int i = 0; i < 3; i++) {
				String ss = s.next();
				for (int j = 0; j < ss.length(); j++) {
					board[k] = ss.charAt(j);
					k++;
				}
			}
			System.out.println(result(board));
			
		}
	}
	
}
