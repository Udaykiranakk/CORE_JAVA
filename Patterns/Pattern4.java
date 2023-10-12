package Patterns;
import java.util.Scanner;

// Pattern4 Program
public class Pattern4 {
	
 	
	
	
	
	
	public static    void main(String[] args) {
		 Pattern4 p4= new Pattern4();
		 Scanner sc=new Scanner(System.in);
		
		System.out.println("::: Enter A Number To Print Star Pattern ::: ");
		int input2=sc.nextInt();
		for(int i=0; i<input2; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=input2; k>i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

}
