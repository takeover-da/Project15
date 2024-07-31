package quiz;

import java.io.FileReader;
import java.io.IOException;

public class Quiz9 {

	public static void main(String[] args) throws IOException {

		FileReader read = new FileReader("Quiz8.txt");
		
		while(true) {
			int i = read.read();
			if(i== -1) {
				break;
			}
			System.out.println(i);
		}
		
	}

}
