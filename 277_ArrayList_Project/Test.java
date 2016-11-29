import java.util.*;
public class Test {
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.clear();
		System.out.println(list.isEmpty());
		
		
		
//		System.out.println(list);
//		int first = list.remove(0);
//		System.out.println(first);
//		list.add(first);
//		System.out.println(list);
		
//		String numbers1 = "02D";
//		String numbers2 = "13D";
//		int numbers3 = Integer.parseInt(numbers1.substring(0,2));
//		int numbers4 = Integer.parseInt(numbers2.substring(0,2));
//		System.out.println(numbers3);
//		System.out.println(numbers4);
		
	}
}
