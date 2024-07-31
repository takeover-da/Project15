package quiz;

import java.io.FileWriter;
import java.io.IOException;

public class Quiz6 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("write3.txt");
		
		for(int i=1; i<=9; i++) {
			fw.write(i + " ");
		}
		for(int j=1; j<=9; j++) {
			fw.write(j + " ");
		}
		
	}
	fw.write(i + " * " + j + (i*j));

}
