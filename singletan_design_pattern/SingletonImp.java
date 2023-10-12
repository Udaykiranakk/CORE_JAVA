package singletan_design_pattern;

public class SingletonImp  {
public static void main(String[] args) {
	Singleton singleton=Singleton.getInstance();
	System.out.println(singleton.a);
	
	Singleton singleton2=singleton;
	System.out.println(singleton2.a );
}
}
