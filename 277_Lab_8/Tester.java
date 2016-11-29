import javax.swing.Timer;

public class Tester {
	public static void main (String[] args)
	{
		CurrentTimePrinter listener = new CurrentTimePrinter();
		Timer t = new Timer(1000, listener);
		t.start();
	}
}
