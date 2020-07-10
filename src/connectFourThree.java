import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class connectFourThree extends JFrame implements ActionListener  {
	static String whosTurn = "R  ";
	static boolean gameWon = false;
	static String[][] grid = new String[6][7];
	static Button[][] d = new Button[6][7];
	
	public static void main(String[] args) {
		JFrame a = new JFrame();
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(6, 7));
		a.setSize(600, 700);
		
		for (int i = 0; i < grid.length ; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = "*";
				d[i][j] = new Button();
				d[i][j].addActionListener(new connectFourThree());
				d[i][j].setActionCommand(""+j);
				
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
		int r = Integer.parseInt(q);
		int A = 5;
		while (A >= 0){
			if (grid[A][r] != "*"){
				A -= 1;
			}
			else{
				break;
				
			}
		}
		
		grid[A][r] = whosTurn;
		
		if (whosTurn == "R  "){
			whosTurn = "Y  ";
		}
		else if (whosTurn == "Y  "){
			whosTurn = "R  ";
		}
		winConditions();
		update();
		
	}
	
	public void winConditions() {
		// win conditions
		
		//horizontal
		int n = 0;
		for(int i = 5; i >= 0; i--){
			for (int j = 0; j<4; j++){
				if (grid[i][j] == "*" || grid[i][j+1] == "*" || grid[i][j+2] == "*" || grid[i][j+3] == "*"){
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
				if (grid[i][j] == "*" || grid[i-1][j] == "*" || grid[i-2][j] == "*" || grid[i-3][j] == "*"){
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
			if (grid[j][i] != "*"){
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
		
		if (gameWon == true) {
			System.exit(1);
		}

	}
	
	public void update() {
		for (int i = 0; i<grid.length; i++){
			for (int j = 0; j<grid[i].length; j++){
				if (grid[i][j] != "*") {
					d[i][j].setLabel(grid[i][j]);
				}
			}
		}
	}

}
