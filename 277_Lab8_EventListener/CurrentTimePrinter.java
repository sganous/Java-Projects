/**
 * Sergey Ganous (012278381)
 * 3/8/16
 * CECS 277 EventListener Lab
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class CurrentTimePrinter implements ActionListener{
	
	public void actionPerformed(ActionEvent event) {
		System.out.println(new Date());	
	}
}
