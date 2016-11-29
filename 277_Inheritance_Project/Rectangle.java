/**
 * @author Sergey Ganous
 * @since 2/16/16
 *	Rectangle subclass of GeometricObject
 */
public class Rectangle extends GeometricObject {
//Initialize Variables
	double width;
	double height;

//Constructors
	/** Empty rectangle constructor */
	public Rectangle()
	{
		super();
		width = 1.0;
		height = 1.0;
	}
	/**Rectangle constructor that accepts width and height
	 * @param aWidth Width of rectangle
	 * @param aHeight Height of rectangle */
	public Rectangle(double aWidth, double aHeight)
	{
		width = aWidth;
		height = aHeight;
	}
	
	/**Rectangle constructor that accepts a full description of shape
	 * @param aColor Color of rectangle
	 * @param aFill Boolean deciding whether shape is filled or not
	 * @param aName	Name of rectangle
	 * @param aWidth Width of rectangle
	 * @param aHeight Height of rectangle*/
	public Rectangle( String aColor, boolean aFill, String aName, double aWidth, double aHeight)
	{
		super(aColor, aFill, aName);
		width = aWidth;
		height = aHeight;
	}
	
//Mutator Methods
	/** Method to set the width of the rectangle
	 * @param aWidth Width of rectangle */
	public void setWidth(double aWidth)
	{
		width = aWidth;
	}
	
	/** Method to set the height of the rectngle
	 * @param aHeight Height of rectangle */
	public void setHeight(double aHeight)
	{
		height = aHeight;
	}
	
//Accessor Methods
	/** Method to return the width of rectangle
	 * @return width  */
	public double getWidth()
	{
		return width;
	}
	/** Method to return the height of rectangle
	 * @return height */
	public double getHeight()
	{
		return height;
	}
	/** Method to return the area of rectangle
	 * @return Area */
	public double getArea()
	{
		return width*height;
	}
	/** Method to return perimeter of rectangle
	 * @return Perimeter */
	public double getPerimeter()
	{
		return (width*2)+(height*2);
	}
	/** Method to return a string description of the rectangle
	 */
	public String toString()
	{
		return "Name: "+getName()+"\n"+super.toString()+"\nWidth: "+width+"\nHeight: "+
				height+"\nPerimeter"+getPerimeter()+"\nArea: "+
				getArea()+"\n";
	}

	

}
