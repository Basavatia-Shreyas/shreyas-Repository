import java.util.Scanner;

public class BattleShip {
	public static void setUp(){
		boolean youGetAPiece = true;
		//create lists
		String[][] playerOneBoard = new String[8][8];
		String[][] playerTwoBoard = new String[8][8];
		String[][] playerOneTopBoard = new String[8][8];
		String[][] playerTwoTopBoard = new String[8][8];
		//fill the lists
		for (int i = 7; i>=0; i--){
			for (int j = 7; j>=0; j--){
				playerOneBoard[i][j] = "*  ";
				playerTwoBoard[i][j] = "*  ";
				playerOneTopBoard[i][j] = "*  ";
				playerTwoTopBoard[i][j] = "*  ";
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
		shipL[0] = 2;
		shipL[1] = 3;
		shipL[2] = 3;
		shipL[3] = 4;
		shipL[4] = 5;
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
			if (Orientation.equals("v")){
				for(int j = Y; j>Y-shipL[i-1]; j--){
					if(j>-1 && j<8){
						if (playerOneBoard[j][X] != "*  " || playerOneBoard[j][X].equals("poo")){
							System.out.print("Sorry that place is already taken ");
							youGetAPiece = false;
						}
						else{
							continue;
						}
					}
					
				}
			}
			else if (Orientation.equals("h")){
				for(int j = X; j>X-shipL[i-1]; j--){
					if(j>-1 && j<8){
						if (playerOneBoard[Y][j] != "*  " || playerOneBoard[j][X].equals("poo")){
							System.out.print("Sorry that place is already taken ");
							youGetAPiece = false;
						}
						else{
							continue;
						}
					}
					
				}
			}
			//fill 
			if (Orientation.equals("v")){
				for(int j = Y; j>Y-shipL[i-1]; j--){
					if(j>-1 && j<8){
						if (youGetAPiece == false){
							System.out.println("You suck");
						}
						if(playerOneBoard[j][X].equals("poo")){
							System.out.println("You suck");
						}
						else{
							playerOneBoard[j][X] = "poo";
						}
					}
					
				}
			}
			else if (Orientation.equals("h")){
				for(int j = X; j>X-shipL[i-1]; j--){
					if(j>-1 && j<8){
						if(playerOneBoard[Y][j].equals("poo")){
							System.out.println("You suck");
						}
						else{
							playerOneBoard[Y][j] = "poo";
						}
					}
					
				}
			}
			// print filled in board
			for (int k = 0; k<playerOneBoard.length; k++){
				for (int j = 0; j<playerOneBoard[k].length; j++){
					System.out.print(playerOneBoard[k][j]);
				}
				System.out.println();
				
			}
		
	}
	

}
	public static void main(String[] args) {
		//game loop
		setUp();
	}
}