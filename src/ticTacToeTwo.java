import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;

public class ticTacToeTwo extends JFrame implements ActionListener {
	static int n = 3;
	static String[][] list = new String[n][n];
	static String whosTurn = "X";
	static Button[][] d = new Button[3][3];

	public static void main(String[] args) {
		JFrame a = new JFrame();
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3, 3));
		a.setSize(900, 900);

		

		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				list[i][j] = "*";
				d[i][j] = new Button();
				d[i][j].addActionListener(new ticTacToeTwo());
				d[i][j].setActionCommand(i + " " + j);
				p.add(d[i][j]);
			}
		}

		a.add(p);
		a.setVisible(true);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		String q = e.getActionCommand();
		winConditions(q);
		update();
	}

	public void winConditions(String q) {
		int playerTurnX = Integer.parseInt(q.substring(0,1));
		int playerTurnY = Integer.parseInt(q.substring(2));


		if (list[playerTurnX][playerTurnY] != "*"){
			System.out.println("Sorry that place is already taken!!");
		}
		else{
			list[playerTurnX][playerTurnY] = whosTurn;


			if (list[0][0] == "X" && list[0][1]== "X" && list[0][2] == "X"){
				System.out.println("Player 1 wins");
				System.exit(1);

			}
			else if (list[1][0] == "X" && list[1][1]== "X" && list[1][2] == "X"){
				System.out.println("Player 1 wins");
				System.exit(1);
			}
			else if (list[2][0] == "X" && list[2][1]== "X" && list[2][2] == "X"){
				System.out.println("Player 1 wins");
				System.exit(1);			
			}
			else if (list[0][0] == "O" && list[0][1]== "O" && list[0][2] == "O"){
				System.out.println("Player 2 wins");
				System.exit(1);
			}
			else if (list[1][0] == "O" && list[1][1]== "O" && list[1][2] == "O"){
				System.out.println("Player 2 wins");
				System.exit(1);
			}
			else if (list[2][0] == "O" && list[2][1]== "O" && list[2][2] == "O"){
				System.out.println("Player 2 wins");
				System.exit(1);
			}
			else if (list[0][0] == "X" && list[1][0]== "X" && list[2][0] == "X"){
				System.out.println("Player 1 wins");
				System.exit(1);
			}
			else if (list[0][1] == "X" && list[1][1]== "X" && list[2][1] == "X"){
				System.out.println("Player 1 wins");
				System.exit(1);
			}
			else if (list[0][2] == "X" && list[1][2]== "X" && list[2][2] == "X"){
				System.out.println("Player 1 wins");
				System.exit(1);
			}
			else if (list[0][0] == "O" && list[1][0]== "O" && list[2][0] == "O"){
				System.out.println("Player 2 wins");
				System.exit(1);
			}
			else if (list[0][1] == "O" && list[1][1]== "O" && list[2][1] == "O"){
				System.out.println("Player 2 wins");
				System.exit(1);
			}
			else if (list[0][2] == "O" && list[1][2]== "O" && list[2][2] == "O"){
				System.out.println("Player 2 wins");
				System.exit(1);
			}
			else if (list[0][0] == "X" && list[1][1]== "X" && list[2][2] == "X"){
				System.out.println("Player 1 wins");
				System.exit(1);
			}
			else if (list[2][0] == "X" && list[1][1]== "X" && list[0][2] == "X"){
				System.out.println("Player 1 wins");
				System.exit(1);
			}
			else if (list[0][0] == "O" && list[1][1]== "O" && list[2][2] == "O"){
				System.out.println("Player 2 wins");
				System.exit(1);
			}
			else if (list[2][0] == "O" && list[1][1]== "O" && list[0][2] == "O"){
				System.out.println("Player 2 wins");
				System.exit(1);
			}

			if (whosTurn == "X"){
				whosTurn = "O";
			}
			else if (whosTurn == "O"){
				whosTurn = "X";
			}
		}

	}
	
	public void update() {
		for (int i = n-1; i>=0; i--){
			for (int j = n-1; j>=0; j--){
				if (list[i][j] != "*") {
					d[i][j].setLabel(list[i][j]);
				}
			}
		}
	}
}
