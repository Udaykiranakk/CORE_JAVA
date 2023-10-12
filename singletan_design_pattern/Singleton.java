/**
 * 
 */
package singletan_design_pattern;

/**
 * Singleton Design Pattern
 * 
 */
public class Singleton {

	static int a= 22;
	
	public static Singleton singleton=null;
	
	 private Singleton() {
		
	}
	 
	 public static Singleton getInstance() {
		 
		 if(singleton==null) {
			 System.out.println("::: Object Creation :::");
			 return singleton=new Singleton();
			 
		 }
		 System.out.println("::: Outer:::");
		 return singleton;
		 
	 }
	 }

	

