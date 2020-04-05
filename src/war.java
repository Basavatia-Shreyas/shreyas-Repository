import java.util.ArrayList;

public class war {
	static private ArrayList <Card> playerOneDeck = new ArrayList<>();
	static private ArrayList <Card> playerTwoDeck = new ArrayList<>();
	static Deck fullDeck = new Deck();
	static ArrayList <Card> warDeck = new ArrayList();
	static String whoWonWar = "";
	
	public static void deal() {
		fullDeck.shuffle();
		for(int i = 0; i<=25; i++) {
			Card a = fullDeck.pop();
			System.out.println(a);
			playerOneDeck.add(a);
		}
		for(int i = 0; i<=25; i++) {
			Card a = fullDeck.pop();
			System.out.println(a);
			playerTwoDeck.add(a);
		}
	}
	public static void war() {
		Card e = playerOneDeck.remove(playerOneDeck.size() -1);
		warDeck.add(0, e);
		Card f = playerTwoDeck.remove(playerTwoDeck.size() -1);
		warDeck.add(0, f);
		if(playerOneDeck.size() < 4 ) {
			for(int i = 0; i<3;i++) {
				Card d = playerTwoDeck.remove(playerTwoDeck.size() -1);
				warDeck.add(0, d);
			}
			int g = playerOneDeck.size();
			for(int i = 0; i<g;i++) {
				Card d = playerOneDeck.remove(playerOneDeck.size() -1);
				warDeck.add(0, d);
			}
		}
		else if(playerTwoDeck.size() < 4) {
			for(int i = 0; i<3;i++) {
				Card c = playerOneDeck.remove(playerOneDeck.size() -1);
				warDeck.add(0, c);
			}
			int g = playerTwoDeck.size();
			for(int i = 0; i<g; i++) {
				Card d = playerTwoDeck.remove(playerTwoDeck.size()-1);
				warDeck.add(0, d);
			}	
		}
		else {
			for(int i = 0; i<3;i++) {
				Card c = playerOneDeck.remove(playerOneDeck.size() -1);
				warDeck.add(0, c);
				Card d = playerTwoDeck.remove(playerTwoDeck.size() -1);
				warDeck.add(0, d);
			}
			
		}
		System.out.println("War!!");
		System.out.println("Player One's Card is " + e + "Player Two's Card is " + f);
		if (e.getValue() > f.getValue()) {
			playerOneDeck.addAll(warDeck);
			whoWonWar = "Player 1";
		
		}
		else if (e.getValue() == f.getValue()) {
			war();
		}
		else {
			playerTwoDeck.addAll(warDeck);
			whoWonWar = "Player 2";
		}	
	}
	
	public static void playGame() {
		while(playerOneDeck.size() >0 && playerTwoDeck.size() >0) {
			System.out.println(playerOneDeck.size());
			System.out.println(playerTwoDeck.size());
			Card a = playerOneDeck.remove(playerOneDeck.size() -1);
			Card b = playerTwoDeck.remove(playerTwoDeck.size() -1);
			System.out.println("Player One's Card is " + a + "Player Two's Card is " + b);
			
			if (a.getValue() > b.getValue()){
				playerOneDeck.add(0, a);
				playerOneDeck.add(0, b);
			}
			else if (a.getValue() < b.getValue()){
				playerTwoDeck.add(0, a);
				playerTwoDeck.add(0, b);
			}
			else {
				war();
				warDeck.clear();
				if (whoWonWar.equals("Player 1")) {
					playerOneDeck.add(0,a);
					playerOneDeck.add(0,b);
				}
				else if (whoWonWar.contentEquals("Player 2")){
					playerTwoDeck.add(0,a);
					playerTwoDeck.add(0,b);
				}
			}
		}
		
		if(playerOneDeck.size() == 0) {
			System.out.println("Player 2 wins");
		}
		else {
			System.out.println("Player 1 wins");
		}
		
	}
	
	
	public static void main(String args[]){
		deal();
		playGame();
	}
	
}
