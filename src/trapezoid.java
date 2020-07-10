
public class trapezoid extends shape{
	public trapezoid(threeDPoint a, threeDPoint b, threeDPoint c, threeDPoint d) {
		super.y = new threeDPoint[] {a, b, c, d}; 
		
	}
	
	

	@Override
	public double getArea() {
		double a = y[0].distance(y[1]);
		double b = y[2].distance(y[3]);
		double c = y[1].distance(y[3]);
		return ((a + b)/2)* c;
	}

	@Override
	public double getPerimeter() {
		double a = y[0].distance(y[1]);
		double b = y[2].distance(y[3]);
		double c = y[1].distance(y[2]);
		double d = y[0].distance(y[3]);

		return a + b + c + d;
	}
	
	public static void main(String args[]) {
		threeDPoint a = new threeDPoint(2,1,0);
		threeDPoint b = new threeDPoint(4, 1,0);
		threeDPoint c = new threeDPoint(0,0,0);
		threeDPoint d = new threeDPoint(4,0,0);
		trapezoid e = new trapezoid(a,b,c,d);
		
		System.out.println(e.getArea());
		System.out.println(e.getPerimeter());
	}
}
