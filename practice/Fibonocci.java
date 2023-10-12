package practice;
import java.util.Scanner;
public class Fibonocci {
 
	Scanner input=new Scanner(System.in);
	
	 void fibonacciLogic() {
	// Fibonocci series
		 
		System.out.println(" :: Enter The Number Of Fibonacci Numbers :: ");
		
		 int count=input.nextInt();
		 int num1=0,num2=1,num3;
		 System.out.println("Given output is :: "+count);
		 System.out.println(num1+" "+num2+" ");
	
			for(int j=0; j<count; j++) {
				num3=num1+num2;
				System.out.println( num3+" ");
				num1=num2;
				num2=num3;	
			}
			System.out.println();
			System.out.println(" :: Press 1 to Continue or Press 0 to Exit :: ");
			int choice = input.nextInt();
			if (choice == 1) {
				System.out.println(" :: You Choose 1 So, Lets Do This Again 😉 :: ");
				fibonacciLogic();
			}else if (choice == 0) {
				System.out.println(" :: 😣 You Choose 0 Which Means You Want To Exit 😣 ");
				System.out.println(" :: 😇 You Have Exited Successfully 😇 :: ");
			}
			else {
				System.out.println(" ::  🥹 You Have Choosen a Invalid Input  🥹 :: Lets Do This Again 😉 :: ");
				fibonacciLogic();
			}
}
}
