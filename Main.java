package javaApp;
import java.util.*;
public class Main {
	public static void guessnumber()
	{
		Scanner sc = new Scanner(System.in);
		int k=5,guess;
		String anw="yes";
		while(anw.equalsIgnoreCase("yes"))
		{
			System.out.println("WELCOME\n"
					+ "You have 5 chances to guess a number, give your best :)");
			
			boolean flag=false;
			
			for(int i=1;i<=5;i++)
			{
				int number = 1+(int)(100*Math.random());
				
				System.out.println("Guess a number : ");
				guess = sc.nextInt();
				
				if(guess==number)
				{
					System.out.println("Congrats ! "
							+ "	You have Guessed number correct");
					flag=true;
					break;
				}else if(guess>number)
				{
					System.out.println("Your guess is grater than actual number");
				}else if(guess<number)
				{
					System.out.println("Your guess is smaller than actul number");
				}else
				{
					System.out.println("Invalid input");
				}
				
			}
			
			if(!flag)
			{	System.out.println("\n\nLose the game ! "
						+ "You exhausted with you 5 chances\n\n");
			}
			
			sc.nextLine();
			
			System.out.println("Do you want to restart game again?"
					+ "type 'yes' if you want to OR "
					+ "type 'no' if you want to exit");
			anw = sc.nextLine();
		}
	}
	
	public static void main(String x[])
	{
		guessnumber();
	}
}
