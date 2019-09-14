import java.util.Scanner;

public class guessingGame {
	public static void main(String[] args){
		Scanner choice = new Scanner(System.in);
		int playerChoice = 0;
		int number = (int)(Math.random() * 100);
		while(number != playerChoice){
			playerChoice = choice.nextInt();
			if (playerChoice < number){
				System.out.println("Guess Higher");
				
			}
			else if (playerChoice > number) {
				System.out.println("Guess Lower");
			}
			else{
				System.out.println("You Guessed the number");
				
			}
		}
	}
}
