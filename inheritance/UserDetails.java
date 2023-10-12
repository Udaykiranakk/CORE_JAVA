package inheritance;

class UserDetails extends Address{
int    id=2023;
String fn="devarakond";
String ln="vijay";
long   m_no=1234567890;
int    age=29;
String  email="example@gmail.com";
Address address=new Address();
public Address pincode;


Address  Streetname(){
	
	return address;
}


public Address streetname() {
	// TODO Auto-generated method stub
	return null;
}

}