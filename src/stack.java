
public class stack {
	private myLinkedListNode something;
	private int size = 0;
	
	public void push(Object a) {
		if (something ==null) {
			something = new myLinkedListNode(a, null);
			return;
		}
		myLinkedListNode temp = new myLinkedListNode(a,something);
		something = temp;
	}
	public Object pop() {
		if(something == null) {
			return null;
		}
		Object temp = something.getValue();
		something=something.getNext();
		return temp;
		
	}
	public Object poll() {
		if(something == null) {
			return null;
		}
		Object temp = something.getValue();
		return temp;
		
	}
	
	public static void main(String args[]) {
		stack myStack = new stack();
		myStack.push("hello");
		myStack.push("hola");
		myStack.push("hello world");
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.poll());
	}
}
