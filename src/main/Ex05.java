package main;

import java.io.FileInputStream;

public class Ex05 {

	public static void main(String[] args) {

		FileInputStream fis new FileInputStream("input3.txt");
		
		// 10개 크기의 배열 생성
		byte[] arr = new byte[10];
		
		int size;
		
		while(true) {
			//파일의 내용을 읽어서 배열에 저장하고 읽어온 문자의 크기 반환
			size = fis.read(arr);
			if (size == -1) { //파일 끝에 도달하면 종료
				break;
			}
			//읽어들인 크기만큼 배열요소를 출력
			for(int i=0; i<size; i++) {
				System.out.println((char) arr[i]);
			}
			
			System.out.println(": " + size + "바이트 읽음");
		}
		
	}

}
