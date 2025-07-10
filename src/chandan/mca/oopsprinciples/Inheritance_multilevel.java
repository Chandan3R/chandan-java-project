package chandan.mca.oopsprinciples;

//multilevel inheritance is a type of inheritance in the form of a->b->c

class Multilevel_parent
{
	public void parent() 
	{
		System.out.println("GrandFather");
	
	}
}

class Multilevel_child1 extends Multilevel_parent
{
	public void child1()
	{
		System.out.println("Father");
	}
}

public class Inheritance_multilevel extends Multilevel_child1
{
	public void child2()
	{
		System.out.println("Son");
	}
	public static void main(String[] args) 
	{
		Inheritance_multilevel ml=new Inheritance_multilevel();
		ml.parent();
		ml.child1();
		ml.child2();
	}
}
