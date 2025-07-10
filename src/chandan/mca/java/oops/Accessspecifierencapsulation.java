package chandan.mca.java.oops;

public class Accessspecifierencapsulation {
	//default access specifier accessed with in the package
	int a=20;
	//public access specifier accessed within the project
    public int b=10;
 //protected access specifier accessed within the package and also can access outside using the extends keyword and importing the package of accessing element
    protected int c=30;
  //private access specifier accessed within the particular class
    private int d=40;
    public static void main(String[] args) {
		
    	Accessspecifierencapsulation as=new Accessspecifierencapsulation();
    	System.out.println("private accessspecifier");
    System.out.println(as.d);
    }
}
