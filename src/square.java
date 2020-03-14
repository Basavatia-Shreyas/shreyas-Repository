
public class square {
	private int length;
	public square(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int area() {
		return length * length;
	}
}
