package main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex12 {

	public static void main(String[] args) throws IOException {

		//보조 스트림을 사용해서 파일 복사하기
		
		//시간측정
		long start = 0;
		long end = 0;
		
		//입출력 기반스트림 생성
		FileInputStream fis = new FileInputStream("a.txt");
		FileOutputStream fos = new FileOutputStream("copy2.txt");
		
		//버퍼 보조스트림 생성
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//복사 시간 측정하기
		start = System.currentTimeMillis();
		
		while(true) {
			int i = bis.read(); //보조 입력
			if(i == -1) {
				break;
			}
			bos.write(i); //보조 출력
		}
		
		end = System.currentTimeMillis();
		
		// 속도가 빨라짐(대용량의 파일을 쓸때는 보조스트림을 사용!)
		System.out.println(String.format
				("파일 복사하는데 %d milliseconds 소요되었습니다.",
				(end - start)));
		// 102 milliseconds
	}

}
