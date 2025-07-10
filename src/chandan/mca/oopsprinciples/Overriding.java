package chandan.mca.oopsprinciples;

class Animal 
{
	public void sound()
	{
		System.out.println("animal sounds");
	}
}
 public class Overriding extends Animal
{
	public void sound()
	{
		System.out.println("animal makes sound override");
	}
	public static void main(String[] args) 
	{
		Overriding o=new Overriding();//direct calling of the same class object
		o.sound();
		Animal oh=new Overriding();//child class object with parent class reference (overriding)
		oh.sound();
		
		
	}
}

