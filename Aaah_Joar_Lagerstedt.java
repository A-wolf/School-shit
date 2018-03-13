package uppgifter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Aaah_Joar_Lagerstedt { 
	
	
		public static void main(String[] args) throws IOException {
			
			System.out.println("Say ah");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			
			int Jon = reader.readLine().length();
			
			System.out.println("Doctor needs you too say... ");
			
			int Doctor = reader.readLine().length();
			
			
			if(Doctor <= Jon){
				System.out.println("go");
			}
			else{
				System.out.println("no");
			}
			
		} 
	} 