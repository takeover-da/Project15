package quiz;

import java.io.FileOutputStream;
import java.io.IOException;

public class Quiz4 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("output3.txt");

		for(int i=65; i<91; i++) {
			fos.write(i);
		}
	}
}
