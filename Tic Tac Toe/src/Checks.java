
public class Checks extends TicTacToeGame {
	public Checks()
	{
		//does nothing
	}
	//takes in the char array (theoretically this will go every turn so it know which)
	public boolean CheckWin(char [][] a)
	{
		//can assume that the array is 3 by 3
		
		//this is for diagonal 1
		if (a[0][0] == a[1][1] && a[1][1] == a[2][2] && a[0][0] != ' ')
			return true;
		
		//diagonal 2 
		if (a[2][0] == a[1][1] && a[1][1] == a[0][2] && a[1][1] != ' ')
			return true;
		
		//the verticle ones
		for (int i = 0; i < 3; i++)
		{
			if (a[0][i] == a[1][i] && a[1][i] == a[2][i] &&  a[0][i] != ' ')
				return true;
		
		}
		
		//the horizontal ones
		for (int i = 0; i < 3; i++)
		{
			if (a[i][0] == a[i][1] && a[i][1] == a[i][2] && a[i][1] != ' ')
				return true;
		
		}
		//if no wins sighted
		return false;
	}
	
	/*
	//checks if the the place is already taken
	public boolean CheckOverride(char [][] a, int x, int y)
	{
		//returns true if the space is already taken
		if (a[x][y] != ' ')
			return true;
		else 
			return false;
	} */ 
}
