import java.util.ArrayList;

public class war {
	static private ArrayList <Card> playerOneDeck = new ArrayList<>();
	static private ArrayList <Card> playerTwoDeck = new ArrayList<>();
	static Deck fullDeck = new Deck();
	
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
		ArrayList <Card> warDeck = new ArrayList();
		for(int i = 0; i<=3;i++) {
			Card c = playerOneDeck.remove(playerOneDeck.size() -1);
			warDeck.add(0, c);
			Card d = playerTwoDeck.remove(playerTwoDeck.size() -1);
			warDeck.add(0, d);
		}
		
		
	}
	
	public static void playGame() {
		while(true) {
			Card a = playerOneDeck.remove(playerOneDeck.size() -1);
			Card b = playerTwoDeck.remove(playerTwoDeck.size() -1);
			
			if (a.getValue() > b.getValue()){
				playerOneDeck.add(0, a);
				playerOneDeck.add(0, b);
			}
			else if (a.getValue() < b.getValue()){
				playerTwoDeck.add(0, a);
				playerTwoDeck.add(0, b);
			}
			else {
				
			}
		}
		
	}
	
	
	public static void main(String args[]){
		deal();
	}
	
}
