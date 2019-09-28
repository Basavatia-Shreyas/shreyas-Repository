import java.util.Scanner;

public class forLoops {
	public static void main(String[] args){
		System.out.println("How many items do you want in your shopping list?");
		Scanner numItems = new Scanner(System.in);
		int numOfItems = numItems.nextInt();
		String[] list = new String[numOfItems];
		
		for (int i = numOfItems; i>0; i--){
			System.out.println("What do you want on the list?");
			Scanner items = new Scanner(System.in);
			String itemsOnList = items.next();
			list[i-1] = itemsOnList;
		}
		
		
		while(true){
			System.out.println("What do you want to do with your list?");
			System.out.println("1 for remove, 2 for print out the list, 3 for replace");
			Scanner whatToDo = new Scanner(System.in);
			int whatYouWant = whatToDo.nextInt();
			if (whatYouWant == 1){
				System.out.println("What do you want remove?");
				Scanner whatToRemove = new Scanner(System.in);
				String whatUWantToRemove = whatToRemove.next();
				for (int i=numOfItems; i>0; i--){
					if (list[i-1].equals(whatUWantToRemove) ){
						list[i-1] = "nothing";
					}
				}
			}
			else if (whatYouWant == 2){
				for (int i =0; i<list.length; i++){
					System.out.println(list[i]);
				}
			}
			else if (whatYouWant == 3){
				System.out.println("What do you want to replace?");
				Scanner whatToReplace = new Scanner(System.in);
				String whatUWantToReplace = whatToReplace.next();
				System.out.println("What do you want to raplace it with?");
				Scanner withWhat = new Scanner(System.in);
				String conQue = withWhat.next();
				for (int i = numOfItems; i>0; i--){
					if (list[i-1].equals(whatUWantToReplace) ){
						list[i-1] = conQue;
					}
				}
			}
		}
		
		

	}
}
