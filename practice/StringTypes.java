package practice;

public class StringTypes {
	/* Various methods For String*/ 
public static void main(String[] args) {
	String str =" It is spectacular to watch an erupting "
			+ "volcano; but it is even much more spectacular"
			+ " to watch the rise of a newly exploding revolutionary idea!";
	
	String uday ="Ahoy, me hearties! We sail the starry ocean Watch out for crocs, arr!";
	
	
	String str2="uday";
	String str3="vinod";
	String str4="uday";
	
	
	
	System.out.println(":::::::::::"+str2==str4);
	
	System.out.println("Length of str: "+str.length());
	System.out.println("Length of str: "+str.length());
	System.out.println(uday.toUpperCase());
	System.out.println(uday.equals(str));
	System.out.println(uday.contains("me"));
    System.out.println(uday.endsWith("!")); 
    System.out.println(uday.indexOf('!'));
    System.out.println(uday.replace("We", "You"));
    System.out.println(str == uday);
    System.out.println(uday.toLowerCase());
    System.out.println(uday.substring(0,10));
    System.out.println(uday.substring(10,20));
    System.out.println(uday.concat(str));
    String [] splitArray=str.split("a");
    System.out.println("Splitted array:: "+splitArray.length);
    System.out.println(splitArray[0]);
    System.out.println(splitArray[1]);
    System.out.println(splitArray[2]);
    System.out.println(splitArray[10]);
    
   // System.out.println("split:: "+uday.split(str, 10)[0]);
    
}
}
