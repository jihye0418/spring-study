package spring2;

import java.io.FileWriter;
import java.io.IOException;


//파일을 생성해서 파일내부에 문자열을 출력시켜주는 프로그램
public class OutFileImpl implements OutFile {
	private String filePath; //경로명 및 만들어질 파일명 저장을 위한 매개변수
	
	//filePath에 값을 넣을 수 있는 방법 : 생성자 / setter method
	
	//setter method를 사용함. ---> 환경설정에서 <property> 태그를 사용해서 호출
	public void setFilePath(String filePath) { //xml에서 환경설정을 통해 setter method를 호출할 예정. ---> 객체명.setFilePath(파일명)
		this.filePath = filePath;
		System.out.println("setFilePath()호출됨!" + filePath); //setter method 호출 확인 (자기 자신이기 때문에 gettter 필요 없이 그냥 filePath를 불러올 수 있다.)
	}

	@Override
	public void out(String message) throws IOException {
		// 한글데이터를 저장하고자 한다. 
		//+) 파일 만드는 방법 : FileOutputStream(영문), FileWriter(한글)
		FileWriter fw = new FileWriter(filePath); //생성자에 di를 넣어준다.
		//xml에서 filePath의 경로로 c:/webtest/good.txt로 정해줄 예정
		fw.write(message); //+) 입출력의 출력은 write, 입력은 read를 쓴다.
		//message는 MessageBeanImplDI의 sayHello()메서드에서 받아 파일에 출력시킬 예정
		
		fw.close();//파일을 만들면 닫아야함.
	}

}
