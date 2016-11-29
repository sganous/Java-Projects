import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Sergey Ganous
 * @since 5/5/15
 * CECS 277 : COLLECTIONS PROJECT - SCRABBLE
 * This program uses a scrabble key:value map to provide the totals of words in a file
 * according to their character values.
 */
public class Scrabble {
	public static void main(String[] args)
	{
		/* INITIALIZE VARIABLES */
		File words = new File("QList.txt");
		File values = new File("Values.txt");
		Scanner wordReader = null;
		Scanner valueReader = null;
		Map<Character, Integer> scrabble = new HashMap<Character, Integer>();
		Set<String> wordSet = new HashSet<String>();
		
		try {
			/* Define Variables */
			wordReader = new Scanner(words);
			valueReader = new Scanner(values);
			
			//Set the scrabble key:value map
			while(valueReader.hasNextLine())
			{
				char letter = valueReader.next().charAt(0);
				int value = valueReader.nextInt();
				valueReader.nextLine();
				scrabble.put(letter, value);
			}
			
			//Set the list of words from a file into a set
			while(wordReader.hasNextLine())
			{
				wordSet.add(wordReader.next());
			}
			
			/* Calculates and Prints the results of the words in the set */
			for(String word : wordSet)
			{
				int wordTotal = 0;
				word = word.toUpperCase();
				for(int i = 0; i < word.length(); i++)
				{
					char c = word.charAt(i);
					int value = scrabble.get(c);
					wordTotal += value;
				}
				System.out.println(word+" : "+wordTotal);
			}
		/* Catch Exceptions */
		} catch (FileNotFoundException e) {
			System.out.println("Could not get file");
			e.printStackTrace();
		}
		/* Close all of the open files */
		finally
		{
			wordReader.close();
			valueReader.close();
		}
	}
}
