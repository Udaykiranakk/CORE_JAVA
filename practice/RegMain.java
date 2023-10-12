package practice;

public class RegMain  {

	public static void main(String[] args) {
	    
	    
		RegMethod regMethod=new RegMethod();
		
		
	//	RegBasic values =regMethod.basic();
	//	System.out.println("Full Name is:"+regBasic.getFirstName()+" "+regBasic.getLastName()+",");
	//	System.out.println("Adress is:"+regaddress.getdNo()+","+regaddress.getFlatName()+","+regaddress.getStreetName()+","+regaddress.getArea()+","+regaddress.getCity()+","+regaddress.getState()+","+regaddress.getZipCode()+",");
		 Regaddress uday= regMethod.address();
		
		//System.out.println(regMethod.address().getArea());
		//System.out.println();
		
//		regMethod.basic().getFirstName();
 //    	System.out.println(" 👇🏼 ");
//		System.out.println(" ⬇️ ");
//		System.out.println(" ⬇️ ");
//		System.out.println(" ⚡😱 ");
 //       System.out.println("⬇️ Address Is ⬇️");
//		regMethod.address();
		System.out.println(uday);
	//  System.out.println(regMethod.basic().getFirstName());
	//  System.out.println("Full Name Is:"+" "+regMethod.basic().getFirstName()+" "+regMethod.basic().getLastName());
	}

}
