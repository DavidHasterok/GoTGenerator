
public class CapitalizeNouns {

	static String capitalized(String word) { //capitalizes the first letter of a String
		String s1 = word.substring(0, 1);
		s1 = s1.toUpperCase();
		String readyNoun = s1 + word.substring(1);
		
		return readyNoun;
	}
}
