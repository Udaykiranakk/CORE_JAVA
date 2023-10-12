/**
 * 
 */
package practice;
import java.util.Scanner;
/**
 * 
 */
public class Calculation_Imp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		int input =sc.nextInt();
		int count=0;
		for(int i=1;i<=input; i++){
		    if(input % i == 0){
		        count++;
		    }
		}

		if(count == 2){
		    System.out.println("input "+input+" is a PrimeNumber ");
		}else{
			System.out.println("input "+input+" is not a PrimeNumber ");
		}
	}

}
