/**
 * Rectangle Tester Method
 */
public class RectangleTester {
	public static void main(String[] args){
		BetterRectangle box = new BetterRectangle();
		box.add(5,10);
		
		double perimeter = box.getPerimeter();
		double area = box.getArea();
		
		System.out.println("Perimeter: " +perimeter);
		System.out.println("Area: " +area);
	}

}
