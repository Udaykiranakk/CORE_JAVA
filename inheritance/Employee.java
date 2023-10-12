package inheritance;

class Employee{
public static void main(String[] args){




UserDetails ud= new UserDetails();
Employee e= new Employee();

 Address output=ud.streetname();
 System.out.println("Streetname is :"+output);

Address output2=ud.pincode;
 System.out.println("City with pincode is :"+output2);
}
}