
public class threeDPoint {
	private int z;
	private int y;
	private int x;
	
	public threeDPoint(int z, int x, int y) {
		this.z = z;
		this.y = y;
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getZ() {
		return z;
	}
	
	public double distance(threeDPoint aPoint) {
		return Math.pow(Math.pow(this.x - aPoint.getX(), 2)+Math.pow(this.y - aPoint.getY(), 2)+Math.pow(this.z - aPoint.getZ(), 2) , .5);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threeDPoint a = new threeDPoint(0,0,0);
		threeDPoint b = new threeDPoint(3, 4,0);
		System.out.println(a.distance(b));
		
	}

}
