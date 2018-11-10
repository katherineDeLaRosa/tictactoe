import java.util.*;
public class TicTacToeGame {

	public char board[][]; 
	Random rand = new Random();
	
	public void TicTacToe() {
		board = new char [3][3];
		
		for (int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++)
				board [r][c] = ' ';
		}
	}
	
		
	public void displayBoard() {
		System.out.println(" | " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " | ");
		System.out.println("---------------");
		System.out.println(" | " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " | ");
		System.out.println("---------------");
		System.out.println(" | " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " | ");
		
		
	}
	
	public boolean displayPlayermove(int x, int y) {
		if ((x < 0 || x > 3) || (y < 0 || y > 3))
		{
			System.out.println("Invalid input. 0-2 only!");
			return false;
		}
		else if(board[x][y] == ' ' ) {
			board[x][y] = 'X';
			return true;
		}
		else
			System.out.println("spot taken. choose another!");
			
		return false;
	}
	
	public void displayCpumove() {
		boolean t = true;
		while(t == true) {
			int x = rand.nextInt(3);
			int y = rand.nextInt(3);
			
			if(board[x][y] == ' ' ) {
				board[x][y] = 'O';
				t = false;
			}
		}
	}
	public boolean displayPlayer2move(int x, int y) {
		if ((x < 0 || x>3) || (y < 0 || y > 3))
		{
			System.out.println("Invalid input. 0-2 only!");
			return false;
		}
		else if(board[x][y] == ' ' ) {

			board[x][y] = 'O';
			return true;
		}
		else
			System.out.println("spot taken. choose another!");
			
		return false;
	}
	public void clearBoard() {
		board = new char [3][3];
		
		for (int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++)
				board [r][c] = ' ';
		}
	}
	
}