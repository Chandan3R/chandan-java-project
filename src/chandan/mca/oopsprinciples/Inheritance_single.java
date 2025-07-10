package chandan.mca.oopsprinciples;

//Inheritance types
//single:1 parent and 1 child class
//multilevel:parent->child->child2
//hierarchial :parent->child,parnet->child
//multiple:not supported in java but can be acheived using interface class
//hybrid: it is a combination of any 2 type of inheritance ex:single and hierarichail inheritance

//single inheritance is a form of class where single child class inherits from parent class

class SingleInheritance
{
	public void parent()
	{
		System.out.println("Father");
	}
}


public class Inheritance_single extends SingleInheritance
{
	public void child()
	{
		System.out.println("Son");
	}
	public static void main(String[] args) 
	{
		Inheritance_single si=new Inheritance_single();
		si.parent();
		si.child();
	}
}
