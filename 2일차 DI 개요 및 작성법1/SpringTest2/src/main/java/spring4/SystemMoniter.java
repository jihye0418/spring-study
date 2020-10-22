package spring4;

//문자를 전송할 때 기간을 정해주는 객체
public class SystemMoniter {
	private long periodTime; //기간
	private SmsSender sender; //SmsSender와 has a 관계 -> 객체를 가져온다. --> 생성자를 통해서 가져올 수도, setter method를 통해 가져올 수도 있다.
	
	//[DI] 2가지의 객체를 가져오는 방법 중 생성자 이용하기
	//생성자 : c네임스페이스를 이용해서 설정 가능
	public SystemMoniter(long periodTime, SmsSender sender) {
		this.periodTime = periodTime;
		this.sender = sender;
		System.out.println("SystemMoniter()생성자 호출");
	}

	//SystemMoniter 오버로딩
	public String toString() { //오버로딩
		return "Systemmotier[peridTime="+periodTime+",sender="+sender+"]";
	}
}
