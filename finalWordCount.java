package finalWordOccurences;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class wordCount {
	
	public static void main(String[] args) {
		
		//Using a HashMap to collect and store key value pairs
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
		
		try { 
				//program reads/scans text file 'PoePoem.txt'
				BufferedReader br = new BufferedReader(new FileReader("PoePoem.txt"));
				String str;
				
			//While string in reader is not null, split words for counter
			while ((str = br.readLine()) !=null) {
				String[] ws = str.split(" ");
		
		//Executes search to gather info until all words counted
		for(String w: ws) { 
			if(w.length() == 0) {
				continue;
			}
			
		Integer c = wordMap.get(w);
		
		if(c == null) {
			c = 1;
		} else {
			c++;
		}
		
		//Inserts mapping into HashMap
		wordMap.put(w, c);
				}
			}
		}
		catch(Exception e) {
			System.out.println(e);
	}

		//Creating array list occ to store collection of top 20 word occurences in PoePoem.txt
		ArrayList<Integer> occ = new ArrayList<Integer>();
		
		occ.addAll(wordMap.values());
		Collections.sort(occ, Collections.reverseOrder());
		int i = -1;
		
		for (Integer ii : occ.subList(0, 19)) {
			if (i == ii)
				continue;
			i = ii;
			
			for (String s : wordMap.keySet()) {
				
				if(wordMap.get(s) == i)
					
		//Displaying top 20 results
		System.out.println(s+" " + ii);
			}
		}
	}	
}