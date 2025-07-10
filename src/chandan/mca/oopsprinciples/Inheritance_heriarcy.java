package chandan.mca.oopsprinciples;

//hierarchial is a type of inheritance where 2 child class inherits from single parent class

class Parent
{
	public void parent()
	{
		System.out.println("Father");
	}
}

class Child1 extends Parent
{
	public void child1()
	{
		System.out.println("Son");
	}
}

class Child2 extends Parent
{
	public void child2()
	{
		System.out.println("Daughter");
	}
}
public class Inheritance_heriarcy 
{
	
	public static void main(String[] args)
	{
		Child1 hy=new Child1();
		hy.parent();
		hy.child1();
		Child2 hy1=new Child2();
	    hy1.parent();
		hy1.child2();
	}
}
