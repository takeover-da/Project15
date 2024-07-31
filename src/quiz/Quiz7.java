package quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Quiz7 {

	public static void main(String[] args) throws IOException {

	
		FileOutputStream fos = new FileOutputStream("Quiz7.txt");
		
	
		OutputStreamWriter osw = new OutputStreamWriter(fos);

		osw.write("프로그래밍");
		
		osw.flush();
	}

}
