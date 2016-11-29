import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/**
 * @author Sergey Ganous
 * @since 5/5/15
 * CECS 277 : COLLECTIONS PROJECT - TIMED SETS
 * This program times how long it takes for a HashSet and a TreeSet to store a few thousand
 * words and compares the results.
 */
public class TreeSetTime {
	public static void main(String[] args)
	{
		/* Initialize */
		File aliceFile = new File("alice.txt");
		Scanner aliceTreeReader = null;
		Set<String> wordsTree = new TreeSet<String>();
		StopWatch timer = new StopWatch();
		try
		{
		aliceTreeReader = new Scanner(aliceFile);
		
		/** TESTING TREE SET **/
		timer.start();
		while(aliceTreeReader.hasNext())
		{
			wordsTree.add(aliceTreeReader.next());
		}
		timer.stop();
		System.out.println("The Tree Set took: "+timer.getElapsedTime() + " miliseconds");
		
		/* Catch Exceptions */
		} catch (FileNotFoundException e) {
			System.out.println("Could not get file");
			e.printStackTrace();
		}
		finally
		{
			aliceTreeReader.close();
		}
	}
}
