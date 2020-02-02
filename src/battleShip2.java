import java.util.Scanner;

public class battleShip2{

	//create boards. bottom boards have ship and top have the attack
	static String[][] playerOneBoard = new String [8][8];
	static String[][] playerTwoBoard = new String [8][8];
	static String[][] playerTwoTopBoard = new String [8][8];
	static String[][] playerOneTopBoard = new String [8][8];

	public static void setUp(){//setup class

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
		int[] shipL = new int[5];
		shipL[0] = 2;
		shipL[1] = 3;
		shipL[2] = 3;
		shipL[3] = 4;
		shipL[4] = 5;

		//set up game bottom boards(fill with ships)
		System.out.println("Player setup. Goes from shortest to longest ship");
		//place ships in for player 1 only
		//repeats 5 times for each ship
		for(int i = 4; i>=0; i--){
			// you get a piece doesn't allow you to get that piece 
			//if it is invalid in some dimension
			boolean youGetAPiece = true;
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
			System.out.println("If h, the ship goes to the left and if v, the ship goes up");
			String Orientation = x.next();
			//check vertical
			if(Orientation.equals("v")){
				//as long as j is greater than Y - the ship length
				for(int j = Y; j>Y-shipL[i]; j--){
					if(j>= 0 && j<8){
						System.out.println("hi");
						if (playerOneBoard[j][X] != "*  " || playerOneBoard[j][X] == "poo"){
							System.out.println("Sorry that place is already taken");
							youGetAPiece = false;
							System.out.println("hi02");
						}
						else{
							System.out.println("hi03");
							continue;
						}
					}
					else{
						System.out.println("Invalid location");
					}

				}//for loop 
			}//vertical-checking if statement

			//check horizontal
			else if(Orientation.equals("h")){
				System.out.println("hi14");
				for(int j = X; j >X - shipL[i]; j--){
					System.out.println("hi15");
					if(j>= 0 && j<8){
						System.out.println("hi04");
						if (playerOneBoard[Y][j] != "*  " || playerOneBoard[Y][j] == "poo"){
							System.out.println("Sorry that place is already taken");
							System.out.println("hi05");
						}
						else{
							System.out.println("hi06");
							continue;
						}
					}
					else{
						System.out.println("Invalid location");
					}

				}//for loop
			}//orientation if statement
			System.out.println("hi20");
			//fill in the board with the ships
			//fill vertical
			if (Orientation.equals("v")){
				for(int j = Y; j>Y - shipL[i]; j--){
					if(j>=0 && j<8){
						System.out.println("hi07");
						if(youGetAPiece == false){
							System.out.println("you suck");
						}//if
						else if (playerOneBoard[j][X].equals("poo")){
							System.out.println("you suck");
						}
						else{
							System.out.println("hi08");
							playerOneBoard[j][X] = "poo";
						}
					}//if
				}//for loop
			}//orientation if stmnt

			//fill horizontal
			else if (Orientation.equals("h")){
				System.out.println("hi13");
				for(int j = X; j>X-shipL[i]; j--){
					System.out.println("hi12");
					if(j>-1 && j<8){
						System.out.println("hi09");
						if(playerOneBoard[Y][j].equals("poo")){
							System.out.println("You suck");
						}
						else{
							System.out.println("hi10");
							playerOneBoard[Y][j] = "poo";
						}
					}

				}
			}//orientation if statement
			//print out player 1 board
			System.out.println("hi11");
			for (int k = 0; k<playerOneBoard.length; k++){
				for (int j = 0; j<playerOneBoard[k].length; j++){
					System.out.print(playerOneBoard[k][j]);
				}
				System.out.println();
			}
		}//end of player 1 setup for loop

		//player 2 setup
		for(int i = 0; i < 5; i++){
			// you get a piece doesn't allow you to get that piece 
			//if it is invalid in some dimension
			boolean youGetAPiece = true;
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
			System.out.println("If h, the ship goes to the left and if v, the ship goes up");
			String Orientation = x.next();
			//check vertical
			if(Orientation.equals("v")){
				//as long as j is greater than Y - the ship length
				for(int j = Y; j>Y-shipL[i]; j--){
					if(j>= 0 && j<8){
						System.out.println("hi");
						if (playerTwoBoard[j][X] != "*  " || playerTwoBoard[j][X] == "poo"){
							System.out.println("Sorry that place is already taken");
							youGetAPiece = false;
							System.out.println("hi02");
						}
						else{
							System.out.println("hi03");
							continue;
						}
					}
					else{
						System.out.println("Invalid location");
					}

				}//for loop 
			}//vertical-checking if statement

			//check horizontal
			else if(Orientation.equals("h")){
				System.out.println("hi14");
				for(int j = X; j >X - shipL[i]; j--){
					System.out.println("hi15");
					if(j>= 0 && j<8){
						System.out.println("hi04");
						if (playerTwoBoard[Y][j] != "*  " || playerTwoBoard[Y][j] == "poo"){
							System.out.println("Sorry that place is already taken");
							System.out.println("hi05");
						}
						else{
							System.out.println("hi06");
							continue;
						}
					}
					else{
						System.out.println("Invalid location");
					}

				}//for loop
			}//orientation if statement
			System.out.println("hi20");
			//fill in the board with the ships
			//fill vertical
			if (Orientation.equals("v")){
				for(int j = Y; j>Y - shipL[i]; j--){
					if(j>=0 && j<8){
						System.out.println("hi07");
						if(youGetAPiece == false){
							System.out.println("you suck");
						}//if
						else if (playerTwoBoard[j][X].equals("poo")){
							System.out.println("you suck");
						}
						else{
							System.out.println("hi08");
							playerTwoBoard[j][X] = "poo";
						}
					}//if
				}//for loop
			}//orientation if stmnt

			//fill horizontal
			else if (Orientation.equals("h")){
				System.out.println("hi13");
				for(int j = X; j>X-shipL[i]; j--){
					System.out.println("hi12");
					if(j>-1 && j<8){
						System.out.println("hi09");
						if(playerTwoBoard[Y][j].equals("poo")){
							System.out.println("You suck");
						}
						else{
							System.out.println("hi10");
							playerTwoBoard[Y][j] = "poo";
						}
					}

				}
			}//orientation if statement
			//print out player 1 board
			System.out.println("hi11");
			for (int k = 0; k<playerTwoBoard.length; k++){
				for (int j = 0; j<playerTwoBoard[k].length; j++){
					System.out.print(playerTwoBoard[k][j]);
				}
				System.out.println();
			}
		}//end of player 2 setup for loop



	}//end of setUp

	public static void hitOrMiss(){//game play
		boolean notWon = true;
		while(notWon == true){
			int whosTurn = 0;//1 is npc and 0 is rpc
			if (whosTurn == 0){
				System.out.println("Player 1 guess a location x and y");
				//take in player guess
				Scanner guess = new Scanner(System.in);
				int Xguess = guess.nextInt();
				int Yguess = guess.nextInt();
				//make sure guess is allowed
				if (Xguess > 8 || Xguess < 0 || Yguess > 8 || Yguess < 0){
					System.out.println("You suck");
				}
				else{
					playerOneTopBoard[Yguess][Xguess] = "boo";
					//print top board with player guess
					for (int i = 0; i<playerOneTopBoard.length; i++){
						for (int j = 0; j<playerOneTopBoard[i].length; j++){
							System.out.print(playerOneTopBoard[i][j]);
						}
						System.out.println();
					}//end of print board
					//check if the coordinate hit or missed
					if (playerTwoBoard[Yguess][Xguess].equals("poo")){
						System.out.println("Hit");
						playerTwoBoard[Yguess][Xguess].equals("*  ");
					}
					else{
						System.out.println("Miss");
					}
				}//else in bounds 

				//change the turn
				whosTurn = 1;
			}//end of whosTurn if statement
			//if it is player 2's turn
			else{
				System.out.println("Player 2 guess a location x and y");
				//take in player guess
				Scanner guess = new Scanner(System.in);
				int Xguess = guess.nextInt();
				int Yguess = guess.nextInt();
				//make sure guess is allowed
				if (Xguess > 8 || Xguess < 0 || Yguess > 8 || Yguess < 0){
					System.out.println("You suck");
				}
				else{
					playerTwoTopBoard[Yguess][Xguess] = "boo";
					//print top board with player guess
					for (int i = 0; i<playerTwoTopBoard.length; i++){
						for (int j = 0; j<playerTwoTopBoard[i].length; j++){
							System.out.print(playerTwoTopBoard[i][j]);
						}
						System.out.println();
					}//end of print board
					//check if the coordinate hit or missed
					if (playerOneBoard[Yguess][Xguess].equals("poo")){
						System.out.println("Hit");
						playerOneBoard[Yguess][Xguess].equals("*  ");
					}
					else{
						System.out.println("Miss");
					}
				}//else in bounds 

				//change the turn
				whosTurn = 0;
			}//end of whosTurn if statement



			//Win conditions
			int beepOne = 0;
			int beepTwo = 0;
			//check if player two won
			for(int i = 0; i<playerOneBoard.length; i++){
				for(int j = 0; j<playerOneBoard[i].length; j++){
					if (playerOneBoard[i][j].equals("poo")){
						continue;
					}
					else if (playerOneBoard[i][j].equals("*  ")){
						beepOne += 1;
					}
				}//for loop
			}//for loop

			//check if player one won
			for(int i = 0; i<playerTwoBoard.length; i++){
				for(int j = 0; j<playerTwoBoard[i].length; j++){
					if (playerTwoBoard[i][j].equals("poo")){
						continue;
					}
					else if (playerTwoBoard[i][j].equals("*  ")){
						beepTwo += 1;
					}
				}//for loop
			}//for loop

			if (beepOne == 64){
				notWon = false;
				System.out.println("Player two won");
			}
			else if(beepTwo == 64){
				notWon = false;
				System.out.println("Player one won");
			}
		}//while loop

		if (notWon == false){
			System.out.println("Game Over");
		}
	}//end of hitOrMiss class

	public static void main(String[] args){
		setUp();
		hitOrMiss();

	}
}

