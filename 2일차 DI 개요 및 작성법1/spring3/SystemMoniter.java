package spring3;

//문자를 전송=>기간을 정하기
public class SystemMoniter {

	private long periodTime;//기간
	//has a 관계
	private SmsSender sender;
	
	//Setter Method를 이용
	public void setPeriodTime(long periodTime) {
		this.periodTime = periodTime;//this.periodTime=10
		System.out.println("setPeriodTime()호출됨");
	}
	public void setSender(SmsSender sender) {//callByRef
		this.sender = sender;
		System.out.println("setSender()호출됨=>"+sender);//sender.toString()
	}
	
	public String toString() {
		return "Systemmoniter[peridTime="+periodTime+",sender="+sender+"]";
	}
}






