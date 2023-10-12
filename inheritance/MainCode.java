package inheritance;

class MainCode{
public static void main(String[] input){

MethCode methCode=new MethCode();
int output= methCode.addTwoNumbers();
System.out.println("Addition of inputone and inputtwo is :"+output);

int output1= methCode.subTwoNumbers();
System.out.println("Subtraction of inputone and inputtwo is :"+output1);

int output2= methCode.multTwoNumbers();
System.out.println("Multiplicaition of inputone and inputtwo is :"+output2);

int output3= methCode.divTwoNumbers();
System.out.println("Division of inputone and inputtwo is :"+output3);

int output4= methCode.moduTwoNumbers();
System.out.println("Modules of inputone and inputtwo is :"+output4);
}
}
