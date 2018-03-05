package uppgifter;

import java.util.Scanner;

public class lektionuppgift {
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	for (int i = 0; i < 5; i++) { 
	int tal = sc.nextInt();
	
	System.out.println(tal*tal*2*3.14);
	
	System.out.println(tal*2*3.14);
	
	System.out.println(tal*tal*tal*3.14*1.33);
	}
}
}
