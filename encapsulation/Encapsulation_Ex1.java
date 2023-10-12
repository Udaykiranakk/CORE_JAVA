/**
 * 
 */
package encapsulation;

/**
 * 
 */
// Encapsulation is nothing but Set of members and functions under a single roof
 public class Encapsulation_Ex1 {

	int a=10;
	String b="Hey!";
	float c= 22.2f;
	double d= 2.22;
	char e='M';
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// static methods can be accessed in main method as main method is static
		method1(); 
		age();
		name();
		
		//for non-static methods we can call them by creating object and using object reference
		Encapsulation_Ex1  encapsulation=new Encapsulation_Ex1();
		encapsulation.something();
		
	}
	
	public static void method1() {
		System.out.println(" Hi! ");
	}
	public void something() {
		System.out.println(":: Your Name :: ");
	}
	public static int age() {
		int age=21;
		System.out.println(age);
		return age;
	}
	public static String name() {
		String name=" Your Name ";
		System.out.println(name);
		return name;
	}
	
}
