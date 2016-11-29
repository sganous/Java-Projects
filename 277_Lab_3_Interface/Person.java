/**
 * Sergey Ganous
 * 012278381
 * 2/2/16
 * Lab: Interfaces
 */
public class Person implements Measurable{
	String name;
	int age;
	
	public Person(String aName, int anAge)
	{
		name = aName;
		age = anAge;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int getMeasure()
	{
		return age;
	}
	
}
