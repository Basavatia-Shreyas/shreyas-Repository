import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class myLinkedList implements List{
	private myLinkedListNode something;
	private int size = 0;
	
	public myLinkedList() {
		something = null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		myLinkedListNode temp = something;
		for(int i = 0; i<size;i++) {
			temp = temp.getNext();
			if (temp.getValue().equals(o)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		myLinkedListNode temp = something;
		Object list[] = new Object[size];
		for(int i = 0; i<size;i++) {
			list[i] = temp.getValue();
			temp = temp.getNext();
			if(temp == null) {
				return list;
			}
		}
		return list;
	}

	@Override
	public Object[] toArray(Object[] a) {
		
		return null;
	}

	@Override
	public boolean add(Object e) {
		size += 1;
		if (something == null) {
			something = new myLinkedListNode(e,null);
			return true;
		}
		myLinkedListNode temp = new myLinkedListNode(e,something);
		something = temp;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		myLinkedListNode temp = something;
		myLinkedListNode tempNext = temp.getNext();
		for(int i = 0; i<size;i++) {
			if (tempNext == null) {
				break;
			}
			if (tempNext.getValue().equals(o)) {
				temp.setNext(tempNext.getNext());
				size --;
				return true;
			}
			temp = tempNext;
			tempNext = temp.getNext();
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		something = null;
		size = 0;
	}

	@Override
	public Object get(int index) {
		myLinkedListNode temp = something;
		for(int i = 0; i<index;i++) {
			temp = temp.getNext();
			if(temp == null) {
				return null;
			}
		}
		return temp.getValue();		
		

	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(int index) {
		myLinkedListNode temp = something;
		myLinkedListNode tempNext = temp.getNext();
		for(int i = 0; i<index-1;i++) {
			if(temp == null) {
				return null;
			}
			if (tempNext == null) {
				break;
			}
			
			temp = tempNext;
			tempNext = temp.getNext();
		}
			temp.setNext(tempNext.getNext());
			size --;
			return tempNext.getValue();
	}

	@Override
	public int indexOf(Object o) {
		myLinkedListNode temp = something;
		for(int i = 0; i<size;i++) {
			temp = temp.getNext();
			if (temp.getValue().equals(o)) {
				return i;
			}

		}
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		myLinkedList hello = new myLinkedList();
		hello.add(5);
		hello.add("hello");
		hello.add(true);
		hello.add(14);
		hello.add("bye");
		System.out.println(Arrays.toString(hello.toArray()));
		System.out.println(hello.remove("hello"));
		System.out.println(hello.remove(2));
		System.out.println(Arrays.toString(hello.toArray()));
		
	}

}
