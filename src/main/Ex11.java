package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) throws IOException {

		//기반스트림을 사용해서 파일 복사하기
		
		//시간측정
		long start = 0; //시작시간
		long end = 0; //끝난시간
		
		//입력 스트림 생성
		FileInputStream fis = new FileInputStream("a.txt");
		
		//출력 스트림 생성
		FileOutputStream fos = new FileOutputStream("copy.txt");
		
		//한 문자씩 읽어서 복사하는 중
		while(true) {
			int i = fis.read(); //입력
			if(i == -1) {
				break;
			}
			fos.write(i); //출력
		}
		
		//복사가 끝나는 시간 저장
		end = System.currentTimeMillis();
		
		// 방법1
//		System.out.println("파일 복사하는데 " + 
//				(end - start) + " milliseconds 소요되었습니다.");
		// 1722389430570 milliseconds
		
		// 방법2
		System.out.println(String.format
				("파일 복사하는데 %d milliseconds 소요되었습니다.",
				(end - start)));
		// 1722389582582 milliseconds
		
		
	}

}
