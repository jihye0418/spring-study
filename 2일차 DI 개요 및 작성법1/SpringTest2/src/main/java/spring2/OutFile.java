package spring2;

import java.io.IOException; //입출럭 => 예외처리 필요
//파일에 문자열을 입력 받아 출력시켜주는 공통의 추상메서드를 만들기 위해 인터페이스를 만들었다. 
public interface OutFile {
	public void out(String message) throws IOException;
}
