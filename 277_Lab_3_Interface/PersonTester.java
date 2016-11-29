
public class PersonTester {
	public static void main(String[] args){
		
		Measurable[] people = new Measurable[3];
		people[0] = new Person("Bill",25);
		people[1] = new Person("Julie",20);
		people[2] = new Person("Kevin",27);
		
		int averageAge = Data.average(people);
		System.out.println("Average age: "+averageAge);
	}
}
