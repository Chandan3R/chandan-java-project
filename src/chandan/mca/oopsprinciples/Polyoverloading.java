package chandan.mca.oopsprinciples;

public class Polyoverloading
{
    // polymorphism of 2 type compile time(overloading) and runtime(overriding)
	//complie time or method overloading:its refers to the one or more method having same method name and different parameter list
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public double add(double a,double b)
	{
		return a+b;
	}
   public static void main (String[] args)
   {
	   Polyoverloading po=new Polyoverloading();
	   System.out.println("method/function overloading");
	   System.out.println(po.add(5,25));
	   System.out.println(po.add(5,5,5));
	   System.out.println(po.add(3.5,5.5));
   }
}
