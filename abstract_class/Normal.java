package abstract_class;

public class Normal extends AbstractExamples {

	public static void main(String[] args) {
	
		// TODODO Auto-generated method stub
		Normal n=new Normal();
		
		
    m3();
    m4();
	n.m1();	
	n.m2();
	
	}
	 void m1() {
		System.out.println("abstracted m1 method");
		
	}
	void m2() {
		System.out.println("abstracted m2 method");
		
	}
	static void m3(int a) {
		System.out.print("a value is overrided here ::: ");
		System.out.println(a+" :::");
 		
	}
	static void m4(int b) {
		System.out.println("Char value is Over-loaded ::: "+s+" :::");
		
	}

}
