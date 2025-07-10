package chandan.mca.java.oops;

public class Typeconversion_casting {
	
	//typeCasting/conversion of 2 types
	//1.implicit or automated conversion/casting
	//2.explicit or forcefully converting
	
	//example of implicit(it converts from low to high bytes 
	int a=10;
	float b=a;
	double d=a;
	
	//example of explicit
	double df=20.25;
	byte by=(byte)df;
	short st=(short)df;
	float f=(float)df;
	int c=(int)df;
	public static void main(String[] args) {
		Typeconversion_casting tc=new Typeconversion_casting();
		System.out.println("implicit typecasting");
		System.out.println(tc.a);
		System.out.println(tc.b);
		System.out.println(tc.d);
		System.out.println("explicit typecasting");
		System.out.println(tc.df);
		System.out.println(tc.by);
		System.out.println(tc.st);
		System.out.println(tc.f);
		System.out.println(tc.c);
	}
}
