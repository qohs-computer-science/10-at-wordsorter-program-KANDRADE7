//Katherine Andrade, 10/9/25, wordsorter program
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class WordSorter 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); 
		try
		{
			in = new Scanner(new File("article.txt"));	
		}
		catch(Exception e)
		{
			System.out.println("Cannot find file... Exiting Program");
			return;
		}	
		String word = "";

		//maybe 
		//create hybrid structure - ArrayList of ArrayLists. 
		// parent arrayList will hold 26 spots (a-z)
		//use for organizing 

		/*
		 * ArrayList<ArrayList<String>> words = new ArrayList<>();
		for(int x = 0; x< 26; x++){
			words.add(new ArrayList<String>());
		}//end for loop
		 */
		

		//stores ALL words
		ArrayList<String> storage = new ArrayList<String>();

		//cleaning data
		while(in.hasNext())
		{
			word = in.next();
			word = word.replace(",", "");
			word = word.replace("(tm)", "");
			word = word.replace(")", "");
			word = word.replace("(", "");
			word = word.replace(".", "");
			word = word.replace("'s", "");
			word = word.replace(":", "");
			word = word.replace("!", "");
			word = word.replace("?", "");
			word = word.replace("'", "");
			word.toLowerCase();
			storage.add(word);
		}//end while loop

		// all the lowercase 
		for(int i=0; i<storage.size(); i++){
			storage.set(i, storage.get(i).toLowerCase());
			System.out.println(storage.get(i));
		}//end for loop 

		//removing duplicates 
		for(int a=0; a< storage.size(); a++){
			String currentWord = storage.get(a);
			String nextWord = storage.get(a+1);
			if(currentWord.compareTo(nextWord)){

			}//end if 
		}//end for loop



		//my notes:
		// go one by one. start with searching for letters that start with the letter a 
		// and add them to the first arrayLisyt
		
		

		String letters = "abcdefghijklmnopqrstuvwxyz";
		int position = 0;
		for(int k=0; k<storage.size(); k++){
			char current = letters.charAt(k);
			String currentString = storage.get(k);
			if(currentString.substring(k,k+1).equals(current)){
				words.get(position).add(currentString);
			}//end if
		}//end for loop

		//printing 
		for(int h=0; h< words.size(); h++){
			
		}//end loop
		
		/*
		 * for(ArrayList<String> temp : words){
			for(String val : temp){
				System.out.println(temp.charAt());
			}//end inner loop
		}//end outer loop
		 */
		
		System.out.println("Menu:");
		System.out.println("\nInput the number of the option of the action you want:");
		System.out.println("\n1. Print out all words starting with a specific letter");
		System.out.println("\n2. Print out all words");
		System.out.println("\n3. Print out total number of unique words");
		System.out.println("\n4. Search for a word");
		System.out.println("\n5. Remove a word");
		System.out.println("\n6. Exit");



	}//end main
}//end class