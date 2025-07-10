package chandan.mca.java.oops;

public class Datatypes_variables {
	byte b=01;//1byte=8bit
	short age=22;//2byte
	int a=10;//4byte
  char c='c';//2byte enclosed within single quotes
  String s="chandan";//enclosed in double quotes
  long l=914884787;//8byte
  double d=999.252658;//8byte
  float f= 5;//4byte
  boolean bo;//displays true or false
  //variables and attributes are same *attributes are only define inside the class itself or instance variables are called attributes
  //variables of 3types:local,instance/global,static
  //instance variable:define inside class but outside methods/functions
  public int instancevariable=03;
  
  //local variable:define inside the functions and used by that function/method only
  public void localvariable() 
  {
	 int localvariable=05;
	System.out.println("local variable:"+localvariable);
  }
  //static variable:it is defined using static keyword and cannot be accessed by other class
  static int staticvariable=100;
  public static void main(String[] args) 
  {
	  Datatypes_variables dv=new Datatypes_variables();
	System.out.println(dv.b);
	System.out.println(dv.age);
	System.out.println(dv.a);
	System.out.println(dv.c);
	System.out.println(dv.s);
	System.out.println(dv.l);
	System.out.println(dv.d);
	System.out.println(dv.f);
	System.out.println(dv.bo);
	System.out.println("instance variable:"+dv.instancevariable);	
	dv.localvariable();
	System.out.println("static variable "+staticvariable);
 }
  
}
