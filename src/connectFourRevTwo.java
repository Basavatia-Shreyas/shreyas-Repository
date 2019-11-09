import java.util.Scanner;

public class connectFourRevTwo {

	public static void main(String[] args) {
		String whosTurn = "R  ";
		boolean gameWon = false;
		String[][] grid = new String[6][7];
		// fill array
		for (int i = 6-1; i>=0; i--){
			for (int j = 7-1; j>=0; j--){
			grid[i][j] = "*  ";
			}
		}
		// print array
		for (int i = 0; i<grid.length; i++){
				for (int j = 0; j<grid[i].length; j++){
					System.out.print(grid[i][j]);
				}
				System.out.println();
				
		}
		
		//game loop
		while(gameWon == false){
			// ask for y coordinate
			System.out.println("Enter the Y coordinate");
			Scanner lctnY = new Scanner(System.in);
			int playerlctnY = lctnY.nextInt();
			
			//Check for if valid
			if  (playerlctnY >7 || playerlctnY <0){
				System.out.println("Sorry these are invalid locations");
			}
			// drop the piece in
			else{
				System.out.println("hi");
				int A = 5;
				while (A >= 0){
					if (grid[A][playerlctnY] != "*  "){
						A -= 1;
					}
					else{
						break;
						
					}
				}
				if (A == -1){
					System.out.println("Sorry this location is invalid");
				}
				// change the person's turn
				else{
					System.out.println("hiasdf");
					grid[A][playerlctnY] = whosTurn;
					
					if (whosTurn == "R  "){
						whosTurn = "Y  ";
					}
					else if (whosTurn == "Y  "){
						whosTurn = "R  ";
					}
					// print out the board
					for (int i = 0; i<grid.length; i++){
						for (int j = 0; j<grid[i].length; j++){
							System.out.print(grid[i][j]);
						}
						System.out.println();
					}
					// win conditions
					
					//horizontal
					int n = 0;
					for(int i = 5; i >= 0; i--){
						for (int j = 0; j<4; j++){
							if (grid[i][j] == "*  " || grid[i][j+1] == "*  " || grid[i][j+2] == "*  " || grid[i][j+3] == "*  "){
								continue;
							}
							else if (grid[i][j] == grid[i][j+1] && grid[i][j+1] == grid[i][j+2] && grid[i][j+2] == grid[i][j+3]) {
								System.out.println("You win!");
								gameWon = true;
							}
							
						}
						
					}
					//vertical
					for (int i = 5; i >= 0; i--){
						for (int j = 5; j>0; j--){
							if (grid[i][j] == "*  " || grid[i-1][j] == "*  " || grid[i-2][j] == "*  " || grid[i-3][j] == "*  "){
								continue;
							}
							else if (grid[i][j] == grid[i-1][j] && grid[i-1][j] == grid[i-2][j] && grid[i-2][j] == grid[i-3][j]) {
								System.out.println("You win!");
								gameWon = true;
							}
							
						}
					}
					//diagonal
					for(int j = 0; j <= 5; j++){
						int i = 3;
						if (grid[j][i] != "*  "){
							if (j < 3){
								if (grid[j][i] == grid[j+1][i+1] && grid[j+1][i+1] == grid[j+2][i+2] && grid[j+2][i+2] == grid[j+3][i+3]){
									System.out.println("You Won");
									gameWon = true;
								}
								else if (grid[j][i] == grid[j+1][i-1] && grid[j+1][i-1] == grid[j+2][i-2] && grid[j+2][i-2] == grid[j+3][i-3]){
									System.out.println("You Wun");
									gameWon = true;
								}
							}
							else if (j > 2){
								if (grid[j][i] == grid[j-1][i+1] && grid[j-1][i+1] == grid[j-2][i+2] && grid[j-2][i+2] == grid[j-3][i+3]){
									System.out.println("You Wan");
									gameWon = true;
								}
								else if (grid[j][i] == grid[j-1][i-1] && grid[j-1][i-1] == grid[j-2][i-2] && grid[j-2][i-2] == grid[j-3][i-3]){
									System.out.println("You Win");
									gameWon = true;
								}
							}
						}
					}
						
					
		
					
				}
			}
		}
	}

}
