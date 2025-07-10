package chandan.mca.java.oops;

public class ConstructorMain  {
public static void main(String[] args) {
	Constructor c=new Constructor(1,"chandan",20000);
	System.out.println(c);
	//heap memory displays the hashcodes reference no of a memory/variable
	System.out.println(c.hashCode());
	Constructor d=new Constructor(1,"chandan",20000);
    System.out.println(d.hashCode());
    
    //access of static instance method is done through classname.method; of other class
//    Instancemethodexample.f2();
}
}
