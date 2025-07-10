package chandan.mca.oopsprinciples;

class Hybrid_parent
{
	public void parent()
	{
		System.out.println("parent");
	}
}


class Child extends Hybrid_parent
{
	public void child()
	{
		System.out.println("son/daughter");
	}
}


class Son extends Child
{
	public void bike()
	{
		System.out.println("parent(child) gave a bike to child2");
	}
}

class Daughter extends Child
{
	public void car()
	{
		System.out.println("parent (child) gave a car to child3");
	}
}


public class Hybrid_inheritance
{
	public static void main(String[] args)
	{
		Child c=new Child();
		System.out.println("single inheritance parent -> child");
		c.parent();
		c.child();
		
		Son c1=new Son();
		System.out.println("hierarichal inheritance child -> child2");
		c1.child();
		c1.bike();
		
		Daughter c2=new Daughter();
		System.out.println("hierarichal inheritance child ->  child3");
		c2.child();
		c2.car();
		
		
	}
}
