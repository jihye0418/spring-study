package spring2;

public class MessageBeanImplDI implements MessageBeanDI {

	//DI를 이용해서 객체를 가져오는 방법 -> 저장(멤버변수)
	private String name1, name2; //①생성자를 통해 저장할 수 있다.(constructor injection)
	private String greeting; //②setter Method를 통해 저장할 수 있다. (Setter Method injection)
	
	//2. setter method는 <property> 태그를 이용해서 환경설정을 한다. 
	public void setGreeting(String greeting) {
		this.greeting = greeting; //this.greeting="안녕"
		System.out.println("setGreeting 생성자 호출됨!");//호출 확인하기
	}

	//1. 멤버변수의 초기값 설정 -> 생성자를 이용한다. 
	//<constructor-arg>태그를 통해 값을 임의로 지정해서 환경설정을 해준다. 
	public MessageBeanImplDI(String name1, String name2) {
		super(); //부모 생성자 자동 호출
		this.name1 = name1; //this.name1="대한민국";
		this.name2 = name2; //this.name2="서울";
		System.out.println("MessageBeanImplDI 생성자 호출됨!"); //호출 확인하기
	}


	
	
	@Override
	public void sayHello() {
		String message = greeting+name1+","+name2+"!"; //멤버변수가 선언이 되어 있다면 가능하다.
		System.out.println("message=>" + message);
	}

}
