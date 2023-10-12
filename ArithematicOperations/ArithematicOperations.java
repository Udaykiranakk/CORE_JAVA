package ArithematicOperations;


class ArithematicOperations{
public static void main(String [] args){


 
ArithematicOperationsSup aoSup = new ArithematicOperationsSup();

int result =aoSup. addTwoNumbers(10,20);
System.out.println("AddOperation: "+result);

int result1 =aoSup. subTwoNumbers(22,25);
System.out.println("SubOperation: "+result1);

int result2 =aoSup. multiTwoNumbers(22,23);
System.out.println("MultiOperation: "+result2);

int result3 =aoSup. divTwoNumbers(9,2);
System.out.println("DivOperation: "+result3);

int result4 =aoSup. moduTwoNumbers(23,2);
System.out.println("ModuOperation: "+result4);


}
}