package chandan.mca.java.oops;

import java.util.Objects;

public class Constructor {
  int pid=10;
 String name;
 double salary;
 public Constructor(int pid, String name, double salary) {
	super();
	this.pid = pid;
	this.name = name;
	this.salary = salary;
 }
 //tostring() is a method of object_class it prints the object values
 @Override
 public String toString() {
	return "Productconstructor [pid=" + pid + ", name=" + name + ", salary=" + salary + "]";
 }
 //hash code and equals are the methods of object-class used for comparing of 2 variables reference having same value and allocating the single heap memory reference(hash code)
 @Override
 public int hashCode() {
	return Objects.hash(name, pid, salary);
 }
 @Override
 public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Constructor other = (Constructor) obj;
	return Objects.equals(name, other.name) && pid == other.pid
			&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
 }

}



