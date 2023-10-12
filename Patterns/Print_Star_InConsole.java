/**
 * 
 */
package Patterns;

/**
 * 
 */
public class Print_Star_InConsole {
	public static void main(String[] args) {
		int row, numberOfStars;
		 
		for (row = 1; row <= 10; row++) {
		for(numberOfStars = 10; numberOfStars >= row; numberOfStars--){ 
			System.out.print("*"); // prints star in a row
		   }
		System.out.println(); // Go to next line
		}
		
		
		}
	
	
		


}
