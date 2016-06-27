import java.io.*;
import java.util.Random;

public class Generator {

	public static void main(String[] args) throws IOException{
		Random rand = new Random();
		int volume = rand.nextInt();
		if (volume < 0) { volume = volume * (-1); }
		
		System.out.println("A Song of Ice and Fire " + volume + ":");
		// TODO Auto-generated method stub

	
		ListReader noun = new ListReader("src/nounlist.txt");
		String[] nouns = noun.getFile();
		String randomNoun1 = CapitalizeNouns.capitalized(RandomObject.getRandom(nouns));
		String randomNoun2 = CapitalizeNouns.capitalized(RandomObject.getRandom(nouns));
		
		ListReader preposition = new ListReader("src/prepositionlist.txt");
		String[] prepositions = preposition.getFile();
		String randomPreposition = RandomObject.getRandom(prepositions);
		
		System.out.println("A " + randomNoun1 + " " + randomPreposition + " " + randomNoun2 + "s");
		
	}

}
