package exceptional_handling;

public class Throws_Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Throws_Throw_Implimentation tti=new Throws_Throw_Implimentation();
	//	tti.implimentation();
		
		try {
			tti.implimentation();
			
		}
		catch(ArithmeticException e){
			System.out.println("wtf");
		}
		
	}

}
