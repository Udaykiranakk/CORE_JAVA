/**
 * 
 */
package scanner_object;
import java.util.Scanner;
/**
 * 
 */
public class Scanner_Object_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); //Object Creation for Scanner class
		
		//
		System.out.print(":: Please Enter Your Age :: ");
		int a=sc.nextInt(); // Taking User Input of type integer. 'sc.nextInt()' is used for user input of int type here we have saved the input value in a variable
		
		//
		System.out.println(":: Please Enter your Name :: ");
		String b=sc.next(); // Taking User Input of type string.
		
		//
		System.out.println(":: Your Name is :: "+b.toUpperCase());
		//
		System.out.println(":: Your Age is :: "+a);
	}

}
