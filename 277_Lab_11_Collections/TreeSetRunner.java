import java.util.TreeSet;
/**
 * @author Sergey Ganous (012278381)
 * @since 4/26/16
 * CECS 277: Collections Lab
 */
public class TreeSetRunner {
	public static void main(String[] args)
	{
		TreeSet<String> treeSet = new TreeSet<String>();
		String[] list = { "iii", "hhh","ggg","fff","eee","ddd","ccc","bbb","aaa" };
		for(int j = 0; j<2; j++){
			for(int i = 0; i < list.length; i++)
			{
				treeSet.add(list[i]);
			}
		}
		
		for(String item: treeSet )
		{
			System.out.println(item);
		}
	}
}
