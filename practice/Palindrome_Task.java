package practice;
import java.util.Scanner;
public class Palindrome_Task {

	public static void main(String args[]){
	String original, reverse = ""; Scanner in = new Scanner(System.in);
	 
	System.out.println("Enter a string to check if it is a palindrome::: ");
	original = in.nextLine();
	 
	int length = original.length();
	 
	for ( int i = length - 1; i >= 0; i-- ) {
		reverse = reverse + original.charAt(i);
	
	}
	if (original.equals(reverse)) System.out.println("Entered string is a palindrome.");
	else
	System.out.println("Entered string is not a palindrome.");
	alternate_palindrome();
	
	}
	
	
	// alternate method
	
	public static void alternate_palindrome(){
		
		System.out.println("::Alternate Method::");
		String inputString;
		
		Scanner in2 = new Scanner(System.in);
		 
		System.out.println("Input a string"); inputString = in2.nextLine();
		 
		int length = inputString.length();
		int i, begin, end, middle;
		 
		begin = 0;
		end = length - 1; middle = (begin + end)/2;
		 
		for (i = begin; i <= middle; i++) {
		if (inputString.charAt(begin) == inputString.charAt(end)) { begin++;
		end--;
		}
		else {
		break;
		}
		}

		 
		if (i == middle + 1) { System.out.println("Palindrome");
		}
		else {
		System.out.println("Not a palindrome");
		}
		}
		



	}


