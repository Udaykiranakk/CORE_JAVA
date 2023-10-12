/**
 * 
 */
package array_list_and_set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 */
public class Hashset_Iterator {
	public static void main(String args[]){
		//Creating HashSet and adding elements
		HashSet<String> set=new HashSet<String>();
		set.add("uday");
		set.add("sai");
		set.add("ram"); set.add("tharun");
		//Traversing elements 
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		}


}
