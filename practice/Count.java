package practice;

public class Count {

	public static void main(String[] args){
		
      int count=0;
		int ar[] = { 1, 2, 3, 4, 5 };
		
		try {
		for (int i = 0; i <= ar.length; i++){
			
          if(ar[i] >=0){
            count+=1;
			
          }
      System.out.println(count);
      
        }
	} catch(Exception e){
		System.out.println("brroooooo");
	}
	
	}
}
