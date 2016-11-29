import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileReader {
	public static void main(String[] args) throws FileNotFoundException{
		File java = new File("Data.class");
		File text = new File("Text.txt");
		File word = new File("Word.docx");
		int counter = 0;
		try{
			FileInputStream inStream = new FileInputStream(java);
			for(int i = 0; i<3; i++){
				if(0==i){
					System.out.println("JAVA FILE");
				}
				if(1==i)
				{
					System.out.println("TEXT FILE");
					inStream = new FileInputStream(text);
				}
				else if(2==i)
				{
					System.out.println("WORD FILE");
					inStream = new FileInputStream(word);
				}
				
				boolean done = false;
				while(!done)
				{
					int next = inStream.read();
					if(next >= 32 && next <=126){
						char letter = (char) next;
						System.out.print(letter);
						counter++;
					}
					if(counter >= 63)
					{
						System.out.println();
						counter = 0;
					}
					if(next == -1)
					{
						done = true;
					}
				}
				System.out.println();
				System.out.println();
			}
		}
		catch(IOException exception){
			System.out.println("Could not find input file.");
		}
		
	}
}
