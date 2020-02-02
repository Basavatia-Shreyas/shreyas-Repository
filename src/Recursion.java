import java.util.Scanner;

public class Recursion {
	
	public static void countdown(int x){
		if (x == 0){
			System.out.println("Done");
		}
		else{
			System.out.println(x);
			x -= 1;
			countdown(x);
		}
		
	}

	public static int multiply(int X, int Y){
		if(Y == 0){
			int product = X+Y;
			return product;
		}
		
		else{
			/product = X + X;
			multiply(X, Y-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100;
		countdown(x);
		
		Scanner hello = new Scanner(System.in);
		int X = hello.nextInt();
		int Y = hello.nextInt();
		multiply(X, Y);
	}

}
