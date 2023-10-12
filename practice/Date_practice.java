package practice;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
public class Date_practice {
	SimpleDateFormat sdf;
	static Date dob;
 static void date() {
	Date dob=new Date();
	System.out.println(dob);
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	System.out.println(sdf.format(dob));
 }
 static LocalTime getLocalTime() {
	 return LocalTime.now();
 }
	
	
}
