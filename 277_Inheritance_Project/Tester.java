import java.util.Arrays;
public class Tester {
	public static void main(String[] args){
		
		GeometricObject[] shapes = new GeometricObject[6];
		shapes[0] = new Circle("Blue", true, "Circle", 5);
		shapes[1] = new Rectangle("Red", false, "Rectangle", 200,300);
		shapes[2] = new Triangle("Black", true,"Triangle",5,5,5);
		shapes[3] = new Circle(10);
		shapes[4] = new Triangle();
		shapes[5] = new Rectangle(34,45);
		
		System.out.println("\nMAX VALUE BY AREA");
		GeometricObject.max(shapes[0], shapes[3]);
		GeometricObject.max(shapes[1], shapes[5]);
		System.out.println();
		
		System.out.println("SORTED ARRAY LIST");
		Arrays.sort(shapes);
		for(int i = 0; i<shapes.length; i++)
		{
			System.out.println(shapes[i].toString());
		}
		
	}
}

