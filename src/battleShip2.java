import java.util.Scanner;

public class battleShip2{
	
	//create boards. bottom boards have ship and top have the attack
	static String[][] playerOneBoard = new String [8][8];
	static String[][] playerTwoBoard = new String [8][8];
	static String[][] playerTwoTopBoard = new String [8][8];
	static String[][] playerOneTopBoard = new String [8][8];
	public static void setUp(){

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
		//ship lengths
		int[] shipL = new int[4];
		shipL[0] = 2;
		shipL[1] = 3;
		shipL[2] = 3;
		shipL[3] = 4;
		shipL[4] = 5;
		
		//set up game bottom boards(fill with ships)
		System.out.println("Player 1 setup. Goes from shortest to longest");
		//place ships in
		//repeats 5 times for each ship
		for(int i = 4; i>=0; i--){
			// you get a piece doesn't allow you to get that piece 
			//if it is invalid in some dimension
			boolean youGetAPiece = false;
			//player enters x and y coordinates and orientation into x
			Scanner x = new Scanner(System.in);
			int X = x.nextInt();
			int Y = x.nextInt();
			//check if the entered place is valid
			if (X > 8 || X < 0 || Y > 8 || Y < 0){
				System.out.println("You suck and don't get this piece");
				continue;
			}
			//Check if places are taken
			System.out.println("Enter orientation 'v' or 'h'");
			String Orientation = x.next();
			//check vertical
			if(Orientation == "v"){
				//as long as j is greater than Y - the ship length
				for(int j = Y; j>Y-shipL[i]; j--){
					if(j>= 0 && j<8){
						if (playerOneBoard[j][X] != "*  " || playerOneBoard[j][X] == "poo"){
							System.out.println("Sorry that place is already taken");
							youGetAPiece = false;
						}
						else{
							continue;
						}
					}
					else{
						System.out.println("Invalid location");
					}
					
				}//for loop 
			}//vertical-checking if statement
			
			//check horizontal
			else if(Orientation == "h"){
				for(int j = X; j >X - shipL[i]; j--){
					if(j>= 0 && j<8){
						if (playerOneBoard[Y][j] != "*  " || playerOneBoard[Y][j] == "poo"){
							System.out.println("Sorry that place is already taken");
						}
						else{
							continue;
						}
					}
					else{
						System.out.println("Invalid location");
					}
					
				}
			}
			
			//fill in the board with the ships
			//fill vertical
			if (Orientation == "v"){
				for(int j = Y; j>Y - shipL[i]; j--){
					
				}
			}
			
			//fill horizontal
			else if (Orientation == "h"){
				
			}
			
		}//end of player 1 setup for loop
		
	}//end of setUp
	
	public static void main(String[] args){
		setUp();
	}
}
	