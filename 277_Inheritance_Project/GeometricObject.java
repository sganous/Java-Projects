/**
 * @author Sergey Ganous (012278381)
 * @since 2/15/16
 * Inheritance/Polymorphism/Interface Project
 * Geometric Object Class
 */	
public abstract class GeometricObject implements Comparable<GeometricObject>{
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;
  private String name = "noname";

 /** Construct a default geometric object */
  public GeometricObject() {
	dateCreated = new java.util.Date();
}

/** Construct a geometric object with the specified color
	*  and filled value */
 public GeometricObject(String color, boolean filled, String name) {
 	dateCreated = new java.util.Date();
	this.color = color;
	this.filled = filled;
	this.name = name;
   }

/** Return color */
 public String getColor() {
 return color;
   }

/** Set a new color */
 public void setColor(String color) {
 this.color = color;
   }

/** Return filled. Since filled is boolean,
	its get method is named isFilled */
 public boolean isFilled() {
 return filled;
   }

/** Set a new filled */
 public void setFilled(boolean filled) {
 this.filled = filled;
   }

/** Get dateCreated */
 public java.util.Date getDateCreated() {
 return dateCreated;
   }

/** Return name */
 public String getName() {
 return name;
   }

/** Set a new name */
public void setName(String name) {
this.name = name;
}

/** Return a string representation of this object */
 public String toString() {
 return "created on " + dateCreated + "\ncolor: " + color +
 " and filled: " + filled;
  }
 
 /**Get Area
  * @return area */
 public abstract double getArea();
 
 public int compareTo(GeometricObject obj){
	 if(this.getArea() < obj.getArea()){
		 return -1;
	 }
	 if(this.getArea() > obj.getArea()){
		 return 1;
	 }
	 else{
		 return 0;
	 }
 }
 
 /** Get the max area of objects 
  * @param array Array of Geometric Objects
  * @return GeometricObject with the largest area  */
 public static GeometricObject max(GeometricObject a, GeometricObject b){
	 	if(a.getClass() == b.getClass())
	 	{
	 		if(a.getArea() > b.getArea()){
	 			System.out.println(a.getName()+" is greater than "+b.getName());
	 			return a;
	 		}
	 		else if(a.getArea() < b.getArea()){
	 			System.out.println(a.getName()+" is less than "+b.getName());
	 			return b;
	 		}
	 		else{
	 			System.out.println("The Objects are the same.");
	 			return null;
	 		}
	 	}
	 	
	 	System.out.println("The Objects do not match.");
	 	return null;
 }
 
 }