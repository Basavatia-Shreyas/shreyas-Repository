
public class insertionSort {

	public static int[] insertionSorts(int[] a){
		int[] array = new int[a.length];
		array[0] = a[0];
		for(int i = 1; i<a.length; i++){
			for(int j = i;j>0 && array[j-1] > a[i]; j--){
				
			}
			if(a[i] >= array[i-1]){
				array[i] = a[i];
			}
			else{
				int x = array[i -1];
				array[i-1] = array[i];
				array[i-1] = x;
			}
			
		}
		return array;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] test = new int[100];
		for(int i = 100; i>0; i--){
			test[i] = i;
		}
		test = insertionSorts(test);
		for (int i : test){
			System.out.print(i + " ");
		}
		
		
	}

}
