/**
 * 
 */
package practice;
import java.util.Scanner;
/**
 * 
 */
public class Calculator {

	static Scanner sc=new Scanner(System.in);
	 
	 
	
	public void calci() {
		System.out.print("Please Enter a number :: ");
		int input1=sc.nextInt();
		
		System.out.print("Please Select an Operator '+' or '-' or '*' or '/' or '%'  :: ");
		
		String op=sc.next();
		
		System.out.print("Please Enter a number :: ");
		int input2=sc.nextInt();
		switch(op) {
		
		case "+":
			System.out.println("Addition of Two Numbers is : "+ (input1+input2) );
			break;
		case "-":
			System.out.println("Substraction of Two Numbers is : "+ (input1-input2 ));
			break;
		case "*":
			System.out.println("Multiplication of Two Numbers is : "+ (input1*input2 ));
			break;
		case "/":
			System.out.println("Divition of Two Numbers is : "+ (input1/input2) );
			break;
		case "%":
			System.out.println("Modules of Two Numbers is : "+ (input1%input2) );
			break;
			default:
				System.out.println(":: Invalid Input Number ::");
				break;
			
		}
		
		
		sc.close();
		 
		
	}
	
	
	
	
}


