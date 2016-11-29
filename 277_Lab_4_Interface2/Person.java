/**
 * Sergey Ganous
 * 012278381
 * 2/4/16
 * Lab 4 : Interface/Comparable
 */
public class Person implements Measurable, Comparable {
	private String lname;
	private String fname;
	private double age;
	public Person(String inlname, String infname, int inage) {
		lname=inlname;
		fname=infname;
		age=inage;
	}
	public double getMeasure() {
		return age;
	}
	
	public String toString() {
		return fname + "'" + lname + " is " + age + " years old.";
	}
	
	public int compareTo(Object someObject)
	{
		Person other = (Person)someObject;
		return fname.compareTo(other.fname);
		
	}

}