package switch_Cases;
import java.util.Scanner;
public class Case_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println(":: Our Courses 1- (Frontend-Developer), 2-(Backend-Developer), 3-(FullStack-Developer) ::");
		System.out.print(":: Please Enter a Input Number Between 1-3 To Choose Our Courses :: ");
		int choice=sc.nextInt();
		
	switch(choice) {
	
	case 1:
		System.out.println(":: You Choose Frontend-Developer Course :: ");
		System.out.print(":: If You Wish To Enroll Press 1 or Press 0 To Exit :: ");
		int f=sc.nextInt();
		if(f == 1) {
			System.out.println(":: You Have Successfully Enrolled To Our Frontend-Developer Course :: ");
		}
		else if(f ==0){
			System.out.println(":: You're Not Enrolling To Our Frontend-Developer Course. You're Missing Out a Lot..! :: ");
		}
		else {
			System.out.println(":: Sorry You Choose A Wrong Number Please Try Again :: ");
		}
		break;
	case 2:
		System.out.println(":: You Choose Backend-Developer Course :: ");
		System.out.print(":: If You Wish To Enroll Press 1 or Press 0 To Exit :: ");
		int b=sc.nextInt();
		if(b == 1) {
			System.out.println(":: You Have Successfully Enrolled To Our Backend-Developer Course :: ");
		}
		else if(b ==0){
			System.out.println(":: You're Not Enrolling To Our Backend-Developer Course. You're Missing Out a Lot..! :: ");
		}
		else {
			System.out.println(":: Sorry You Choose A Wrong Number Please Try Again :: ");
		}
		break;
	case 3:
		System.out.println(":: You Choose FullStack-Developer Course :: ");
		System.out.print(":: If You Wish To Enroll Press 1 or Press 0 To Exit :: ");
		int fs=sc.nextInt();
		if(fs == 1) {
			System.out.println(":: You Have Successfully Enrolled To Our FullStack-Developer Course :: ");
		}
		else if(fs ==0){
			System.out.println(":: You're Not Enrolling To Our FullStack-Developer Course. You're Missing Out a Lot..! :: ");
		}
		else {
			System.out.println(":: Sorry You Choose A Wrong Number Please Try Again :: ");
		}
		break;
	default:
		System.out.println(":: You Have Entered An Incorrect Number Please Try Again Reaching Us :: ");
		break;
	}
	}

}
