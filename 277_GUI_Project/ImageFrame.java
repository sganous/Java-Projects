import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import java.util.*;
/**
 * Frame for the Image Game
 */
public class ImageFrame extends JFrame{

	/** INITIALIZE VARIABLES **/
	private static final int FRAME_WIDTH = 1000;
	private static final int FRAME_HEIGHT = 1000;
	
	ImagePanel image = new ImagePanel();
	
	ImageIcon canadaIcon = new ImageIcon("Canada.png");
	Image buffer1 = canadaIcon.getImage();
	Image buffer2 = buffer1.getScaledInstance(60, 40, java.awt.Image.SCALE_SMOOTH);
	ImageIcon canadaMenu = new ImageIcon(buffer2);
	
	ImageIcon usaIcon = new ImageIcon("America.jpg");
	Image buffer3 = usaIcon.getImage();
	Image buffer4 = buffer3.getScaledInstance(60, 40, java.awt.Image.SCALE_SMOOTH);
	ImageIcon usaMenu = new ImageIcon(buffer4);
	
	ImageIcon russiaIcon = new ImageIcon("Russia.png");
	Image buffer5 = russiaIcon.getImage();
	Image buffer6 = buffer5.getScaledInstance(60, 40, java.awt.Image.SCALE_SMOOTH);
	ImageIcon russiaMenu = new ImageIcon(buffer6);
	
	MenuListener menuSelect = new MenuListener();
	JMenu imageMenu = new JMenu("Images");
	JMenuItem m;
	JMenuBar mBar = new JMenuBar();
	
	/** ImageFrame **/
	public ImageFrame()
	{	
		//Frame Properties
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setTitle("Click Game");
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Menu 
		m = new JMenuItem("Canada", canadaMenu);
		m.setActionCommand("Canada");
		m.addActionListener(menuSelect);
		imageMenu.add(m);
		
		m = new JMenuItem("USA", usaMenu);
		m.setActionCommand("USA");
		m.addActionListener(menuSelect);
		imageMenu.add(m);
		
		m = new JMenuItem("Russia", russiaMenu);
		m.setActionCommand("Russia");
		m.addActionListener(menuSelect);
		imageMenu.add(m);
		
		mBar.add(imageMenu);
		setJMenuBar(mBar);
		
		//Add image panel to display
		add(image);
	}

	/** MENU Click Listener**/
	class MenuListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			String actionCommand = e.getActionCommand();
			if(actionCommand.equals("Canada"))
			{
				image.setImage(canadaIcon);
				repaint();
			}	
			else if(actionCommand.equals("USA"))
			{
				image.setImage(usaIcon);
				repaint();
			}
			else
			{
				image.setImage(russiaIcon);
				repaint();
			}
		}
	}	
}
