/**
 * 
 */
package array_list_and_set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
/**
 * 
 */
public class Array_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list=new ArrayList();
		list.add(22);
		list.add(7);
		list.add('U');
		list.add("uday");
		list.add(22.2);
		 System.out.println(list);
		 
		 Set<Integer> set=new HashSet<Integer>(list);
		 
		 set.add(22);
		 set.add(2);
		 set.add(22);
		 set.add(0);
		 
		 System.out.println(set);
		 
		 Map map=new HashMap();
		 
		 map.put("id",22);
		 map.put("fname", "John");
		 map.put("lname", "Doe");
		 
		 System.out.println(map);
		 
		 Map<Integer, String> map2=new HashMap<Integer, String>();
		 
		 
		 map2.put(0, "Aaaa");
		 map2.put(1, "ling");
		 map2.put(2, "ling");
		 map2.put(3, "ling");
		 map2.put(4,"lingidi");
		 //
		 map2.put(5, "lingdi");
		 map2.put(6, "kindha");
		 map2.put(7, "jangidi");
		 map2.put(8, "jangdi");
		 map2.put(9, "kindha");
		 map2.put(10, "kusumidhi");
		 map2.put(11, "thananaa");
		 map2.put(12, "thaninaanaa");

		 
		 
		 System.out.println(map2);
		 System.out.println(map.get(1));
		 System.out.println(list.get(1));

		 
	}
	
}
