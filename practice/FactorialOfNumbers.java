  package practice;
import java.util.Scanner;
public class FactorialOfNumbers {
	
 Scanner input= new Scanner(System.in);
 
 void factorialLogic() {
	 
	 System.out.println(" :: Enter The Number For Factorial ::");
	 int num=input.nextInt(); // taking input from the user
	 
	 long  factorial=1;
	 for(int nextnum=2; nextnum<=num; nextnum++ ) {
		 factorial *=nextnum;
		 
		 // factorial values are printed below
		 System.out.print(factorial+",");
	 }
//	 String uday= input.next();
//	 System.out.println(uday);
	 // factorial of the given number is printed below
	 System.out.println(" :: factorial of given input  is :: "+factorial);
	 
	 System.out.println(" :: Enter 1  to Continue or Press 0 to Exit :: ");
	 int num2=input.nextInt();
	 
	 if(num2 ==1 ) {
		 System.out.println(" :: 😉 Welcome Back Again 😉 ::  ");
		 factorialLogic();
		 
	 }
	 else if(num2 ==0) {
		 System.out.println(" ::: 😇 You have Successfully Exited Thank You For Using Our Service 😇 :::");
	 }else {
		 System.out.println(" :: 🥲 I'm Afraid You Have Given A Wrong Input, So I Cant Execute Anything 🥲 ::  Lets Start From The Begining 😉::");
		 factorialLogic();
	 }
}
}


