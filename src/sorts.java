import java.util.ArrayList;
import java.util.Collections;

public class sorts {
	
	public static int[] bubbleSort(int[] a){
		int count = 0;
		for(int i = 0; i <a.length; i++){
			for(int j = 0; j < a.length-1; j++){
				if (a[j] > a[j+1]){
					int e = a[j];
					a[j] = a[j+1];
					a[j+1] = e;
					
				}
				count+= 1;
			}
		}//end of for loops
		
		System.out.println(count);
		return a;
	}
	
	public static int[] selectionSort(int[] a){
		for(int i = 0; i < a.length; i++){
			int index = i;
			
			for(int j = i; j < a.length; j++ ){
				if (a[index] > a[j]){

					index = j;
				
				}
			}
			int temp = a[index];
			a[index] = a[i];
			a[i] = temp;
			
		}
		
		return a;
	}
	
	public static ArrayList <Integer> quickSort(ArrayList<Integer> a){
		if(a.size() == 1 || a.size() == 0){
			return a;
		}
		if(a.size() == 2){
			if( a.get(0) > a.get(1)){
				a.set(1, a.set(0, a.get(1)));//swaps the values
			}
			return a;
		}
		
		
		int partition = a.size()/2;
		
		ArrayList <Integer> left = new ArrayList();
		ArrayList <Integer> right = new ArrayList();
		
		for(Integer i : a){
			if(i.intValue() >= a.get(partition).intValue()){
				right.add(i);
			}
			else{
				left.add(i);
			}
		}
		
		left = quickSort(left);
		right = quickSort(right);
		
		for(Integer i : right){
			left.add(i);
		}
		
		return left;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] arr = new int[100];
		for(int i = 100; i>0; i--){
			arr[100-i] = i;
		}*/
		//arr = selectionSort(arr);
		ArrayList<Integer> test = new ArrayList<>();
		
		for(int i = 100; i>0; i--){
			test.add(i);
		}
		
		test = quickSort(test);
		for (int i : test){
			System.out.print(i + " ");
		}
		
	}
	

}
