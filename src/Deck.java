import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private int size;
	private ArrayList <Card> stuff;//<Card>only holds Card
	public Deck() {//create deck
		stuff = new ArrayList();
		for(int i =2; i<= 14; i++) {
			stuff.add(new Card(i, "Hearts"));
		}
		for(int i =2; i<= 14; i++) {
			stuff.add(new Card(i, "Clubs"));
		}
		for(int i =2; i<= 14; i++) {
			stuff.add(new Card(i, "Spades"));
		}
		for(int i =2; i<= 14; i++) {
			stuff.add(new Card(i, "Diamonds"));
		}
		size = 52;
		
	}
	
	public int getSize() {
		return size;
	}
	
	public Card pop() {
		Card card = stuff.get(size-1);
		stuff.remove(size-1);
		size -= 1;
		return card;
	}
	
	public void shuffle(){
		Random a = new Random();
		for(int i = 1000; i>=0; i--) {
			int b = a.nextInt(52);
			int c = a.nextInt(52);
			Card d = stuff.get(b);
			stuff.set(b, stuff.get(c));
			stuff.set(c, d);
			
			
		}
		
		
	}
}
