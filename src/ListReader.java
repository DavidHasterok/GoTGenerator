import java.io.*;
import java.util.Random;

public class ListReader {

	private String path;
	
	 public ListReader(String file_path){
		 path = file_path;
	 }
	 
public int getLines() throws IOException {  //counts how many lines the file has
	
	
	try {
	FileReader file = new FileReader(path);
	BufferedReader reader = new BufferedReader(file); //creates a buffered file reader
	
	String line = null;
	int numberOfLines = 0;
	
	while ((line = reader.readLine()) != null){ // as long as file still has another line
		numberOfLines++; // count up
	}
	reader.close(); // reader is done
	return numberOfLines; // return number of lines
	} catch (IOException e) {
		return 0;
	}
}
	 
public String[] getFile() throws IOException { // reads file into an array
	
	
	try {
	FileReader reader = new FileReader(path);
	BufferedReader textReader = new BufferedReader(reader); // creates buffered file reader again
	
	int numberOfLines = getLines(); // calls the method above to know how many lines there are
	String[ ] textData = new String[numberOfLines]; //creates an array the size of the amount of lines the file has
	
	for (int i=0; i < numberOfLines; i++) {
		textData[ i ] = textReader.readLine(); // go through file and read each line into its own array space
		}
	
	textReader.close( ); //reader is done
	return textData; // return array
	} catch (IOException e) {
		String[] exceptionString = new String[1];
		exceptionString[0] = "nothing";
		return exceptionString;
	}
}
		 
		 
 }
