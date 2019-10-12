import java.util.Scanner;

public class ticTacToe {
	public static void main(String[] args){
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
}
