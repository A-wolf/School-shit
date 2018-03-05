package uppgifter;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Encodedmessage_Joar_Lagerstedt {
	

    public static void main(String[] args) {
    	
    Scanner sc = new Scanner(new BufferedInputStream(System.in));
    
    System.out.println(" Spy inc decryption how many messages do you want decoded today?");
    
    int testCasesCount = Integer.parseInt(sc.nextLine());
    
    for (int t = 0; t < testCasesCount; t++) {
    	
    	
    	System.out.println("What is the message?");
    	
        System.out.println(decode(sc.nextLine()));
        
    }
    
    System.out.println("Thank you for using spy inc decryption");

}

private static String decode(String message) {
    return convert(rotateCounterClockwise(convert(message)));
    
}

private static char[][] convert(String message) {
	
    int n = (int) Math.sqrt(message.length());

    char[][] table = new char[n][n];
    for (int i = 0; i < message.length(); i++) {
    	
        table[i % n][i / n] = message.charAt(i);
        
    }
    return table;
}

private static String convert(char[][] table) {
	
    StringBuilder message = new StringBuilder();
    
    for (int j = 0; j < table.length; j++) {
    	
        for (int i = 0; i < table.length; i++) {
        	
            message.append(table[i][j]);
        }
    }
    
    return message.toString();
}

private static char[][] rotateCounterClockwise(char[][] table) {
	
    char[][] rotated = new char[table.length][table.length];
    
    for (int i = 0; i < table.length; i++) {
    	
        for (int j = 0; j < table[i].length; j++) {
        	
            rotated[j][table.length - 1 - i] = table[i][j];
        }
    }
    return rotated;
}

}