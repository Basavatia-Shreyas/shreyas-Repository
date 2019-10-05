
public class shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println("triangle one");
		for (int i = 0; i < n; i++){
			for(int j = 0; j < i; j++){
				 System.out.print("* ");
			}
			System.out.println(" ");
		}
		System.out.println("triangle two");
		for (int i = 0; i < n; i++){
			for(int j = 0; j < i; j++){
				 System.out.print("* ");
			}
			System.out.println(" ");
		}
		System.out.println("triangle three");
		for (int i = n; i > 0; i--){
			for(int j = 0; j < i; j++){
				 System.out.print("* ");
			}
			System.out.println(" ");
		}
		System.out.println();
		System.out.println("= triangle");
		for (int i = n; i > 0; i--){
			for(int j = 0; j < i; j++){
				 System.out.print(" ");
			
				
			}
			for(int k = n; k > i; k--){
				System.out.print(" *");
			}
			System.out.println();
			
		}
		System.out.println("Diamond");
		for (int i = n; i > 0; i--){
			for(int j = 0; j < i; j++){
				 System.out.print(" ");
			
				
			}
			for(int k = n; k > i; k--){
				System.out.print(" *");
			}
			System.out.println();
			
		}
		for (int i = n; i > 0; i--){
			for(int j = n; j > i; j--){
				 System.out.print(" ");
			
				
			}
			for(int k = 0; k < i; k++){
				System.out.print(" *");
			}
			System.out.println();
			
	}
		
		System.out.println();
		System.out.println("Hollow Diamond");
		for (int i = n; i > 0; i--){
			for(int j = 0; j < i; j++){
				 System.out.print(" ");
			
				
			}
			for(int k = n; k > i; k--){
				System.out.print("*");
			
			for(int l = 4; l > i; l--){
				System.out.print(" ");
			}
			}
			System.out.println();
			
		}
		for (int i = n; i > 0; i--){
			for(int j = n; j > i; j--){
				 System.out.print(" ");
			
				
			}
			for(int k = 0; k < i; k++){
				System.out.print("* ");
			}
			System.out.println();
			
	}
		System.out.println("Hollow Diamond");
		System.out.println("     *      ");
		System.out.println("    * *  ");
		System.out.println("   *   *");
		System.out.println("  *     *");
		System.out.println(" *       *");
		System.out.println("  *     *");
		System.out.println("   *   *");
		System.out.println("    * *");
		System.out.println("     *");
		
		System.out.println("Hollow Diamond");
		for (int i = n; i > 0; i--){
			for(int j = 0; j < i; j++){
				 System.out.print(" ");
			}
			System.out.print("*");
			for(int k = n ; k > i; k--){
					 System.out.print("  ");
				
					
			}
				
			
			System.out.println("*");
			
			
		}
		
		for (int i = n; i > 0; i--){
			for(int j = n; j > i; j--){
				 System.out.print(" ");
			
				
			}
			System.out.print("*");
			for(int j = 0; j < i; j++){
				 System.out.print("  ");
			}
			System.out.println("*");
			
			
	}
		
	}
}
