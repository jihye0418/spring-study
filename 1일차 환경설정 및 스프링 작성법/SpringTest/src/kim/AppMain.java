package kim;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Message1의 객체 생성 -> sayHello();
		//Message1 me = new Message1();
		//me.sayHello("홍길동");
		
		//프로그램 개발을 하다보면 중간에 설계상의 문제로 인해 소스코드를 변경할 때가 있다.
		Message2 me = new Message2();
		me.sayHello("홍길동");
		//객체 이름도 같지만 처리되는 내용이 다르다.
	}

}
