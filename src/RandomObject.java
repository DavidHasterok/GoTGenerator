import java.util.Random;

public class RandomObject {

static String getRandom(String[] array) { // returns a random element out of a String array
	Random rand = new Random();
	int arrayLength = array.length;
	int randomNumber = rand.nextInt(arrayLength - 1);
	String randomWord = array[randomNumber];
	return randomWord;
}
	
}
