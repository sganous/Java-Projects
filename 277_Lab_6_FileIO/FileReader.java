/**
 * Sergey Ganous (012278381)
 * 2/16/16
 * Lab File I/O
 */
import java.io.*;
import java.util.*;
public class FileReader {
	public static void main(String[] args) throws Exception{
	
		try{
			File inputFile = new File("ziptable.txt");
			Scanner in = new Scanner(inputFile);
			PrintWriter output = new PrintWriter("output.txt");
			
			while(in.hasNextLine()){
				
				String line = in.nextLine();			
				System.out.println(line);
				output.println(line);
			}
			in.close();
			output.close();
		}
		catch(IOException exception){
			System.out.println("Could not find input file.");
		}
	} 
}
