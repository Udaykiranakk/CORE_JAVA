package inheritance;

class TestDataTypes{

int       inputInteger=22;
byte      inputByte=23;
short     inputShort=2002;
long      inputLong=22022002l;
float     inputFloat=22.02f;
double    inputDouble=22.07d;
boolean   inputBoolean = true;
char      inputChar = 'U';
    
  void getData(){

System.out.println(inputInteger);
System.out.println(inputByte);
System.out.println(inputShort);
System.out.println(inputLong);
System.out.println(inputFloat);
System.out.println(inputDouble);
System.out.println(inputBoolean);
System.out.println(inputChar);

}

int getData1(){
  int inputUday=27;
System.out.println(inputInteger+inputUday);
System.out.println(inputInteger-inputUday);
System.out.println(inputInteger*inputUday);
System.out.println(inputInteger/inputUday);
return inputUday;
}

float getData2(){
 float inputUday1=22.07f;
System.out.println(inputFloat+inputUday1);
System.out.println(inputFloat-inputUday1);
System.out.println(inputFloat*inputUday1);
System.out.println(inputFloat/inputUday1);
return inputUday1;
}
 short getData3(){
 short inputUday2=2;
 System.out.println(inputInteger+inputUday2);
 System.out.println(inputInteger-inputUday2);
return inputUday2;
}

}




