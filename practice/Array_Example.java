package practice;
import  java.util.Scanner;
public class Array_Example {

	
	    public static void main(String[] args) {
	        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
	        Scanner sc = new Scanner(System.in);
	        //your code goes here
	        
	       int order=sc.nextInt();
	       if(order<5 && order >=0) {
	    	   System.out.println(menu[order]);
	       }else 
	    	   System.out.println("Invalid");
	    }

	}

