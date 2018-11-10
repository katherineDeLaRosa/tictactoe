
public class Menu {
	public void displayMain()
	{
		System.out.println("Main menu");
		System.out.println("1. One Player");
		System.out.println("2. Two Player");
		System.out.println("3. settings");
		System.out.println("4. exit");
		System.out.println("What do you want?");
		
	}

	public void displayGame1()
	{
		System.out.println("One Player Game");
		//here is where the call will be
		
	}
	public void displayGame2()
	{
		System.out.println("Two Player Game");
		//here is where the call will be 
		
	}
	public void displaySettings()
	{
		System.out.println("Settings");
		System.out.println("Sound: 1.On		2. Off");
	}
	public void DisplayWin()
	{
		System.out.println("You Win!");
		System.out.println("Would you like to play again?");
		System.out.println("1. Yes");
		System.out.println("2. No");	
	}
	public void DisplayDraw()
	{
		System.out.println("Draw!");
		System.out.println("Would you like to play again?");
		System.out.println("1. Yes");
		System.out.println("2. No");
	}

	public void ComputerWin()
	{
		System.out.println("Computer win!");
		System.out.println("Would you like to play again?");
		System.out.println("1. Yes");
		System.out.println("2. No");
	}
}