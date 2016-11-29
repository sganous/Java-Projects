import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Sergey Ganous (012278381)
 * @since 3/22/16
 * CECS 277: STREAM IO PROJECT
 * This is the ice cream painted component.
 */
import javax.swing.JComponent;

public class ConeComponent extends JComponent
{
	/* INITIALIZATION */
	
	AdvancedIceCreamCone iceCream = new AdvancedIceCreamCone();
	
	/** CONES **/
	//Standard Cone
	final static private int stnd_cone_x[] = {350,450,450,500,500,300,300,350};
	final static private int stnd_cone_y[] = {850,850,750,700,650,650,700,750};
	
	//Sugar Cone
	final static private int sugar_cone_x[] = {400,350,450};
	final static private int sugar_cone_y[] = {900,700,700};

	//Waffle Cone
	final static private int waffle_cone_x[] = {400,480,400,320};
	final static private int waffle_cone_y[] = {920,670,720,670};
	
	//Cone Path
	GeneralPath path = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
	
	/** Colors **/
	Color beige = new Color(255,204,128);
	Color strawberry = new Color(236,64,122);
	Color vanilla = new Color(255,224,178);
	Color chocolate = new Color(121,85,72);
	Color sprinkles;
	
	
	/** ICE CREAM SCOOPS **/
	private static final int radius = 100;
	private static final int scoop1_x = 400 - radius;
	private static final int scoop1_y = 615 - radius;
	private static final int scoop2_x = 400 - radius;
	private static final int scoop2_y = 515 - radius;
	private static final int scoop3_x = 400 - radius;
	private static final int scoop3_y = 415 - radius;
	
	/* Cone Component Constructor */
	public ConeComponent(){}
	
	/**
	 * PaintComponent Overwrite in order to print image
	 */
	protected void paintComponent(Graphics g) { 
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		//DRAW SCOOPS
		if(iceCream.getFlavor().equals("strawberry")){ g2.setColor(strawberry); }
		else if(iceCream.getFlavor().equals("chocolate")){ g2.setColor(chocolate); }
		else { g2.setColor(vanilla);}
		
		g2.fillOval(scoop1_x, scoop1_y, radius*2, radius*2);
		if(iceCream.getNumberOfScoops() > 1)
		{
		g2.fillOval(scoop2_x, scoop2_y, radius*2, radius*2);
		}
		if(iceCream.getNumberOfScoops() > 2)
		{
		g2.fillOval(scoop3_x, scoop3_y, radius*2, radius*2);
		}
		
		//DRAW CONES
		if(iceCream.getTypeOfCone().equals("regular"))
		{
			path.reset();
			path.moveTo(stnd_cone_x[0], stnd_cone_y[0]);
			for(int index = 1; index < stnd_cone_x.length; index++)
			{
				path.lineTo(stnd_cone_x[index], stnd_cone_y[index]);
			}
			path.closePath();
		}
		else if(iceCream.getTypeOfCone().equals("sugar"))
		{
			path.reset();
			path.moveTo(sugar_cone_x[0], sugar_cone_y[0]);
			for(int index = 1; index < sugar_cone_x.length; index++)
			{
				path.lineTo(sugar_cone_x[index], sugar_cone_y[index]);
			}
			path.closePath();
		}
		else
		{
			path.reset();
			path.moveTo(waffle_cone_x[0], waffle_cone_y[0]);
			for(int index = 1; index < waffle_cone_x.length; index++)
			{
				path.lineTo(waffle_cone_x[index], waffle_cone_y[index]);
			}
			path.closePath();
		}
		g2.setColor(beige);
		g2.fill(path);
		g2.draw(path);
		
		//DRAW TOPPINGS
		g2.setColor(sprinkles);
		if(!iceCream.getToppings().isEmpty())
		{
			g2.fillOval(400, 600, 10, 10);
			g2.fillOval(450, 620, 10, 10);
			g2.fillOval(420, 570, 10, 10);
			g2.fillOval(350, 540, 10, 10);
			g2.fillOval(330, 620, 10, 10);
			if(iceCream.getNumberOfScoops() > 1)
			{
				g2.fillOval(330, 500, 10, 10);
				g2.fillOval(450, 470, 10, 10);
				g2.fillOval(400, 440, 10, 10);
				g2.fillOval(400, 490, 10, 10);
				g2.fillOval(460, 510, 10, 10);
				if(iceCream.getNumberOfScoops() > 2)
				{
					g2.fillOval(330, 350, 10, 10);
					g2.fillOval(450, 370, 10, 10);
					g2.fillOval(400, 340, 10, 10);
					g2.fillOval(400, 390, 10, 10);
					g2.fillOval(460, 410, 10, 10);
					g2.fillOval(330, 420, 10, 10);
				}
			}
		}		
	}
	
	/** Color set method for sprinkles 
	 *	@param color Takes in a color parameter chosen by the user from a 
	 *		   color chooser menu in the IceFrame class. 
	**/
	public void setSprinkles(Color color)
	{
		sprinkles = color;
	}
	
	/** Price Calculating Algorythm **/
	public String calcPrice()
	{
		double price = 0;
		if(iceCream.getTypeOfCone().equals("regular")){ price += 1.00; }
		else if(iceCream.getTypeOfCone().equals("sugar")){ price += 1.50; }
		else{ price += 2.00; }
		
		if(iceCream.getNumberOfScoops() ==1){ price += 1.00; }
		else if(iceCream.getNumberOfScoops() == 2){ price += 1.50; }
		else{ price += 2.00; }
		
		if(!iceCream.getToppings().isEmpty()){ price += 0.50;}
		
		return new Double(price).toString();
		
	}
	
	/** Function to reset the iceCream object **/
	public void reset()
	{
		iceCream = new AdvancedIceCreamCone();
	}
	
	/** Function to recover a saved iceCream object **/
	public void restoreIceCream()
	{
		try{
			JFileChooser chooser = new JFileChooser();
			if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
			{
			   File selectedFile = chooser.getSelectedFile();
			   ObjectInputStream in = new ObjectInputStream(new FileInputStream(selectedFile));
			   iceCream = (AdvancedIceCreamCone) in.readObject();
			}
		}
		catch(IOException | ClassNotFoundException exception)
		{
			System.out.println("Could not open file.");
		}
	}
	
	/** Function to save an iceCream object **/
	public void saveIceCream()
	{
		try{
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("storedIceCream.dat"));
			out.writeObject(iceCream);
		}
		catch(IOException exception)
		{
			System.out.println("Could not save file.");
		}
	}
	

}
