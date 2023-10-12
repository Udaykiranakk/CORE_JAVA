package Conditional_Operators;

public class name {

	public static void main(String [] uday) {
int a=2;
int b=7;
int c=22;
int d=23;
int e=27;
String var="Uday";
float ab=2.2f;

// For Example (a>b && a<b) In This Condition We Used '&&'(AND)BOth the conditions has to be true to execute its implementation.  
// If We Use (a>b || a<b) In This We Used '||'(OR)were any one condition has to be true to execute its Implementation.
// If We Use (a!=b) Here In This Situation If (a==b) is False.Then '!'(NOT) Checks The Values Of a and b If true Executes its Implementation.

		if ((var=="sai" )|| (a>b && a>c && a>d && a>e)) {
			System.out.println("a is applicable to the condition");
		}else if(ab==2 && ab<a) {
			System.out.println("ab is 2 and ab<2");
		}
		else if( a==b || a==c || a==d || a==e) {
			System.out.println();
		}else if (a!=b) {
			System.out.println("Not Operator:::");
		}
		else if(var=="Uday"){
			System.out.println("Name: "+var);
		}
		else {
			System.out.println("a is not applicable to the conditions");
		}
		
	}
	
	
}
