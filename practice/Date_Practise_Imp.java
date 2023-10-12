package practice;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;

public class Date_Practise_Imp {

	public static void main(String[] args) {
		Date_Methods date_Method=new Date_Methods();
		Date_practice.date();
		System.out.println(Date_practice.getLocalTime());
		//
		//
		System.out.println("full date: "+date_Method.getLocalDate());
		System.out.println("time with se: "+date_Method.getLocalTime());
		System.out.println("just date: "+date_Method.getLocalDate());
		//
		Date present = date_Method . getLocalDate_one();
		LocalTime watch= date_Method.getLocalTime();
		LocalDate presentdate= date_Method.getLocalDate();
		//
		System.out.println(LocalDate.of(2002, 2, 22));
		System.out.println(presentdate.of(2000, 2, 22));
		System.out.println(watch.getHour());
		System.out.println(watch.getMinute());
		System.out.println(watch.getSecond());
		System.out.println(watch.getNano());
		System.out.println(watch.hashCode());
		System.out.println(watch.of(23, 42, 54, 2222));
		System.out.println(watch.now());
		System.out.println(present.UTC(2002, 2, 22, 1, 30, 22));
	}

}
