package for_loop;

public class ForLoop {

	

	public static void main(String[] uday) {
		// TODO Auto-generated method stub

		for (int i = 2; i < 10; i = i*i) {
			  System.out.println(i);
			}
       for(int x=0; x<=10; x+=2) {
        	
            System.out.print(x+",");
       }
       
       System.out.println(":::::");
       
       
		// Febinocis series
		int num1=0,num2=1,num3;
		for(int j=0; j<10; j++) {
			num3=num1+num2;
			num1=num2;
			num2=num3;
			
			System.out.print(num3+",");
			
		}
		System.out.println(":::::");
		
		///
		
		
		for(int k=0; k<1; k++) {
			
		  k=0;
			System.out.print(k+",");
	}
		System.out.println(":::::");
		System.out.println(":::::"); 
		
		
		//For-each
		
		int[] a= {1,2,5,9,4,6,0,3,2};
		for(int val:a) {
		//	System.out.print(" ");
			System.out.print(val+",");
			
		}
		System.out.println("::::");
		
		
		
}
	}


