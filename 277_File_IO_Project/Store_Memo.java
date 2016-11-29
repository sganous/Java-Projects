import java.util.*;
import java.io.*;
/**
 * @author Sergey Ganous
 * @since 2/25/16
 *	Program to store multiple memos in a text file
 */
public class Store_Memo {
	public static void main(String[] args){
		
//INITIALIZE VARIABLES
		Scanner input = new Scanner(System.in);
		
		File output = new File("Memos.txt");
		PrintWriter memos = null;
		try
		{
			memos = new PrintWriter(output);
			
			String repeat = "Y";
			do{
				Date date = new Date();
//PROMPT USER FOR INPUT				
				System.out.println("Topic: ");
				memos.println(input.nextLine());
				memos.println(date.toString());
				System.out.println("Text: ");
				memos.println(input.nextLine());
				memos.println();
//PROMPT USER WHETHER TO REPEAT
				System.out.println("Write another memo?(Y/N)");
				while(!input.hasNext("[YyNn]"))
				{
					System.out.println("Please enter Y or N: ");
					input.nextLine();
				}
				repeat = input.nextLine();
			}while(repeat.equals("Y") || repeat.equals("y"));
		}
		catch(IOException exception)
		{
			System.out.println("File not found.");
		}
		finally
		{
			memos.close();
		}
	}
}