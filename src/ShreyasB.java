import java.util.Scanner;

public class ShreyasB {
	public static void main(String args[]) {
		System.out.println("Hello World");
		int me = 3;
		boolean you = false;
		String us = "Hello";
		System.out.println(us);
		
		/*Scanner something = new Scanner(System.in);
		String echo = something.next();
		System.out.println(echo);
		
		System.out.println(1.0/me);
		if(us.equals(echo)){
			System.out.println("yay");
			
		}
		else if(echo.equals("j")){
			System.out.println("boo");
		}*/
		
		while (me == 3){
			System.out.println("Do you want to continue. y for yes and n for no");
			Scanner whatUWant = new Scanner(System.in);
			String whatDoUWant = whatUWant.next();
			if (whatDoUWant.equals("n")){
				System.out.println("hehehe");
				break;
			}
			else if (whatDoUWant.equals("y")){
				System.out.println("ok");
			}
		}
	}
}
