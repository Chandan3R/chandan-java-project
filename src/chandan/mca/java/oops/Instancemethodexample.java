package chandan.mca.java.oops;

public class Instancemethodexample {
	//default method can be accessed using object name /creating object only 
	void f1() {
		System.out.println("instance method");
	}
	//class method/static method can be accessed using method name need to be created object to access with in the class
   //and can be accessed in another class with the help of classname.methodname;
	static void f2() {
		System.out.println("static instance method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Instancemethodexample i=new Instancemethodexample();
       i.f1();
       //ways of accessing static methods
       f2();
       Instancemethodexample.f2();
	}

}
