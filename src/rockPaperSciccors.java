import java.util.Scanner;

public class rockPaperSciccors {
	public static void main(String args[]){
		System.out.println("Enter a number, 1 for rock, 2 for paper and 3 for sciccors");
		Scanner choice = new Scanner(System.in);
		int playerChoice = choice.nextInt();
		int number = (int)(Math.random() * 3);
		if ((playerChoice == 1) && (number == 0)){
			System.out.println("Tie");
		}
		else if (playerChoice == 1 && number == 1){
			System.out.println("You Lose");
		}
		else if (playerChoice == 1 && number == 2){
			System.out.println("You Win");
		}
		else if (playerChoice == 2 && number == 0){
			System.out.println("You Win");
		}
		else if (playerChoice == 2 && number == 1){
			System.out.println("Tie");
		}
		else if (playerChoice == 2 && number == 2){
			System.out.println("You Lose");
		}
		else if (playerChoice == 3 && number == 0){
			System.out.println("You Lose");
		}
		else if (playerChoice == 3 && number == 1){
			System.out.println("You Win");
		}
		else if (playerChoice == 3 && number == 2){
			System.out.println("Tie");
		}
		else{
			System.out.println("Oops something went wrong");
			
		}
	}
}
