import javax.swing.Timer;
import javax.swing.JOptionPane;
public class Tester {
	public static void main(String[] args)
	{
		CurrentTimePrinter listener = new CurrentTimePrinter();
		Timer t = new Timer(1000, listener);
		t.start();
		JOptionPane.showMessageDialog(null, "Quit?");
		System.exit(0);
	}
}
