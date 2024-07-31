package main;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) throws IOException {

		//입력 스트림 생성
		FileInputStream fis = new FileInputStream("input.txt");
		
		//파일의 내용을 읽다가 파일의 끝에 도달하면 반복문 종료
		while(true) {
			int i = fis.read();
			//파일의 끝에 도달하면 -1 반환
			if(i == -1) {
				break;
			}
			System.out.println((char)i);
		}
	}

}
