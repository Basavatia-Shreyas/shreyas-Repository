import java.util.Scanner;

public class BattleShip {
	public static void setUp(){
		//create lists
		String[][] playerOneBoard = new String[8][8];
		String[][] playerTwoBoard = new String[8][8];
		String[][] playerOneTopBoard = new String[8][8];
		String[][] playerTwoTopBoard = new String[8][8];
		//fill the lists
		for (int i = 8; i>=0; i--){
			for (int j = 8; j>=0; j--){
				playerOneBoard[i][j] = "*  ";
				playerTwoBoard[i][j] = "*  ";
			}
		}
		//Print Board
		for (int i = 0; i<playerOneTopBoard.length; i++){
			for (int j = 0; j<playerOneTopBoard[i].length; j++){
				System.out.print(playerOneTopBoard[i][j]);
			}
			System.out.println();
			
		}
		//setup the game boards(Fill with ships)
		System.out.println("Player One Setup");
		System.out.println("Where do you want start point of the thing and Horizontal(h) or Vertical(v)");
		int[] shipL = new int[5];
		for(int i = 5; i>-1; i--){
			Scanner x = new Scanner(System.in);
			int X = x.nextInt();
			int Y = x.nextInt();
			//Check if valid
			if (X > 8 || X < 0 || Y > 8 || Y < 0){
				System.out.println("You suck");
				continue;
			}
			//Check if taken and fill in if not
			String Orientation = x.next();
			if (Orientation == "v"){
				for(int j = Y; j>Y-shipL; j--){
					if (playerOneBoard[Y][X] != "*  "){
						System.out.print("Sorry that place is already taken ");
					}
					else{
						continue;
					}
				}
			}
			else if (Orientation == "h"){
				for(int j = X; j>X-shipL; j--){
					if (playerOneBoard[Y][X] != "*  "){
						System.out.print("Sorry that place is already taken ");
					}
					else{
						continue;
					}
				}
			}
			//fill 
			if (Orientation == "v"){
				for(int j = Y; j>Y-shipL; j--){
					playerOneBoard[Y][X] = "poo";
				}
			}
			else if (Orientation == "h"){
				for(int j = X; j>X-shipL; j--){
					playerOneBoard[Y][X] = "poo";
				}
			}
		
	}
	

}
	public static void main(String[] args) {
		//game loop
		
	}
}
