/**
 * Sergey Ganous 
 * 012278381
 * 1/28/15
 * Lab2: Better Rectangle
 */

import java.awt.Rectangle;
public class BetterRectangle extends Rectangle{
	
	public double getPerimeter(){
		return (height*2)+(width*2);
	}
	
	public double getArea(){
		return (height*width);
	}
	
}
