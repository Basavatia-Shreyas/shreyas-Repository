
public class Arrays {
	public static void main(String[] args) {
		int numItems = 5;
		String[] list = new String[numItems];
		
		for(int i = numItems + 1; i>0; i--){
			//System.out.println(list[i]);
		}
		
		for (int i = 4; i > 0; i--){
			for(int j = 0; j < i; j++){
				 System.out.print(" ");
			}
			System.out.print("*");
			for(int k = 4; k > i; k--){
				System.out.print(" *");
			}

			for(int j = 4; j > i; j--){
				 System.out.print(" *");
			
				
			}
			for(int k = 0; k < i; k++){
				System.out.print(" *");
			}
			
			
			System.out.println();
		
			
		}	
		
		for (int i = 4; i > 0; i--){
			for(int j = 4; j > i; j--){
				 System.out.print(" ");
			
				
			}
			for(int k = 0; k < i; k++){
				System.out.print(" *");
			}
			for(int j = 4; j > i; j--){
				 System.out.print(" *");
			
			}
			for(int k = 0; k < i; k++){
				System.out.print(" *");
			}
			
		System.out.println();
		
			
		}	
		
		
			

		
	
		System.out.println("HEXAGON");
		System.out.println("    * * * * *");
		System.out.println("   *         *");
		System.out.println("  *           *");
		System.out.println(" *             *");
		System.out.println("*               *");
		System.out.println(" *             *");
		System.out.println("  *           *");
		System.out.println("   *         *");
		System.out.println("    * * * * *");
		
	
	
	}
}
