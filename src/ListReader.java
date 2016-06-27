import java.io.*;
import java.util.Random;

public class ListReader {

	private String path;
	
	 public ListReader(String file_path){
		 path = file_path;
	 }
	 
public int getLines() throws IOException {
	
	
	try {
	FileReader file = new FileReader(path);
	BufferedReader reader = new BufferedReader(file);
	
	String line = null;
	int numberOfLines = 0;
	
	while ((line = reader.readLine()) != null){
		numberOfLines++;
	}
	reader.close();
	return numberOfLines;
	} catch (IOException e) {
		return 0;
	}
}
	 
public String[] getFile() throws IOException {
	
	
	try {
	FileReader reader = new FileReader(path);
	BufferedReader textReader = new BufferedReader(reader);
	
	int numberOfLines = getLines();
	String[ ] textData = new String[numberOfLines];
	
	for (int i=0; i < numberOfLines; i++) {
		textData[ i ] = textReader.readLine();
		}
	
	textReader.close( );
	return textData;
	} catch (IOException e) {
		String[] exceptionString = new String[1];
		exceptionString[0] = "nothing";
		return exceptionString;
	}
}
		 
		 
 }
