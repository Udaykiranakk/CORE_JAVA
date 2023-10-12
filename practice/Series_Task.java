/**
 * 
 */
package practice;

/**
 * 
 */
public class Series_Task {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("1");
		int number=1;
		int range=10;
	//	int sign=1;
		float value=1;
		
	
		for(int i=1; i<=range; i+=2) {
			if(number %2 != 0 ) {
				
				System.out.print(" + "+"1/"+i);
				value+=1.0f/i;
			 
			}else {
				System.out.print( " - "+"1/"+i);
				value-=1.0f/i;
			}
			number++;
		//	value=value+sign*1.0f/i;
	//		sign=sign*-1;
		}
		
		System.out.print(" : "+value+" :");
		
		
		 
	}

}
