package practice;

public class String_Task {

	
	void findingWord() {
		String str ="A journey of a thousand miles begins with a single step miles.";
		String str1="miles";
		System.out.println("Finding the starting index of the word::: "+str.indexOf(str1,0)); 
		System.out.println("Finding the starting index of the word::: "+str.indexOf("begins")); 
		System.out.println("Finding the charecter in the String by index value::: "+str.charAt(24));
		
		}

	void wordSearch() {
		String str ="A journey of a thousand miles begins with a single step miles.";
		String str1="miles.";
		str.split(" ");
		String str2 []=str.split(" ");
		System.out.println(str2);
		
	}
}
