package main;

import java.io.File;
import java.io.IOException;

public class Ex13 {

	public static void main(String[] args) throws IOException {

		// File: 파일 정보를 담는 클래스(활용도가 제일 높음!)
		// 파일의 경로, 크기 등 정보를 확인하거나 파일을 생성할 수 있음.
		
		// newfile.txt와 연결된 파일 클래스 생성
		File file = new File("C:\\kiminsu\\workspace\\newfile.txt");
		
		//실제 파일 생성
		file.createNewFile();
		
		//파일 속성 보기
		System.out.println(file.isFile()); 			//파일인지?(is로 시작하면 boolen값으로 나옴)
		System.out.println(file.isDirectory()); 	//폴더인지?
		System.out.println(file.getName()); 		//파일이름
		System.out.println(file.getAbsolutePath()); //파일경로
		System.out.println(file.getPath()); 		//파일경로
		System.out.println(file.canRead()); 		//읽을 수 있는지?
		System.out.println(file.canWrite()); 		//쓸 수 있는지?
		
		//파일 삭제
		file.delete();
		
		//디렉토리
		File dir = new File("C:\\kiminsu\\workspace");
		
		System.out.println(dir.isDirectory());
		
		//폴더 밑에 있는 파일 목록
		File[] files = dir.listFiles();
		
		for(File f : files) {
			System.out.println(f.toString());
		}
		
	}

}
