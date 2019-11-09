
public class methods {
	public static int add(int x, int y){
		return x+y;
	}
	public static int subtract(int x, int y){
		return x-y;
	}
	public static double multiply(int x, double y){
		return x*y;
	}
	public static double divide(double x, double y){
		return x/y;
	}
	public static double power(int x, int y){
		return Math.pow(x,y);
	}
	public static void main(String[] args) {
		//methods
		System.out.println(add(5,7));
		System.out.println(subtract(5,7));
		System.out.println(multiply(5,7));
		System.out.println(divide(5,7));
		System.out.println(power(5,7));
		System.out.println(multiply(add(6,7), divide(8,3)));
	}

}
