
public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		objects a = new objects(3);
		System.out.println(a.getSize());
		
		objects b = new objects(4);
		System.out.println(b.getSize());
		
		square c = new square(10);
		System.out.println(c.area());
		
		Card testCard = new Card(4, "Hearts");
		System.out.println(testCard);
		
		Deck testDeck = new Deck();
		
		testDeck.shuffle();
		System.out.println(testDeck.pop());
		System.out.println(testDeck.pop());
		System.out.println(testDeck.pop());
		System.out.println(testDeck.pop());
		System.out.println(testDeck.pop());
		
	}

}
