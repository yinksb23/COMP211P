package LabsWeek3;

import java.util.Scanner; 

public class exercise3 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); 
		final int baseBonus = 50; 
		final int addBonus10 = 50; 
		final int addBonus100 = 100; 
		int totalBonus; 
		
		System.out.println("How many years have you been with the company? ");
		int yearsWithCom = input.nextInt();
		
		if (yearsWithCom >= 10 && yearsWithCom < 10)
		{
			totalBonus = baseBonus + addBonus10; 
			System.out.println("You will receive a Christmas bonus of " + totalBonus + " pounds");
		}
		else if (yearsWithCom >= 20)
		{
			totalBonus = baseBonus + addBonus100; 
			System.out.println("You will receive a Christmas bonus of " + totalBonus + " pounds");
		}
		else
		{
			totalBonus = baseBonus; 
			System.out.println("You will receive the standard Christmas bonus of " + totalBonus + " pounds");
		}
		
		input.close();
	}
}
