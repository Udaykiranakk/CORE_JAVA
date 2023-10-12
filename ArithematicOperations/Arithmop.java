package ArithematicOperations;

class Arithmop{
 public static void main (String[] args){
Arithmop1 ao = new Arithmop1();
ao.main();
ao.main1();
ao.main2();
ao.main3();
}}
class Arithmop1{
void main(){
int a=22, b=07, c=a+b;
System.out.println("Add: "+c);
}
void main1(){
int a=22,b=07,d=a-b;
System.out.println("Sub: "+d);
}
void main2(){
int a=22,b=07,e=a*b;
System.out.println("Multi: "+e);
}
void main3(){
Float a=22f,b=07f,f=a/b;
System.out.println("Divi: "+f);
}
}