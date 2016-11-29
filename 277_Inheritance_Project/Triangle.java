/**
 * @author Sergey Ganous
 * @since 2/16/16
 * Triangle subclass of GeometricObject
 */
public class Triangle extends GeometricObject {
//INITIALIZE VARIABLES
	private	double side1;
	private double side2;
	private double side3;
	
//CONSTRUCTORS
	/** Empty triangle constructor  */
	public Triangle()
	{
		side1 = 1.0; side2 = 1.0; side3 = 1.0;	
	}
	/** Triangle constructor which accepts 3 sides
	 * @param s1 Side 1
	 * @param s2 Side 2
	 * @param s3 Side 3 */
	public Triangle(double s1, double s2, double s3)
	{
		side1 = s1; side2 = s2; side3 = s3;
	}
	/** Triangle constructor which accepts a full description 
	 * @param aColor Color of triangle
	 * @param aFill Boolean filled or not
	 * @param aName Name of triangle
	 * @param s1 Side 1
	 * @param s2 Side 2
	 * @param s3 Side 3 */
	public Triangle(String aColor, boolean aFill, String aName, double s1, double s2, double s3)
	{
		super(aColor, aFill, aName);
		side1 = s1; side2 = s2; side3 = s3;
	}
	
//MUTATOR METHODS
	/** Method to set side 1 
	 * @param s1 Side 1 */
	public void setSide1(double s1)
	{
		side1 = s1;
	}
	/** Method to set side 2
	 * @param s2 Side 2 */
	public void setSide2(double s2)
	{
		side2 = s2;
	}
	/** Method t set side 3
	 * @param s3 side 3 */
	public void setSide3(double s3)
	{
		side1 = s3;
	}
//ACCESOR METHODS
	/** Method to get side 1
	 * @return side1 */
	public double getSide1()
	{
		return side1;
	}
	/** Method to get side 2
	 * @return side2 */
	public double getSide2()
	{
		return side2;
	}
	/** Method to get side 3
	 * @return side3 */
	public double getSide3()
	{
		return side3;
	}
	/** Method to get the perimeter 
	 * @return perimeter */
	public double getPerimeter()
	{
		return (side1+side2+side3);
	}
	/** Method to get the area of the triangle
	 * @return Area */
	public double getArea()
	{
		double s = (getPerimeter()/2);
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	/** Method to return a String description of the triangle */
	public String toString()
	{
		return "Name: "+getName()+"\n"+super.toString()+"\nSide1: "+side1+"\nSide2: "+
				side2+"\nSide3: "+side3+"\nPerimeter"+getPerimeter()+"\nArea: "+
				getArea()+"\n";
	}
}
