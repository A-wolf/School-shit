package uppgifter;
// Purpose: Decode a string by reversing and shifting its letters by a certain integer
// Preconditions: Number of shifts and string to decode
// Postconditions: Outputs decoded messages
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

 public class kattischeat {
	public static void main(String[] args) throws IOException {
		// Get input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line[] = reader.readLine().split(" ");
		
		// Store key and answers
		String[] key = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.".split("");
		ArrayList<String> answers = new ArrayList<String>();
		
		// Loop w/ sentinel logic
		while(Integer.parseInt(line[0]) != 0){
			// Reverse the string
			String message = new StringBuilder(line[1]).reverse().toString();
			String decoded =  "";
			
			// Traverse the string
			for(int i = 0; i < message.length(); i++){
				// Calculate indices
				int curr = Arrays.asList(key).indexOf("" + message.charAt(i));
				int adjusted = curr + Integer.parseInt(line[0]);
				
				// Account for out of bounds
				if(adjusted >= key.length){
					adjusted -= 28;
				}
				
				// Add to decoded message
				decoded += key[adjusted];
			} // end for loop
			
			// Add decoded to answers and read next line
			answers.add(decoded);
			line = reader.readLine().split(" ");
		} // end while loop
		
		// Output answers to the user
		for(int i = 0; i < answers.size(); i++){
		System.out.println(answers.get(i));
		} // end for loop
		
	} // end main
} // end class