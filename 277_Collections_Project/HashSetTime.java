import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 * @author Sergey Ganous
 * @since 5/5/15
 * CECS 277 : COLLECTIONS PROJECT - TIMED SETS
 * This program times how long it takes for a HashSet and a TreeSet to store a few thousand
 * words and compares the results.
 */
public class HashSetTime {
	public static void main(String[] args)
	{
		/* Initialize */
		File aliceFile = new File("alice.txt");
		Scanner aliceHashReader = null; 	
		Set<String> wordsHash = new HashSet<String>();
		StopWatch timer = new StopWatch();
		
		try
		{
		aliceHashReader = new Scanner(aliceFile);
		
		/** TESTING HASH SET **/
		timer.start();
		while(aliceHashReader.hasNext())
		{
			wordsHash.add(aliceHashReader.next());
		}
		timer.stop();
		System.out.println("The Hash Set took: "+timer.getElapsedTime() + " miliseconds");
		
		
		/* Catch Exceptions */
		} catch (FileNotFoundException e) {
			System.out.println("Could not get file");
			e.printStackTrace();
		}
		finally
		{
			aliceHashReader.close();
		}
	}
}
