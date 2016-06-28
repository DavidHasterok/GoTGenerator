import java.io.*;
import java.util.Random;

public class Generator {

	public static void main(String[] args) throws IOException{
		Random rand = new Random();
		int volume = rand.nextInt(1000); 			// creates a random volume number for the book
		if (volume < 0) { volume = volume * (-1); }
		
		System.out.println("A Song of Ice and Fire " + volume + ":"); // first line

	
		ListReader noun = new ListReader("src/nounlist.txt"); //loads the list of nouns
		String[] nouns = noun.getFile(); // reads it into an array
		String randomNoun1 = CapitalizeNouns.capitalized(RandomObject.getRandom(nouns)); //two random nouns are taken from the array and capitalized
		String randomNoun2 = CapitalizeNouns.capitalized(RandomObject.getRandom(nouns));
		
		ListReader preposition = new ListReader("src/prepositionlist.txt"); //loads the list of prepositions
		String[] prepositions = preposition.getFile(); // reads it into an array
		String randomPreposition = RandomObject.getRandom(prepositions); //takes a random one
		
		String vocalOrConsonant = randomNoun1.substring(0, 1); // gets first letter of the first noun
		String pronoun = null;
		
		if (vocalOrConsonant.equals("A") || vocalOrConsonant.equals("E") || vocalOrConsonant.equals("I")|| vocalOrConsonant.equals("O") || vocalOrConsonant.equals("U") ) {
			pronoun = "An ";
		} else {
			pronoun = "A ";
		} //checks if noun starts with a vocal for grammar reasons
		
		System.out.println(pronoun + randomNoun1 + " " + randomPreposition + " " + randomNoun2 + "s"); //prints out second line
		
	}

}
