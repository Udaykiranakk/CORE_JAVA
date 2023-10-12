package practice;

public class Reg_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User_Details user_Details=new User_Details();
		Registration dog = user_Details.getDetails();
		
		System.out.println("Employee Id is :  "+dog.emply_id);
		System.out.println( "Full name : "+dog.f_name+" "+dog.l_name);
		System.out.println("Email Address is : "+dog.email);
		System.out.println("Gender is : "+dog.gender);
		System.out.println("Age is : "+dog.age);
	    System.out.println("Mobile Number is : "+dog.mobile_num);
		user_Details.getmethode();
		}
	}


