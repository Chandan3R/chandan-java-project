package chandan.mca.oopsprinciples;

//Abstraction/abstract class is a class which hide the implementation and displays only needed features

abstract class Abstract
{

	abstract void name(String name);
	abstract void age(int age);
	void name1()
	{
		System.out.println("abstract class demo");
	}
}
public class Abstraction extends Abstract
{
	 void name(String name)
	{
		System.out.println("Name:"+name);
	}
	void age(int age)
	{
		System.out.println("Age: "+age);
	}
	public static void main(String[] args) 
	{
		Abstraction ab=new Abstraction();
		ab.name1();
		ab.name("ramesh");
		ab.age(22);
	}
	
}
