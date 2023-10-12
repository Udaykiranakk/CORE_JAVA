package switch_Cases;
import java.util.Scanner;
public class SwitchCase_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print(":: Please Enter a Input Number Between 1-7  For SwitchCase Use :: ");
		int day=sc.nextInt();
		
		switch(day) {
		case 1:
			System.out.println(":: It's Monday ::");
			break;
		case 2:
			System.out.println(":: It's Tuesday ::");
			break;
		case 3:
			System.out.println(":: It's Wednessday ::");
			break;
		case 4:
			System.out.println(":: It's Thursday ::");
			break;
		case 5:
			System.out.println(":: It's Friday ::");
			break;
		case 6:
			System.out.println(":: It's Saturday ::");
			break;
		case 7:
			System.out.println(":: Obviously It's Sunday ::");
			break;
		default:
			System.out.println(":: You Have Entered a Incorrect Number For The Case ::");
			break;
		}
	}

}
