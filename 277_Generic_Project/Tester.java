import java.util.*;
/**
 *	Generic Classes Project Tester
 */
public class Tester {
	public static void main(String [] args){
		
		ArrayList<Measurable> list = new ArrayList<Measurable>();
		anObject one = new anObject(5);
		anObject two = new anObject(10);
		anObject three = new anObject(45);
		anObject four = new anObject(20);
		anObject five = new anObject(6);
		list.add(one);
		list.add(two);
		list.add(three);
		list.add(four);
		list.add(five);
		
		Measurable obj = Measurable.max(list);
		System.out.println("Greatest value in the list: ");
		System.out.println(obj.getMeasure());
		
		System.out.println("Sorted Array List: ");
		Collections.sort(list);
		for(int i = 0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getMeasure());
		}
	}
}
