package main;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {

		//out: 표준 출력 클래스(대상: 모니터)
		System.out.println("안녕하세요");
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		
		try {
			//in: 표준 입력 스트림(대상: 키보드)
			int i = System.in.read();
			System.out.println(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
