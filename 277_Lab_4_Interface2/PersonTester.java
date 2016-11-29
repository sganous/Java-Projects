import java.lang.reflect.Array;
import java.util.Arrays;

public class PersonTester {
	public static void main(String[] args){
		
		Measurable[] people = new Measurable[3];
		people[0] = new Person("Jones","Bill",25);
		people[1] = new Person("Walker","Julie",20);
		people[2] = new Person("Hopkins","Mary",15);
		
		String youngest;
		
		Measurable smallest = Data.smaller(people);
		Person smallPerson = (Person)smallest;
		youngest = smallPerson.toString();
		
		System.out.println(youngest);
		
		Arrays.sort(people);
		
	}
}
