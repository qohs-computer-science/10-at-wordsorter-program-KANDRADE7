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
			System.out.println(word);
		}//end while loop

		//create hybrid data structure

		ArrayList<String>[] words = new ArrayList [26];
		for(int x = 0; x< words.length; x++){
			words[x] = new ArrayList<String>();
		}//end loop
		for(ArrayList<String> temp : words){
			System.out.println(temp.charAt());
	
		}





	}//end main
}//end class