package main;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) throws IOException {

		//바이트 입력 스트림 생성
		FileInputStream fis = new FileInputStream("reader.txt");
		while(true) {
			int i = fis.read(); //1바이트씩 읽어오기
			if(i == -1) { //파일 끝에 도달하면 종료
				break;
			}
			System.out.println((char) i); //바이트 -> 문자로 변환
		}
		
		//문자 기반 입력 스트림 생성
		FileReader fr = new FileReader("reader.txt");
		
		while(true) {
			int i = fr.read(); //1바이트씩 읽어오기
			if(i == -1) { //파일 끝에 도달하면 종료
				break;
		}
		System.out.println((char) i); //한글이 제대로 읽어옴	
	}

}
}
