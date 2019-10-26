import java.util.Scanner;

public class connectFourRevTwo {

	public static void main(String[] args) {
		String whosTurn = "R";
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
					grid[A][playerlctnY] = whosTurn + "  ";
					
					if (whosTurn == "R"){
						whosTurn = "Y";
					}
					else if (whosTurn == "Y"){
						whosTurn = "R";
					}
					// print out the board
					for (int i = 0; i<grid.length; i++){
						for (int j = 0; j<grid[i].length; j++){
							System.out.print(grid[i][j]);
						}
						System.out.println();
					}
					
					int n = 3;
					for(int i = 6; i >= 0; i--){
						if (grid[i][n] != "*  " && grid[i][n+1] != "*  " && grid[i][n+2] != "*  "){
							if (grid[i][n] == "R  "  || grid[i][n] == "Y  " && grid[i][n+1] == "R  "  || grid[i][n+1] == "Y  "&& grid[i][n+2] == "R  " || grid[i][n+2] == "Y  "){
								System.out.println("player red or player yellow wins");
							}
						}
						else if(grid[i][n-1] != "*  " && grid[i][n-2] != "*  " && grid[i][n-3] != "*  "){
							if (grid[i][n-1] == "R  "  || grid[i][n-1] == "Y  " && grid[i][n-2] == "R  "  || grid[i][n-2] == "Y  "&& grid[i][n-3] == "R  " || grid[i][n-3] == "Y  "){
								System.out.println("player red or player yellow wins");
							}
							}
						}
					
					for(int i = 5; i >= 0; i--){

					
					
				}
			}
		}
	}

}
