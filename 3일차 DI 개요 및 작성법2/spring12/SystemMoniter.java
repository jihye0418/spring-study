package spring12;

import javax.inject.Inject;//@Inject와 연관이 있는 클래스를 불러오게 설정

//문자를 전송=>기간을 정하기
public class SystemMoniter {

	private long periodTime;//기간
	//has a 관계
	@Inject
	private SmsSender sender;
	
	//Setter Method를 이용
	public void setPeriodTime(long periodTime) {
		this.periodTime = periodTime;//this.periodTime=10
		System.out.println("setPeriodTime()호출됨");
	}
	/* byType,byName을 사용해도 Setter Method를 호출해야 한다.
	public void setSender(SmsSender sender) {//callByRef
		this.sender = sender;
		System.out.println("setSender()호출됨=>"+sender);//sender.toString()
	}*/
	
	public String toString() {
		return "Systemmoniter[peridTime="+periodTime+",sender="+sender+"]";
	}
}






