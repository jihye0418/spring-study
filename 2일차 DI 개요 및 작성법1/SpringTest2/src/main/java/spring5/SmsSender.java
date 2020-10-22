package spring5;

//문자전송 시스템에 관련된 객체
public class SmsSender {
	boolean flag; //문자가 제대로 전달 됐는지 체크해주는 멤버변수
	
	//constructor-arg 이용 (생성자를 이용해서 값을 넣음)
	public SmsSender(boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public String toString() { //객체를 만들고 값을 출력하면 주소값만 나온다. 그래서 toString을 통해 문자를 출력할 거다.
		return "smsSender 호출";
	}
}
