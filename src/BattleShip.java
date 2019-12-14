import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.lang.Runtime;
import java.lang.reflect.Array;



public class BattleShip{
	public static void beeper() throws IOException{
		
		try{
			String[] args = new String[] {"shreyas b/beep"};
			new ProcessBuilder(args).start();
			//Runtime.getRuntime().exec("/bin/bash -c ./beep");
			//Runtime.getRuntime().exec(" /beeper.sh");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	static String[][] playerOneBoard = new String[8][8];
	static String[][] playerTwoBoard = new String[8][8];
	static String[][] playerOneTopBoard = new String[8][8];
	static String[][] playerTwoTopBoard = new String[8][8];
	public static void setUp() throws IOException{
		boolean youGetAPiece = true;
		//create lists

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
				beeper();
				continue;
			}
			//Check if taken and fill in if not
			String Orientation = x.next();
			if (Orientation.equals("v")){
				for(int j = Y; j>Y-shipL[i-1]; j--){
					if(j>-1 && j<8){
						if (playerOneBoard[j][X] != "*  " || playerOneBoard[j][X].equals("poo")){
							System.out.print("Sorry that place is already taken ");
							beeper();
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
							beeper();
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
							beeper();
						}
						if(playerOneBoard[j][X].equals("poo")){
							System.out.println("You suck");
							beeper();
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
							beeper();
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








			boolean youGetAPieceTwo = true;
			//Process run = Runtime.getRuntime().exec("cmd.exe", "/c", "Start", new File(beep.c));
			//Print Board
			for (int itwo = 0; itwo<playerTwoTopBoard.length; itwo++){
				for (int j = 0; j<playerTwoTopBoard[i].length; j++){
					System.out.print(playerTwoTopBoard[i][j]);
				}
				System.out.println();

			}
			//setup the game boards(Fill with ships)
			System.out.println("Player Two Setup");
			System.out.println("Where do you want start point of the thing and Horizontal(h) or Vertical(v)");
			for(int itwo = 5; itwo>-1; itwo--){
				Scanner xtwo = new Scanner(System.in);
				int XTwo = xtwo.nextInt();
				int YTwo = xtwo.nextInt();
				//Check if valid
				if (XTwo > 8 || XTwo < 0 || YTwo > 8 || YTwo < 0){
					System.out.println("You suck");
					continue;
				}
				//Check if taken and fill in if not
				String OrientationTwo = x.next();
				if (OrientationTwo.equals("v")){
					for(int j = YTwo; j>YTwo-shipL[i-1]; j--){
						if(j>-1 && j<8){
							if (playerTwoBoard[j][XTwo] != "*  " || playerTwoBoard[j][XTwo].equals("poo")){
								System.out.print("Sorry that place is already taken ");
								youGetAPieceTwo = false;
							}
							else{
								continue;
							}
						}

					}
				}
				else if (OrientationTwo.equals("h")){
					for(int j = XTwo; j>XTwo-shipL[i-1]; j--){
						if(j>-1 && j<8){
							if (playerTwoBoard[YTwo][j] != "*  " || playerTwoBoard[j][XTwo].equals("poo")){
								System.out.print("Sorry that place is already taken ");
								youGetAPieceTwo = false;
							}
							else{
								continue;
							}
						}

					}
				}
				//fill 
				if (OrientationTwo.equals("v")){
					for(int j = YTwo; j>YTwo-shipL[i-1]; j--){
						if(j>-1 && j<8){
							if (youGetAPieceTwo == false){
								System.out.println("You suck");
							}
							if(playerTwoBoard[j][XTwo].equals("poo")){
								System.out.println("You suck");
							}
							else{
								playerTwoBoard[j][XTwo] = "poo";
							}
						}

					}
				}
				else if (OrientationTwo.equals("h")){
					for(int j = XTwo; j>XTwo-shipL[i-1]; j--){
						if(j>-1 && j<8){
							if(playerTwoBoard[YTwo][j].equals("poo")){
								System.out.println("You suck");
							}
							else{
								playerTwoBoard[YTwo][j] = "poo";
							}
						}

					}
				}
				// print filled in board
				for (int k = 0; k<playerTwoBoard.length; k++){
					for (int j = 0; j<playerTwoBoard[k].length; j++){
						System.out.print(playerTwoBoard[k][j]);
					}
					System.out.println();

				}

			}
		}

	}
	public static void main(String[] args) throws IOException{
		//setup
		beeper();
		setUp();

		//game loop
		String whosTurn = "Player one";
		System.out.println("Enter a coordinate");
		Scanner x = new Scanner(System.in);
		int X = x.nextInt();
		int Y = x.nextInt();
		//Check if valid
		if (X > 8 || X < 0 || Y > 8 || Y < 0){
			System.out.println("You suck");
		}
		//if (whosTurn == "Player one"){
		
		//}

		//win conditions
		int y = 0;
		int z = 0;
		for (;z<8; z++ ){
			for(;y<8; y++){
				if(playerOneBoard[y][z] == "*  "){
					System.out.println("OK");
				}
				else{
					System.out.println("You suck");
					continue;
				}
			}
		}
		for (;z<8; z++){
			for(;y<8; y++){
				if(playerTwoBoard[y][z] == "*  "){
					System.out.println("OK");
				}
				else{
					System.out.println("You suck");
					continue;
				}
			}
		}
	}
}
