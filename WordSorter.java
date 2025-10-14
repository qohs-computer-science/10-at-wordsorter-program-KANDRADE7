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
			storage.add(word);
		}//end while loop

		// turn all letters into lowercase 
		for(int i=0; i<storage.size(); i++){
			storage.set(i, storage.get(i).toLowerCase());
		}//end for loop 

		//sort alphabetically - selection sort
		for(int s=0; s< storage.size()-1; s++){
			int minIndex = s;
			for(int k= s+1; k< storage.size(); k++){
				if(storage.get(k).compareTo(storage.get(minIndex)) < 0){
					minIndex=k; 
				}//end if 
			}//end inner loop
			if(minIndex !=s){
				String temp = storage.get(s);
				storage.set(s, storage.get(minIndex));
				storage.set(minIndex, temp); 
			}//end if
		}//end outer loop/sort 

		//removing duplicates 
		for(int a=0; a< storage.size()-1; a++){
			String currentWord = storage.get(a);
			String nextWord = storage.get(a+1);
			if(currentWord.compareTo(nextWord)==0){
				storage.remove(a+1);
				a--;
			}//end if 
		}//end for loop

		for(String temp : storage){
			System.out.println(temp);
		}//for each loop
		


		//my notes:
		// go one by one. start with searching for letters that start with the letter a 
		// and add them to the first arrayLisyt
		
		/*
		 * String letters = "abcdefghijklmnopqrstuvwxyz";
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
		
		 */
		
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

		//option 1 - print all words starting with a specific letter

		//option 2 - print all words

		//option 3 - print out total number of unique words

		//option 4 - search for a word ...use scanner

		//option 5 - remove a word 

		//option 6 - exit 
		System.out.println("\nBye! :-)")

	}//end main
}//end class