package chandan.mca.oopsprinciples;

interface Multiple
{
	public void name();
	
}
interface Two
{
	public void age();
}
public class Multiple_inheritance implements Multiple,Two
{
	public void name()
	{
		System.out.println("chandan");
	}
	public void age()
	{
		System.out.println(22);
	}
	public static void main(String[] args)
	{
		Multiple_inheritance mlt=new Multiple_inheritance();
		mlt.name();
		mlt.age();
	}
}
