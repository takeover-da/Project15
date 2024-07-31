package main;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("output2.txt");
		
		byte[] arr = {65, 66, 67};
		
		//배열의 모든 데이터 출력
		fos.write(arr);
	}

}
