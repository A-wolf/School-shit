package uppgifter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Reverserot_Joar_Lagerstedt {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line[] = reader.readLine().split(" ");
		
		String[] key = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.".split("");
		ArrayList<String> answers = new ArrayList<String>();
		
		while(Integer.parseInt(line[0]) != 0){

			String message = new StringBuilder(line[1]).reverse().toString();
			String decoded =  "";
			
			for(int i = 0; i < message.length(); i++){
 
				int curr = Arrays.asList(key).indexOf("" + message.charAt(i));
				int adjusted = curr + Integer.parseInt(line[0]);
				
				if(adjusted >= key.length){
					adjusted -= 28;
				}
			
				decoded += key[adjusted];
			}

			answers.add(decoded);
			line = reader.readLine().split(" ");
		}

		for(int i = 0; i < answers.size(); i++){
			System.out.println(answers.get(i));
		}
		
	} 
} 