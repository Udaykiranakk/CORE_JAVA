/**
 * 
 */
package practice;
import java.util.Scanner;
/**
 * 
 */
public class Atm_Machine {

	String name="uday";
	String pass="uday2";
	int two_thousandnotes=1;
	int five_hundrednotes=5;
//	int one_hundrednotes=5;
	int available=4500;
	int balance;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Atm_Machine atm_Machine=new Atm_Machine();
		atm_Machine.atm();
	}
	
	//
	
	public void atm() {
		
		
		System.out.print("Please Enter Your UserName : ");
		String username=sc.next();
		
		System.out.print("Please Enter Your Password : ");
		String password=sc.next();
		
		if(username.equals(name) && password.equals(pass) ) {
			System.out.print("Please Enter Amount Multiple of 500 : ");
			int amount=sc.nextInt();
		
			int two_thousand=amount/2000;
			int five_hundred=amount/500;
	//		int one_hundred=amount/100;
		
			if(amount % 2000 == 0 || amount % 500 == 0 || amount % 100 == 0) {
				if(amount >=500 && amount<=available) {
				switch(amount) {
				
				case 500:
					System.out.println("Please Collect Your "+ five_hundred+" Cash...");
					five_hundrednotes -=1;
					balance=available-500;
					System.out.println("Now available balance is "+balance);
				    break;
				case 1000:
					System.out.println("Please Collect Your "+ five_hundred+" '500' notes of Cash...");
					five_hundrednotes -=2;
					balance=available-1000;
					System.out.println("Now available balance is "+balance);
					break;
				case 1500:
					System.out.println("Please Collect Your "+ five_hundred+" '500' notes of Cash...");
					five_hundrednotes -=3;
					balance=available-1500;
					System.out.println("Now available balance is "+balance);
					break;
				case 2000:
					System.out.println("Please Collect Your "+five_hundred+" '500' notes of Cash...");
					five_hundrednotes -=4;
					balance=available-2000;
					System.out.println("Now available balance is "+balance);
					break;
				case 2500:
					System.out.println("Please Collect Your "+two_thousandnotes+" '2000' and "+ (five_hundrednotes-4)+" '500' notes of Cash...");
					five_hundrednotes -=1;
					two_thousandnotes -=1;
					balance=available-2500;
					System.out.println("Now available balance is "+balance);
					break;
				case 3000:
					System.out.println("Please Collect Your "+two_thousandnotes+" '2000' and "+ (five_hundrednotes-3)+" '500' notes of Cash...");
					five_hundrednotes -=2;
					two_thousandnotes -=1;
					balance=available-3000;
					System.out.println("Now available balance is "+balance);
					break;
				case 3500:
					System.out.println("Please Collect Your "+two_thousandnotes+" '2000' and "+ (five_hundrednotes-2)+" '500' notes of Cash...");
					five_hundrednotes -=3;
					two_thousandnotes -=1;
					balance=available-3500;
					System.out.println("Now available balance is "+balance);
					break;
				case 4000:
					System.out.println("Please Collect Your "+two_thousandnotes+" '2000' and "+ (five_hundrednotes-1)+" '500' notes of Cash...");
					five_hundrednotes -=4;
					two_thousandnotes -=1;
					balance=available-4000;
					System.out.println("Now available balance is "+balance);
					break;
				case 4500:
					System.out.println("Please Collect Your "+two_thousandnotes+" '2000' and "+ five_hundrednotes+" '500' notes of Cash...");
					five_hundrednotes -=5;
					two_thousandnotes -=1;
					balance=available-4500;
					System.out.println("Now available balance is..= "+balance);
					break;
				default:
					System.out.println(": Invalid amount it's beyond my limit :");
					break;
				}
				System.out.println("::  ⬇️⬇️⬇️⬇️⬇️   ⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️ :::");
			System.out.println(":: Transaction Processing ::");
			System.out.println("::  ⬇️⬇️⬇️⬇️⬇️  :::");
			System.out.println("Please Collect Your "+five_hundred+" '500' notes of cash from the dispensary...");
			}
				
			else {
				System.out.println(": Enter a valid amount :");
				System.out.println("::  ⬇️⬇️⬇️⬇️⬇️  :::");
				System.out.println("::  ⬇️⬇️⬇️⬇️⬇️  :::");
				System.out.println("::  ⬇️⬇️⬇️⬇️⬇️  :::");
				System.out.println("You have been logged out Please login agian...");
				atm();
				
			}
			
		}else {
			System.out.println(": Invalid Credentials Please Try Again :");
			System.out.println("::  ⬇️⬇️⬇️⬇️⬇️  :::");
			System.out.println("::  ⬇️⬇️⬇️⬇️⬇️  :::");
			System.out.println("::  ⬇️⬇️⬇️⬇️⬇️  :::");
			System.out.println("You have been logged out Please login agian...");
			atm();
			
		}
		
		 
		
		
	}
	
	
	}
	
	//
	
	
	

}
