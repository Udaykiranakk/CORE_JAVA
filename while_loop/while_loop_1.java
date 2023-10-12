/**
 * 
 */
package while_loop;

/**
 * 
 */
public class while_loop_1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// While
		int u=0;
    	while( u<=22) {
    		u++;
    		System.out.print(u+",");
    		
    		u+=u;	
    	}
    	System.out.println(" ");
    	System.out.println("::::");
    	 	
    	// do While
    	
    	int y=0;
    	do {
    		System.out.print(y+",");
    		y++;
    	}while( y<10);
	}

}
