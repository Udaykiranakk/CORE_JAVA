package practice;

public   class User_Details {
	static Registration getDetails() {
	 
		Registration registration=new Registration();

	registration.f_name="Uday_Kiran";
	registration.l_name="Akkenapally";
	registration.email="abc@gmail.com";
	registration.gender="Male(M)";
	registration.age=21;
	registration.mobile_num=1234567890;
	registration.emply_id= 221234567;
	//System.out.println( "name:"+F_name+" "+L_name);
	return registration;

	}

 static void getmethode() {
	 Registration registration=new Registration();
	 
	 if((registration.f_name == registration.l_name) && registration.age == 10 || registration.age == 21)
		       System.out.println("age is == so prints"+registration.age);
	 else {
		 System.out.println("not true");
	 }
     }
}

