import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int [8];
		for(int i= 0; i<=7; i++){
			array[i] = i;
		}
		
		Scanner x = new Scanner(System.in);
		int num = x.nextInt();
		boolean there = true;
		boolean found = false;
		int bottomIndex = 0;
		int topIndex = 7;
		while(found == false && there == true){
			int middle = topIndex + bottomIndex;
			middle = middle/2;
			if (middle == num){
				System.out.println(middle);
				found = true;
			}
			else if (middle > num){
				topIndex = middle -1;
			}
			else if (bottomIndex > topIndex){
				there = false;
			}
			else{
				bottomIndex = middle + 1;
			}
				
		}
		if(num > topIndex || num < bottomIndex){
			System.out.println("-1");
		}
		
	}

}
