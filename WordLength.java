/*
 * Java Programming: Arrays, Lists, and Structured Data
 * Breaking the Caesar Cipher
 * Assignment 1: Word Length
 */

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class WordLength {
	
	//static method countWordLengths
	//It counts the lengths of each word in the file and store in array counts[]
	public static void countWordLengths  (String filepath, int [] counts) throws IOException {
		
		try (Scanner inputfile = new Scanner(new File(filepath))){
			Scanner line = null;
			while ( inputfile.hasNextLine() ) {
				line = new Scanner ( inputfile.nextLine() );
				while (line.hasNext()) {
					String word = line.next();
					char first = word.charAt(0);
					char last = word.charAt(word.length()-1);
					
					if( !Character.isLetter(first) && !Character.isLetter(last)) {
						if(!Character.isDigit(first)) //eliminate exception (e.g. a single digit "1")
							counts[word.length()-2]++;
					} else if (Character.isLetter(first) && !Character.isLetter(last)) {
						counts[word.length()-1]++;
					} else if (!Character.isLetter(first) && Character.isLetter(last)) {
						counts[word.length()-1]++;
					} else {
						counts[word.length()]++;
					}
				}	
			}
		}	
	}
	
	
	//static method indexOfMax finds the index of the max value in an unordered array of integers
	public static int indexOfMax (int [] values) {
		int maxIndex = 0;
		for (int i = 0; i < values.length; i++) 
			if (values[maxIndex] <= values[i])
				maxIndex = i;
		return maxIndex;
	}
	
	//main method for testing
	public static void main(String[] args) throws IOException{

		//Testing code here
	}

}
