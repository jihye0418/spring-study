package com.spring.anno2;

import javax.inject.Inject;//maven을 이용해서 다운로드받아야 사용이 가능

//문자를 전송=>기간을 정하기
public class SystemMoniter {

	private long periodTime;//기간
	//has a 관계
	
	//@Autowired(required=false)
	@Inject
	private SmsSender sender;
	
	/*
	@Required
	@Autowired    //자동으로 의존객체를 찾아서 넣어주는 역할(=주입(injection))
	public void setSender(SmsSender sender) {//callByRef
		this.sender = sender;
		System.out.println("@Autowried때문에 자동 setSender()호출됨=>"+sender);//sender.toString()
	}
	*/
	//Setter Method를 이용
	public void setPeriodTime(long periodTime) {
		this.periodTime = periodTime;//this.periodTime=10
		System.out.println("setPeriodTime()호출됨");
	}
	
	
	public String toString() {
		return "Systemmoniter[peridTime="+periodTime+",sender="+sender+"]";
	}
}






