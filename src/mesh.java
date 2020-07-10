import java.util.ArrayList;
import java.util.Arrays;

public class mesh{
	private ArrayList <threeDPoint> p = new ArrayList<threeDPoint>();
	public mesh(shape[] aShape) {
		threeDPoint[][] q = new threeDPoint[aShape.length][];
		for(int i = 0; i<3; i++) {
			q[i] = aShape[i].getPoints();
		}
		for(int i = 0; i< q.length;i++) {
			for(int j = 0; j< q[i].length ; j++) {
				p.add(q[i][j]);
			}
		}
	}
	
	public ArrayList addShape(shape newShape) {
		p.addAll(Arrays.asList(newShape.getPoints()));
		return p;
	}
	public ArrayList listOfPoints() {
		ArrayList <threeDPoint> q = new ArrayList <threeDPoint>();
		for(int i = 0; i < p.size(); i++) {
			q.add(p.get(i));
		}
		return q;
	}
	
	public static void main(String args[]) {
		threeDPoint a = new threeDPoint(2, 1, 0);
		threeDPoint b = new threeDPoint(4, 1, 0);
		threeDPoint c = new threeDPoint(0, 0, 0);
		threeDPoint d = new threeDPoint(4, 0, 0);
		threeDPoint e = new threeDPoint(0, 0, 0);
		threeDPoint f = new threeDPoint(4, 0, 0);
		threeDPoint g = new threeDPoint(4, 2, 0);
		threeDPoint h = new threeDPoint(0, 2, 0);
		threeDPoint i = new threeDPoint(0, 0, 0);
		threeDPoint j = new threeDPoint(4, 0, 0);
		threeDPoint n = new threeDPoint(0,4, 0);
		trapezoid k = new trapezoid(a,b,c,d);
		rectangle l = new rectangle(e,f,g,h);
		triangle m = new triangle(i,j,n);
		shape[] daShape = new shape[3];
		daShape[0] = k;
		daShape[1] = l;
		daShape[2] = m;
		threeDPoint s = new threeDPoint(0,0, 0);
		threeDPoint t = new threeDPoint(4,0, 0);
		threeDPoint u = new threeDPoint(0,5, 0);
		triangle v = new triangle(s,t,u);
		
		mesh o = new mesh(daShape);
		System.out.println(o.listOfPoints());
		o.addShape(v);
		System.out.println(o.listOfPoints());
	}
}
