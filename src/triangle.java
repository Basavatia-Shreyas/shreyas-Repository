
public class triangle extends shape{
	public triangle(threeDPoint a, threeDPoint b, threeDPoint c) {
		super.y = new threeDPoint[] {a, b, c}; 
		
	}

	@Override
	public double getArea() {
		double a = y[0].distance(y[1]);
		double b = y[0].distance(y[2]);
		return .5 * a * b;
	}

	@Override
	public double getPerimeter() {
		double a = y[0].distance(y[1]);
		double b = y[1].distance(y[2]);
		double c = y[2].distance(y[0]);
		
		return a + b + c;
	}
	
	public static void main(String args[]) {
		threeDPoint a = new threeDPoint(0,0,0);
		threeDPoint b = new threeDPoint(0,4,0);
		threeDPoint d = new threeDPoint(4,0,0);
		triangle e = new triangle(a,b,d);
		
		System.out.println(e.getArea());
		System.out.println(e.getPerimeter());
	}
}
