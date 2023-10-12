/**
 * 
 */
package interface_class;

/**
 *  Interface Class contains only abstract methods and we cannot create a method with implementation
 */
public interface Interface_Ex1 {

// in interface class by default methods are abstract methods so we don't have to insert abstract in a interface class
	
	public static  void method1() {
		System.out.println(":: Brooooo! ::");
	}
	
	public int method2();
	
	public static void main(String[] args) {
		System.out.println(":: hello ::");
		method1();
	}
	
}
