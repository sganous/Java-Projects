import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.JColorChooser;
/**
 * @author Sergey Ganous (012278381)
 * @since 3/22/16
 * CECS 277: STREAM IO PROJECT
 * This is the IceFram component which contains all of the panels and images.
 */
public class IceFrame extends JFrame {
	/* Frame Size */
	private static final int FRAME_HEIGHT = 1000;
	private static final int FRAME_WIDTH = 1000;
	
	/* Button Initialization */
	JPanel buttonPanel = new JPanel();
	JPanel orderPanel = new JPanel();
	Button[] buttons = new Button[12];
	String[] buttonNames = new String[] {"Standard Cone","Sugar Cone","Waffle Cone","Vanilla","Strawberry","Chocolate", "Add Scoop", "Add Sprinkles", "Order!",
			"Start Over", "Save Cone", "Open Existing Cone"};
	
	/* Other Initialization */
	JLabel price = new JLabel();
	MouseListener click = new ClickListener();
	ConeComponent cone = new ConeComponent();
	
	/** Image Frame **/
	public IceFrame()
	{
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setTitle("Ice Cream Shop");
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* Add buttons to the Frame */
		for(int i = 0; i < buttons.length; i++)
		{
			buttons[i] = new Button(buttonNames[i]);
			buttons[i].setPreferredSize(new Dimension(150,75));
			buttons[i].addMouseListener(click);
		}
		
		//Organization of buttons and labels on the left
		buttonPanel.setLayout(new GridLayout(11,1));
		buttonPanel.add(new JLabel("Select a Cone: "));
		buttonPanel.add(buttons[0]);
		buttonPanel.add(buttons[1]);
		buttonPanel.add(buttons[2]);
		buttonPanel.add(new JLabel("Select a Flavor: "));
		buttonPanel.add(buttons[3]);
		buttonPanel.add(buttons[4]);
		buttonPanel.add(buttons[5]);
		buttonPanel.add(new JPanel());
		buttonPanel.add(buttons[6]);
		buttonPanel.add(buttons[7]);
		//Organization of buttons and labels on the top
		orderPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		orderPanel.setSize(FRAME_WIDTH, 100);
		orderPanel.add(price);
		orderPanel.add(buttons[8]);
		orderPanel.add(buttons[9]);
		orderPanel.add(buttons[10]);
		orderPanel.add(buttons[11]);
		//Add all components to the frame
		this.add(orderPanel);
		this.add(cone);
		this.add(buttonPanel, BorderLayout.WEST);
	}
	
	/** Mouse Listener Class **/
	class ClickListener implements MouseListener
	{
		public void mousePressed(MouseEvent event){
			/** CONE CHANGE ACTIONS **/
			if(event.getSource() == buttons[0])
			{
				cone.iceCream.setTypeOfCone("regular");
			}
			else if(event.getSource() == buttons[1])
			{
				cone.iceCream.setTypeOfCone("sugar");
			}
			else if(event.getSource() == buttons[2])
			{
				cone.iceCream.setTypeOfCone("waffle");
			}
			/** FLAVOR CHANGE ACTIONS **/
			else if(event.getSource() == buttons[3])
			{
				cone.iceCream.setFlavor("vanilla");
			}
			else if(event.getSource() == buttons[4])
			{
				cone.iceCream.setFlavor("strawberry");
			}
			else if(event.getSource() == buttons[5])
			{
				cone.iceCream.setFlavor("chocolate");
			}
			/** ADD SCOOP ACTION **/
			else if(event.getSource() == buttons[6])
			{
				cone.iceCream.addScoop();
			}
			/** TOPPINGS ACTION **/
			else if(event.getSource() == buttons[7])
			{
				cone.iceCream.addToppings("sprinkles");
				Color color = JColorChooser.showDialog(null, "Pick Your Color", (Color.PINK));
				cone.setSprinkles(color);
			}
			/** PRICE CALCULATOR ACTION **/
			else if(event.getSource() == buttons[8])
			{
				price.setText("Total Price: $"+cone.calcPrice());
			}
			/** RESET ACTION **/
			else if(event.getSource() == buttons[9])
			{
				cone.reset();
			}
			/** SAVE/RESTORE ACTIONS **/
			else if(event.getSource() == buttons[10])
			{
				cone.saveIceCream();
			}
			else if(event.getSource() == buttons[11])
			{
				cone.restoreIceCream();
			}
			repaint();
		}
		/* Unused MouseListener methods */
		public void mouseReleased(MouseEvent event){}
		public void mouseClicked(MouseEvent event){}
		public void mouseEntered(MouseEvent event){}
		public void mouseExited(MouseEvent event){}
	}
}
