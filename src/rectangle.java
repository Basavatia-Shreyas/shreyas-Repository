
public class rectangle extends shape{
	public rectangle(threeDPoint a, threeDPoint b, threeDPoint c, threeDPoint d) {
		super.y = new threeDPoint[] {a, b, c, d}; 
		
	}

	@Override
	public double getArea() {
		double a = y[0].distance(y[1]);
		double b = y[1].distance(y[2]);
		return a * b;
	}

	@Override
	public double getPerimeter() {
		double a = y[0].distance(y[1]);
		double b = y[1].distance(y[2]);
		
		return (a*2) + (b*2);
	}
	
	public static void main(String args[]) {
		threeDPoint a = new threeDPoint(4,2,0);
		threeDPoint b = new threeDPoint(4, 0,0);
		threeDPoint d = new threeDPoint(0,2,0);
		threeDPoint c = new threeDPoint(0, 0,0);
		rectangle e = new rectangle(a,b,c,d);
		
		System.out.println(e.getArea());
		System.out.println(e.getPerimeter());
	}
}
