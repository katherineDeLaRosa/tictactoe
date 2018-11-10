import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//the setup
		Menu m = new Menu();
		TicTacToeGame t = new TicTacToeGame();
		t.TicTacToe();
		Checks z = new Checks();
		Scanner s = new Scanner(System.in);
		int x;
		int y;
		boolean kg = true;
		boolean kp = true;
		int f;
		int round = 0;
		
		while(kg == true)
		{
			//the reset
			m.displayMain();
			kp = true;
			t.clearBoard();
			round = 0;
			int uc = s.nextInt();
			//the application
			if (uc == 4 )
					kg = false;
			else if (uc == 1)
			{
				m.displayGame1();
				while (kp == true)
				{				
					round = round + 1;
					t.displayBoard();
					//player move
					System.out.println("Select x coordinate: ");
					x = s.nextInt();
					System.out.println("Select y coordinate: ");
					y = s.nextInt();
					while(t.displayPlayermove(x,y) == false)
					  {
					 		System.out.println("Select x coordinate: ");
							x = s.nextInt();
							System.out.println("Select y coordinate: ");
							y = s.nextInt();
						}
					
					//checks for win
					if (z.CheckWin(t.board) == true)
					{
						m.DisplayWin();
						x = s.nextInt();
						if (x == 2)
						{
							kg = false;
							kp = false;
						}
						else if (x == 1)
						{
							kp = false;
						}
						else if(x != 1 || x != 2)
						{
							System.out.println("Invalid input. 1 = Keep Playing, 2 = Exit");
							x = s.nextInt();
						}		
					
					}
					
					
					
					//this is for draws
					//not displaying for some reason
					//fix this
					if (round >= 9 && kp == true)
					{
						m.DisplayDraw();
						f = s.nextInt();
						if (f == 2)
						{
							kg = false;
							kp = false;
						}
						else if (f == 1)
						{
							kp = false;
						}
						else if(f != 1 || f != 2)
						{
							System.out.println("Invalid input. 1 = Keep Playing, 2 = Exit");
							x = s.nextInt();
						}					
						
					}
					
					//CPU move
					if (kp == true) 
					{
						round = round + 1; 
						t.displayCpumove();
						//if CPU wins
						if (z.CheckWin(t.board) == true)
						{
							m.ComputerWin();
							x = s.nextInt();
							if (x == 2)
							{
								kg = false;
								kp = false;
							}
							else if (x == 1)
							{
								kp = false;
							}
							else if(x != 1 || x != 2)
							{
								System.out.println("Invalid input. 1 = Keep Playing, 2 = Exit");
								x = s.nextInt();
							}					
					    }
					}
				 }
				}
			
			else if (uc == 2)
			{
				m.displayGame2();
				//needs a check for draws
				
				
				while (kp == true && round < 9)
				{
					round = round + 1;
					t.displayBoard();
					//player 1 move
					System.out.println("Select x coordinate: ");
					x = s.nextInt();
					System.out.println("Select y coordinate: ");
					y = s.nextInt();					
					while(t.displayPlayermove(x,y) == false)
					  {
					 		System.out.println("Select x coordinate: ");
							x = s.nextInt();
							System.out.println("Select y coordinate: ");
							y = s.nextInt();
						}
					
					if (z.CheckWin(t.board) == true)
					{
						m.DisplayWin();
						x = s.nextInt();	
						if (x == 2)
						{
							kg = false;
							kp = false;
						}
						else if (x == 1)
						{
							kp = false;
						}
						else if(x != 1 || x != 2)
						{
							System.out.println("Invalid input. 1 = Keep Playing, 2 = Exit");
							x = s.nextInt();
						}						
					}
					
					//draw check
					//not displaying 
					//fix this
					if (round >= 9 && kp == true)
					{
						m.DisplayDraw();
						f = s.nextInt();
						if (f == 2)
						{
							kg = false;
							kp = false;
						}
						else if (f == 1)
						{
							kp = false;
						}
						else if(f != 1 || f != 2)
						{
							System.out.println("Invalid input. 1 = Keep Playing, 2 = Exit");
							x = s.nextInt();
						}					
					}
					
					
					
					
					//this should be where player 2 starts
					round = round + 1;
					if (kp == true && round < 9)
					{
					t.displayBoard();
					System.out.println("Select x coordinate: ");
					x = s.nextInt();
					System.out.println("Select y coordinate: ");
					y = s.nextInt();
					while(t.displayPlayer2move(x,y) == false)
					  {
					 		System.out.println("Select x coordinate: ");
							x = s.nextInt();
							System.out.println("Select y coordinate: ");
							y = s.nextInt();
						}
					
					
		           
					if (z.CheckWin(t.board) == true)
					{
						m.DisplayWin();
						x = s.nextInt();
						if (x == 2)
						{
							kg = false;
							kp = false;
						}
						else if (x == 1)
						{
							kp = false;
						}
						else if(x != 1 || x != 2)
						{
							System.out.println("Invalid input. 1 = Keep Playing, 2 = Exit");
							x = s.nextInt();
						}
						
					}
					}
				}
			}
			else if (uc == 3)
			{
				m.displaySettings();
			}
			else 
			{
				System.out.print("Invalid number. 0-4 only");
			}
			//closes off the function
		}
		
		
		//these close off main
	}
	
}