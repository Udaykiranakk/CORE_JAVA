/**
 * 
 */
package array_list_and_set;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
public class Hashmap_Map_Interface {
	
	public static void main(String args[]){ 
		Map<Integer,String> map=new HashMap<Integer,String>();
	map.put(100,"uday");
	map.put(101,"sai");
	map.put(102,"ram");
	for(Map.Entry m:map.entrySet()){
	System.out.println(m.getKey()+" "+m.getValue());
	}
	}


}
