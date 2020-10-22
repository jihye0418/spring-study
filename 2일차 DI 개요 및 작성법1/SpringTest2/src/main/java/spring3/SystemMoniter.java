package spring3;

//문자를 전송할 때 기간을 정해주는 객체
public class SystemMoniter {
	private long periodTime; //기간
	private SmsSender sender; //SmsSender와 has a 관계 -> 객체를 가져온다. --> 생성자를 통해서 가져올 수도, setter method를 통해 가져올 수도 있다.
	
	//[DI] 2가지의 객체를 가져오는 방법 중 setter method를 이용해서 가지고 오자.
	public void setPeriodTime(long periodTime) {
		this.periodTime = periodTime; //this.periodTime = 10;
		System.out.println("periodTime 호출됨");
	}
	public void setSender(SmsSender sender) {
		this.sender = sender;
		System.out.println("sender 호출됨"+sender);//-> sender.toString()을 출력해준다. 
	}

	
	//SystemMoniter 오버로딩
	public String toString() { //오버로딩
		return "Systemmotier[peridTime="+periodTime+",sender="+sender+"]";
	}
}
