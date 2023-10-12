/**
 * 
 */
package exceptional_handling;

/**
 * 
 */
public class Exceptional_Handling_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("::: hii!::");
			System.out.println(1/0);
		}
		catch( Exception e) {
			System.out.println("::: Catch :::");
		}
		finally {
			System.out.println("::: finally :::");
		}
	}

}
