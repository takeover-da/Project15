package main;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) throws IOException {

		//바이트 단위로 출력하는 스트림 생성
		//파일이 없으면 자동으로 생성됨
		FileOutputStream fos = new FileOutputStream("output.txt");
	
		byte a = 65;
		byte b = 66;
		
		fos.write(a); //65->A
		fos.write(b); //66->B
		fos.write('C'); //문자 그대로 저장
		
	}

}
