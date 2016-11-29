/**
 * @author Sergey Ganous
 * @since 2/16/16
 *	Circle subclass of GeometricObject
 */
public class Circle extends GeometricObject {
//Initialize Variables
	private double radius;
	
//CONSTRUCTORS
	/** Empty circle constructor  */
	public Circle()
	{
		super();
		radius = 1.0;
	}
	
	/** Circle constructor that accepts a radius.
	 * @param aRadius Selected Radius of a circle. */
	public Circle(double aRadius)
	{
		radius = aRadius;
	}
	
	/** Circle constructor that accepts a full description of the shape
	 * @param aColor String color of the circle
	 * @param aFill	Boolean decision whether the circle is filled or not
	 * @param aName	String name of circle 
	 * @param aRadius Double selected radius of a circle */
	public Circle(String aColor, boolean aFill, String aName, double aRadius)
	{
		super(aColor, aFill, aName);
		radius = aRadius;
	}
	
	
//MUTATOR METHODS
	/** Method to set the radius of the circle
	 * @param aRadius Selected radius of the circle */
	public void setRadius(double aRadius)
	{
		radius = aRadius;
	}
	
//ACCESOR METHODS
	/** Method to return the radius of the circle
	 * @return radius of the circle */
	public double getRadius()
	{
		return radius;
	}
	/** Method to return area of the circle
	 * @return Area of the circle  */
	public double getArea()
	{
		return (Math.PI*Math.pow(radius, 2));
	}
	
	/** Method to return the perimeter of the circle
	 * @return Perimeter of the circle */
	public double getPerimeter()
	{
		return (2*Math.PI*radius);
	}
	
	/**Method to return the diameter of the circle 
	 * @return Diameter of the circle */
	public double getDiameter()
	{
		return 2*radius;
	}
	
	/** Method to return a string description of the circle */
	public String toString()
	{
		return "Name: "+getName()+"\n"+super.toString()+"\nRadius: "+radius+"\nDiameter: "+
				getDiameter()+"\nPerimeter"+getPerimeter()+"\nArea: "+
				getArea()+"\n";
	}

}
