package Conditional_Operators;

public class IfCondition {
	  static int a=22;
	  static int b=07;
		public static void main(String [] args) {
			
			statmethod();
		}
		
			 public static int statmethod() {
			 
			if(a<b) {
				System.out.println("a is less than b.....!");
				return b;
			}
			else if (a==b) {
				System.out.println("a is equal to b.....!");
				return b;
			}
			else {
				System.out.println("a is greater than b.....!");
			
		
			return a;
			}
		}
		
	}