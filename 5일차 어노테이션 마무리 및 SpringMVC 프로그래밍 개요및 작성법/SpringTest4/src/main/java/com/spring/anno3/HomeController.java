package com.spring.anno3;

import javax.annotation.Resource; //@Resource와 연관이 있는 클래스
//@Resource->byName(이름으로 찾는 경우)->같은 클래스 자료형이 여러개 있을때 어떻게 구분?
//@Autowired->byType(같은 자료형을 찾는 경우)
public class HomeController {
	
	@Resource(name="camera2") //xml에서 <bean id="camera2" class="~"/>인 것을 찾게 된다.
	 private Camera camera2;
	
	 private Camera camera3;
	 private Camera camera4;
	
	 /*
	public void setCamera2(Camera camera2) {
		this.camera2 = camera2;
		System.out.println("setCamera2()호출됨");
	}
	*/
	
	@Resource(name="camera3")
	public void setCamera3(Camera camera3) {
		this.camera3 = camera3;
		System.out.println("setCamera3()호출됨");
	}
	
	@Resource(name="camera4")
	public void setCamera4(Camera camera4) {
		this.camera4 = camera4;
		System.out.println("setCamera4()호출됨");
	}
	 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "HomeController[camera2="+camera2+",camera3="+camera3
				    +",camera4="+camera4+"]";
	}
}







