package moduletwo;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/*
 * Write a text analyzer that reads a file and outputs statistics about that file. 
 * It should output the word frequencies of all words in the file, sorted by the most frequently
 * used word. The output should be a set of pairs, each pair containing a word and how many times
 *  it occurred in the file.
 */

public class WordCounter {
	
		public static void main(String[] args) throws IOException {
			
				//program reads/scans text file 'PoePoem'
				FileReader PoeFile = new FileReader("PoePoem.txt");
				Scanner file = new Scanner(PoeFile);
				
				//creating an array list to collect both string and integer values 
				ArrayList<String> word = new ArrayList<String>();
				ArrayList<Integer> count = new ArrayList<Integer>();
	
				//Executes loop to gather info until all words counted
					while(file.hasNext()) {
						String nextChar = file.next();
		
						if(word.contains(nextChar)) {
							int index = word.indexOf(nextChar);
							count.set(index, count.get(index) +1);
													}
						else {
							word.add(nextChar);
							count.add(1);
				}
			}
				//closes file reader and scanner
				file.close();
				PoeFile.close();
						
				//for every same word, count +1
				for(int i = 0; i < word.size(); i++) {
					
				//Counts the number of times a word is used in the poem
				System.out.println("The word " + word.get(i) + " occurs " + count.get(i) + " time(s) in this poem");
		
		}
	}
}