package chandan.mca.oopsprinciples;

public class ConstructorOverloading 
{
	String name;
	int age;
	public ConstructorOverloading()
	{
	name=null;
	age=0;
	}
	public ConstructorOverloading(String n)
	{
		name=n;
		age=0;
	}
	public ConstructorOverloading(String n,int a)
	{
		name=n;
		age=a;
	}
	void display()
	{
		System.out.println("name: "+name+" age: "+age);
	}
	public static void main(String[] args)
	{
		System.out.println("default constructor");
		ConstructorOverloading cd=new ConstructorOverloading();
		cd.display();
		System.out.println("single parameterised constructor");
		ConstructorOverloading cp1=new ConstructorOverloading("chandan");
		cp1.display();
		System.out.println("2 or more parameterised constructor");
		ConstructorOverloading cp2=new ConstructorOverloading("chandan",22);
		cp2.display();
	}
}
