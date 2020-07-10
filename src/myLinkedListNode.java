
public class myLinkedListNode {
	private Object value;
	private myLinkedListNode Next;
	
	
	public Object getValue() {
		return value;
	}
	public myLinkedListNode getNext() {
		return Next;
	}
	
	public void setNext(myLinkedListNode a) {
		this.Next = a;
	}
	public boolean hasNext() {
		if(Next != null) {
			return true;
		}
		return false;
	}
	
	public myLinkedListNode(Object value, myLinkedListNode Next){
		this.Next = Next;
		this.value = value;
	}

}
