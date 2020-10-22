package spring10;

//has a 관계
public class SystemMoniter {

	/* (1) byType =>@Autowired
	private PhoneCall call; //byType=>PhoneCall와 같은 자료형의 객체를 찾아와서 멤버변수에 저장
	                               <proerty>태그를 사용하지 않고도 호출이 가능  */
	private PhoneCall call;
	//Setter Method를 이용
	public void setCall(PhoneCall call) {
		this.call=call;
		System.out.println("setCall()호출(call)=>"+call);
	}
	
	//(2)byName=>@Resource
	/*
	private PhoneCall phonecall; //type과 이름을 같게 준다.(멤버변수명)
	
	public void setPhonecall(PhoneCall phonecall) {
		this.phonecall = phonecall;
		System.out.println("setPhonecall()호출(phonecall)=>"+phonecall);
	}

	public String toString() {
		return "Systemmoniter[phonecall="+phonecall+"]";
	} */
}






