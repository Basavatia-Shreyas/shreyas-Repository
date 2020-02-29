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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100];
		for(int i = 100; i>0; i--){
			arr[100-i] = i;
		}
		arr = selectionSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
	}

}
