import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;
/**
 * @author Sergey Ganous
 * @since 2/25/16
 * Program to read the memos from a given file.
 */
public class Get_Memo {
	public static void main(String[] args){
		
//INITIALIZE VARIABLES
		JFileChooser chooser = new JFileChooser();
		Scanner in = null;
		Scanner input = new Scanner(System.in);
//OPEN FILE SELECT
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
		{
		   try{
			   File selectedFile = chooser.getSelectedFile();
			   in = new Scanner(selectedFile);
			   String repeat = "Y";
//WHILE THERE ARE MEMOS, PRINT AS LONG AS REPEAT IS "Y"			   
			   while(in.hasNextLine() && (repeat.equals("Y") || repeat.equals("y")))
			   {
				   for(int i = 0; i<4; i++){
					   String line = in.nextLine();
					   System.out.println(line);
				   }
				   
				   System.out.println("Print anther memo?(Y/N): ");
				   while(!input.hasNext("[YyNn]")){
					   System.out.println("Enter Y or N: ");
					   input.next();
				   }
				   repeat = input.next();
				   
				   if(!in.hasNextLine()){
					   System.out.println("There are no more memos.");
				   }
			   } 
			   
		   }
		   catch(IOException exception)
		   {
			   System.out.println("File not found");
		   }
		   finally
		   {
			   in.close();
		   }
		}
	}
}
