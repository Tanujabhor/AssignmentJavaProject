package rectangle;

public class Rectangle {

	public int rectangle(int length, int width, String name) {
		int C = length * width;
		System.out.println("Area of the " + name);
		System.out.println("Length :" + length);
		System.out.println("Width :" + width);
		System.out.println("Area :"  );
		return C;
	}
	public void Triangle(int angle1, int angle2, String name) {
		int d = 180 -(angle1 + angle2);
		System.out.println("Angles of the " + name);
		System.out.println("angle1 :" + angle1);
		System.out.println("angle2 :" + angle2);
		System.out.println("angle3 :" + d );
	}
	public Rectangle(int a) {
		System.out.println("Area of the Reactangles");
		System.out.println(rectangle(57,76,"Rectangle1" )  );
		System.out.println("");
		System.out.println(rectangle(66,78, "Rectangle2")  );	
	}

	public Rectangle(int a, int b) {
		this(8);
		System.out.println("");
		System.out.println("Find Angles of the Triangles");
	}
	public Rectangle (boolean a) {
		this(8,6);
		Triangle(70,60,"Triangle1" );
		System.out.println("");
		Triangle(20,30, "Triangle2"); 	
	}
	
	public static void main(String[] args) {
		new Rectangle(true);	
	}
}
