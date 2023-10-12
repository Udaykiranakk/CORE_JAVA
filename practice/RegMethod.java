package practice;

public class RegMethod  {
RegBasic basic() {
	
	RegBasic regBasic=new RegBasic();
	regBasic.setFirstName("UdayKiran");
	regBasic.setLastName("Akkenapally");
	System.out.println("Full Name :"+" "+regBasic.getFirstName()+" "+regBasic.getLastName()+".");
	regBasic.setAge(21);
	System.out.println("Age : "+regBasic.getAge()+".");
	regBasic.setGender('M');
	System.out.println("Gender : "+regBasic.getGender()+".");
	regBasic.setPhoneNumber(1234567890);
	System.out.println("Phone Number : "+regBasic.getPhoneNumber()+".");
	return regBasic;
	
}

Regaddress address() {
	Regaddress regaddress=new Regaddress();
	
	regaddress.setdNo(" H2 ,");
	System.out.println("Door No :"+regaddress.getdNo());
	regaddress.setFlatName(" hongkong residency ,");
	System.out.println("FlatName :"+regaddress.getFlatName());
	regaddress.setStreetName(" Kcr colony ,");
	System.out.println("Street Name :"+regaddress.getStreetName());
	regaddress.setArea(" madhapur ,");
	System.out.println("Area :"+regaddress.getArea());
	regaddress.setCity(" hyderabad ,");
	System.out.println("City :"+regaddress.getCity());
	regaddress.setState(" Telangana ,");
	System.out.println("State Name :"+regaddress.getState());
	regaddress.setZipCode(" 500018 ,");
	System.out.println("ZipCode :"+regaddress.getZipCode());
	return regaddress;

}



}
