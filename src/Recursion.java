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
		if(Y == 1){
			int product = X;
			return product;
		}
			return X + multiply(X, Y-1);
		
	
	}
	
	public static int exponent(int Q, int W){
		if(W ==1){
			return Q;
		}
		
		return Q * exponent(Q, W-1);
	}
	

	
	public static int fibonacci(int E){
		int num = 1;
		if(E <= 1){
			return 1;
		}
		
		
		return fibonacci(E-1) + fibonacci(E-2);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100;
		countdown(x);
		
		Scanner hello = new Scanner(System.in);
		int X = hello.nextInt();
		int Y = hello.nextInt();
		System.out.println(multiply(X, Y));
		
		int Q = hello.nextInt();
		int W = hello.nextInt();
		System.out.println(exponent(Q, W));
		System.out.println("Done");
		
		
		int numTwo = 1;
		int numThree = 1;
		for(int i = 5;i>=0; i--){
			int num = numTwo + numThree;
			numThree = numTwo;
			numTwo = num;
			System.out.println(num);
			
			
		}
		
		int E = hello.nextInt();
		System.out.println(fibonacci(E));
	}

}
