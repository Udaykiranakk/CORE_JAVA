package practice;

import Conditional_Operators.IfCondition;

// import .Main.src.main.Conditional_Operators.*;
public class Overload  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =20;
int b =27;
Overload ovrl= new Overload();
ovrl.main(a,b);
ovrl.main(b,a);
ovrl.main(a,b);

IfCondition ifCondition=new IfCondition();

System.out.println(ifCondition.statmethod());
	}
	public void main() {
		
	}
void main(int a,int b) {
	
}
float main(float b, int a) {
	return b;
}
String main(int a, String b) {
	return b;
}
}