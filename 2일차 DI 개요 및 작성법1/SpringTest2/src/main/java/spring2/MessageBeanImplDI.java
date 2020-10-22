package spring2;

public class MessageBeanImplDI implements MessageBeanDI {

	//DI를 이용해서 객체를 가져오는 방법 -> 저장(멤버변수)
	private String name1, name2; //①생성자를 통해 저장할 수 있다.(constructor injection)
	private String greeting; //②setter Method를 통해 저장할 수 있다. (Setter Method injection)
	
	
	//--has a 관계 추가--
	private OutFile outF; //클래스와 클래스를 연결할 때 인터페이스를 통해 has a 관계를 추가함. 
 //하나를 수정하면 연결된 다른 클래스 내용을 가능한 덜 수정할 수 있도록 인터페이스를 사용함
	//=코드의 유연성을 위함
	
	//setter method를 이용함
	public void setOutF(OutFile outF) { //환경설정에서 <property>태그 사용하여 호출할 예정
		this.outF = outF;
		System.out.println("제대로 알려주세요~"+outF);
	}
	//------------------
	
	
	
	//2. setter method는 <property> 태그를 이용해서 환경설정을 한다. 
	public void setGreeting(String greeting) {
		this.greeting = greeting; //this.greeting="안녕" / THIS는 생성된 객체
		System.out.println("setGreeting 생성자 호출됨!");//호출 확인하기
	}

	//1. 멤버변수의 초기값 설정 -> 생성자를 이용한다. 
	//<constructor-arg>태그를 통해 값을 임의로 지정해서 환경설정을 해준다. 
	public MessageBeanImplDI(String name1, String name2) {
		super(); //부모 생성자 자동 호출
		this.name1 = name1; //this.name1="대한민국";  멤버변수와 매개변수가 같으면 THIS를 쓴다.
		this.name2 = name2; //this.name2="서울";
		System.out.println("MessageBeanImplDI 생성자 호출됨!"); //호출 확인하기
	}


	
	
	@Override
	public void sayHello() {
		String message = greeting+name1+","+name2+"!"; //멤버변수가 선언이 되어 있다면 가능하다.
		System.out.println("message=>" + message);
		
		
		
		//outF 객체를 이용해 out(message)호출  --> 입출력은 예외처리 필요
		try {
			outF.out(message); //out메서드를 호출하기 위해선 outF객체가 필요하다.
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
