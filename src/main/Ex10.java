package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10 {

	public static void main(String[] args) throws IOException {

		//기반 스트림 먼저 생성
		FileInputStream fis = new FileInputStream("reader.txt");
		
		while(true) {
			int i = fis.read();
			if(i == -1) {
				break;
			}
			System.out.println(i + " "); //1바이트씩 가져오기 때문에 한글이 깨짐.
		}
		
		//바이트 기반 스트림 생성
		FileInputStream fis2 = new FileInputStream("reader.txt");
		//보조 스트림 생성
		InputStreamReader isr = new InputStreamReader(fis2);
		
		while(true) {
			int i = isr.read();
			if(i == -1) {
				break;
			}
			System.out.println((char)i);
		}
	}

}
