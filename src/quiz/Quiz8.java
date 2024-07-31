package quiz;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Quiz8 {

	public static void main(String[] args) throws IOException {

		File dir = new File("C:\\Users\\G201\\Downloads");
		
		System.out.println(dir.isDirectory());
		
		File[] files = dir.listFiles();

		FileWriter fos = new FileWriter("Quiz8.txt");
		
		for(File f : files) {
			System.out.println(f.toString());
			
			fos.write(f.toString());
		}
		
		
	}

}
