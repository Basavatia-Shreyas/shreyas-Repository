import java.util.Scanner;

public class calculatorProgram {
	public static void main(String args[]){
		while(true){
		System.out.println("Enter two numbers");
		Scanner numOne = new Scanner(System.in);
		double thingOne = numOne.nextDouble();
		Scanner numTwo = new Scanner(System.in);
		double thingTwo = numOne.nextDouble();
		
		System.out.println("Enter m for multiply, d for divide, s for subtraction, and a for add");
		Scanner operation = new Scanner(System.in);
		String userOperation = operation.next();
	
		if (userOperation.equals("m")){
			System.out.println(thingOne * thingTwo);
		}
		
		else if (userOperation.equals("d")){
			System.out.println(thingOne / thingTwo);
		}
		
		else if (userOperation.equals("s")){
			System.out.println(thingOne - thingTwo);
		}
		
		else if (userOperation.equals("a")){
			System.out.println(thingOne + thingTwo);
		}
		}
	}
		
}
