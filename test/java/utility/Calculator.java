package utility;

import org.testng.annotations.Test;

public class Calculator {
	
	@Test
	
	public void performCalculations()
	{
		System.out.println("Welcome to the calculator!");
		
		int num1=5;
		int num2=10;
		String operation ="+";
		int result =0;
		
		switch (operation) 
		{
		
		case "+":
			System.out.println("Addition is being performed");
			
			result =num1 + num2;
			break;
		case "-":
			System.out.println("substraction is being performed");
			
			result =num1 - num2;
			break;
		case "*":
			System.out.println("Multiplication  is being performed");
			
			result =num1 * num2;
			break;
		case "/":
			System.out.println("division is being performed");
			
			result =num1 / num2;
			break;
		default:
				System.out.println("invalid operation.please try again.");
				
		}
	
	System.out.println("Result: "+result);
}

}
