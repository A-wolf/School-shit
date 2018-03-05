package uppgifter;

import java.util.Scanner;

public class uppgift8 {

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	
	int summa = 0; 
	
	for (int i = 0; i < 5; i++) { int tal = sc.nextInt();
	summa += tal;
	
	}
	
	System.out.println(summa);
}


}
