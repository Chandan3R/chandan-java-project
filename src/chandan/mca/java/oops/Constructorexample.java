package chandan.mca.java.oops;

public class Constructorexample {
 int a;
 double b;
 //creation of constructor
 public Constructorexample(int a,double b)
 {
	 this.a=a;
	 this.b=b;
	 
 }
 public static void main(String[] args) 
 {
   Constructorexample c=new Constructorexample(5,10.5);
   System.out.println(c.a);
   System.out.println(c.b);
	
	
 }
}
