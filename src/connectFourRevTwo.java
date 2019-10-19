import java.util.Scanner;

public class connectFourRevTwo {

	public static void main(String[] args) {
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
		
		while(gameWon == false){
			System.out.println("Enter the Y coordinate");
			Scanner lctnY = new Scanner(System.in);
			int playerlctnY = lctnY.nextInt();
			
			//Check for if valid
			if  (playerlctnY >7 || playerlctnY <0){
				System.out.println("Sorry these are invalid locations");
			}
			else{
				int A = 0;
				while (A < 6){
					if (grid[A][playerlctnY] != "*  "){
						A += 1;
					}
				}
				if (A == 6){
					System.out.println("Sorry this location is invalid");
				}
				else{
					grid[A][playerlctnY] = whosTurn;
					
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
