package LabsWeek3;
import java.util.Scanner; 

public class exercise6 {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int userYear; 
		int leapYear; 
		
		System.out.println("Please enter a year: ");
		userYear = input.nextInt(); 
		
		leapYear = userYear%100; 
		
		if(leapYear == 1)
		{
			leapYear = userYear%400; 
			if (leapYear == 0)
			{
				System.out.println("Your submitted year " + userYear + " is a leap year!");
			}
			else
			{
				System.out.println("Unfortunately, your submitted year " + userYear + " is not a leap year");
			}
		}
		else
		{
			leapYear = userYear%4; 
			if (leapYear == 0)
			{
				System.out.println("Your submitted year " + userYear + " is a leap year!");
			}
			else
			{
				System.out.println("Unfortunately, your submitted year " + userYear + " is not a leap year");
			}
		}
		
		input.close();
		
		
	}

}
