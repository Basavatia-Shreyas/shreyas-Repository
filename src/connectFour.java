import java.util.Scanner;

public class connectFour {
	public static void main(String[] args){
		String whosTurn = "R";
		boolean gameWon = false;
		String[][] grid = new String[6][7];
		for (int i = 6-1; i>=0; i--){
			for (int j = 7-1; j>=0; j--){
			grid[i][j] = "*  ";
			}
		}
		for (int i = 0; i<grid.length; i++){
				for (int j = 0; j<grid[i].length; j++){
					System.out.print(grid[i][j]);
				}
				System.out.println();
				
		}
		
		while (gameWon == false){
			
			System.out.println("Enter the Y coordinate");
			Scanner turnY = new Scanner(System.in);
			int playerTurnY = turnY.nextInt();
			if (playerTurnY >6 || playerTurnY <0){
				System.out.println("Sorry those are invalid locations");
			}
			else{
				boolean checkPlace = true;
				while(checkPlace == true){
					int A = 0;
					if (grid[A][playerTurnY] != "*"){
						System.out.println("Sorry that place is already taken!!");
						A += 1;
					}
					else{
						grid[A][playerTurnY] = whosTurn;
						checkPlace = false;
					}
				}
					
		
				if (whosTurn == "R"){
					whosTurn = "Y";
				}
				else if (whosTurn == "Y"){
					whosTurn = "R";
				}
				
				for (int i = 0; i<grid.length; i++){
					for (int j = 0; j<grid[i].length; j++){
						System.out.print(grid[i][j]);
					}
					System.out.println();
				
				}
		}
	}
	}
	}
}
