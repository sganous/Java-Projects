import java.util.LinkedList;
import java.util.ListIterator;
import java.util.regex.Pattern;
import java.util.*;
/**
 * @author Sergey Ganous (012278381)
 * @since 4/26/16
 * CECS 277: Collections Lab
 */

public class LinkedListRunner {
	public static void main(String[] args){
		LinkedList<String> list;
		ListIterator<String> iterator;
	
		list = new LinkedList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		list.add("fff");
		list.add("ggg");
		list.add("hhh");
		list.add("iii");
		iterator = list.listIterator();
		
		//FORWARD
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		//BACKWARD
		while(iterator.hasPrevious())
		{
			if(iterator.previous().matches("^[aeiou].*"))
			{
				iterator.remove();
			}
		}
		//FORWARD
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
