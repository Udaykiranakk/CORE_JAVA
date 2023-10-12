package practice;

 public class Get_Set{

private int a;
private int b;

public int getA(){
	int a=55;
    return a;
}
public void setA(){

    this.a = a;
}


public static void main(String[] args){

Get_Set get=new Get_Set();
get.a =11;
System.out.println(get.getA());

}

}