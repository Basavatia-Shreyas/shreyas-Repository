import java.util.Scanner;

public class ticTacToeMethods {
	public static void ticTacToe(){
		int n = 3;
		boolean gameWon = false;
		String whosTurn = "X";
		String[][] list = new String[n][n];
		
		for (int i = n-1; i>=0; i--){
			for (int j = n-1; j>=0; j--){
			list[i][j] = "*";
			}
		}
		for (int i = 0; i<list.length; i++){
			for (int j = 0; j<list.length; j++){
				System.out.print(list[i][j]);
			}
			System.out.println();
			
		}
		
		while (gameWon == false){
			
			System.out.println("Enter the x coordinate");
			Scanner turnX = new Scanner(System.in);
			int playerTurnX = turnX.nextInt();
			
			System.out.println("Enter the Y coordinate");
			Scanner turnY = new Scanner(System.in);
			int playerTurnY = turnY.nextInt();
			
			if (playerTurnX >2 || playerTurnY >2 || playerTurnX <0 || playerTurnY <0){
				System.out.println("Sorry those are invalid locations");
			}
			else{
				
			
				if (list[playerTurnX][playerTurnY] != "*"){
					System.out.println("Sorry that place is already taken!!");
				}
				else{
					list[playerTurnX][playerTurnY] = whosTurn;
				
					
				if (list[0][0] == "X" && list[0][1]== "X" && list[0][2] == "X"){
					System.out.println("Player 1 wins");
					System.exit(1);
						
				}
				else if (list[1][0] == "X" && list[1][1]== "X" && list[1][2] == "X"){
					System.out.println("Player 1 wins");
					System.exit(1);
				}
				else if (list[2][0] == "X" && list[2][1]== "X" && list[2][2] == "X"){
					System.out.println("Player 1 wins");
					System.exit(1);			
				}
				else if (list[0][0] == "O" && list[0][1]== "O" && list[0][2] == "O"){
					System.out.println("Player 2 wins");
					System.exit(1);
				}
				else if (list[1][0] == "O" && list[1][1]== "O" && list[1][2] == "O"){
					System.out.println("Player 2 wins");
					System.exit(1);
				}
				else if (list[2][0] == "O" && list[2][1]== "O" && list[2][2] == "O"){
					System.out.println("Player 2 wins");
					System.exit(1);
				}
				else if (list[0][0] == "X" && list[1][0]== "X" && list[2][0] == "X"){
					System.out.println("Player 1 wins");
					System.exit(1);
				}
				else if (list[0][1] == "X" && list[1][1]== "X" && list[2][1] == "X"){
					System.out.println("Player 1 wins");
					System.exit(1);
				}
				else if (list[0][2] == "X" && list[1][2]== "X" && list[2][2] == "X"){
					System.out.println("Player 1 wins");
					System.exit(1);
				}
				else if (list[0][0] == "O" && list[1][0]== "O" && list[2][0] == "O"){
					System.out.println("Player 2 wins");
					System.exit(1);
				}
				else if (list[0][1] == "O" && list[1][1]== "O" && list[2][1] == "O"){
					System.out.println("Player 2 wins");
					System.exit(1);
				}
				else if (list[0][2] == "O" && list[1][2]== "O" && list[2][2] == "O"){
					System.out.println("Player 2 wins");
					System.exit(1);
				}
				else if (list[0][0] == "X" && list[1][1]== "X" && list[2][2] == "X"){
					System.out.println("Player 1 wins");
					System.exit(1);
				}
				else if (list[2][0] == "X" && list[1][1]== "X" && list[0][2] == "X"){
					System.out.println("Player 1 wins");
					System.exit(1);
				}
				else if (list[0][0] == "O" && list[1][1]== "O" && list[2][2] == "O"){
					System.out.println("Player 2 wins");
					System.exit(1);
				}
				else if (list[2][0] == "O" && list[1][1]== "O" && list[0][2] == "O"){
					System.out.println("Player 2 wins");
					System.exit(1);
				}
				
				
					if (whosTurn == "X"){
						whosTurn = "O";
					}
					else if (whosTurn == "O"){
						whosTurn = "X";
					}
				}
			}
			for (int i = 0; i<list.length; i++){
				for (int j = 0; j<list.length; j++){
					System.out.print(list[i][j]);
				}
				System.out.println();
			
				
			}
		}
	}
	
		public static void main(String[] args){
			ticTacToe();
	}
	
}
