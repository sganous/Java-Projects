/**
 * @author Sergey Ganous
 * 4/19/16
 * CECS 277 : MULTITHREADING LAB
 *
 */
import java.util.Scanner;
public class TestThreadMany implements Runnable {
	
	String message;
	public TestThreadMany(String message)
	{
		this.message = message;
	}
	public void run(){
		System.out.println(message);
	}
	public static void main(String[] args)
	{
		int numberOfThreads;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of threads: ");
		numberOfThreads = input.nextInt();
		TestThreadMany[] runnables = new TestThreadMany[numberOfThreads];
		Thread[] threads = new Thread[numberOfThreads];
		for(int i = 0;i<threads.length; i++)
		{
			runnables[i] = new TestThreadMany("Hello, I am Thread #"+(i+1));
			threads[i] = new Thread(runnables[i]);
			threads[i].start();
		}
	}
}


