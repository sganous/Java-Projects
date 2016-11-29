import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.Timer;
import java.util.*;
/**
 * Image Panel class that contains the details of the image printed on the frame.
 */
class ImagePanel extends JPanel {

	/**INITIALIZE VARIABLES**/
	private int IMAGE_HEIGHT = 150;
	private int IMAGE_WIDTH = 300;
	int DELAY_slow = 1000;
	int DELAY_medium = 500;
	int DELAY_fast = 100;
	
	Random rand = new Random();
	int x = rand.nextInt(700);
	int y = rand.nextInt(820);
	int counter = 0;
	
	//ACTION LISTENERS
	ClickListener click = new ClickListener();
	ActionListener listener = new TimerListener();
	Timer t_slow = new Timer(DELAY_slow, listener);
	Timer t_medium = new Timer(DELAY_medium, listener);
	Timer t_fast = new Timer(DELAY_fast, listener);
	
	JLabel score = new JLabel("Score: "+counter);
	Rectangle box = new Rectangle(x,y,IMAGE_WIDTH ,IMAGE_HEIGHT);
	ImageIcon canadaIcon = new ImageIcon("Canada.png");
	Image image;
		
	/** ImagePanel Constructor **/
	public ImagePanel()
	{
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(score);
		t_slow.start();
		image = canadaIcon.getImage();
		this.addMouseListener(click);	
	}
	
	/**
	 * Method to change the image displayed
	 * @param icon ImageIcon to be turned into an image class
	 */
	public void setImage(ImageIcon icon)
	{
		image = icon.getImage();
	}
 
	/**
	 * PaintComponent Overwrite in order to print image
	 */
	protected void paintComponent(Graphics g) { 
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(image,x,y,IMAGE_WIDTH,IMAGE_HEIGHT, this);
		//g.drawString("Score: "+counter, 900, 20);
	}  
	
	/** Mouse Listener Class **/
	class ClickListener implements MouseListener
	{
		public void mousePressed(MouseEvent event){
			if(box.contains(event.getPoint()))
			{
				System.out.println(event.getPoint());
				counter++;
				score.setText("Score: "+counter);
				System.out.println(counter);
			}
		}
		public void mouseReleased(MouseEvent event){}
		public void mouseClicked(MouseEvent event){}
		public void mouseEntered(MouseEvent event){}
		public void mouseExited(MouseEvent event){}
	}
	
	/** Timer Listener Class **/
	class TimerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(counter >= 10)
			{
				t_medium.stop();
				t_fast.start();
			}
			else if(counter >= 5)
			{
				t_slow.stop();
				t_medium.start();
			}
			
			x = rand.nextInt(700);
			y = rand.nextInt(820);
			box.setLocation(x,y);
			repaint();
		}
	}
}
