package exceptional_handling;
import java.lang.ArithmeticException;

public class Throws_Throw_Implimentation {
	
	public void implimentation() throws ArithmeticException {
		
		try {
			System.out.println("Arith Exception :::: "+10/0);
			
			
		}catch(Exception e) {
			throw e;
		}
		
		
	

}
}