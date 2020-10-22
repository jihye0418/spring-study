package com.spring.anno6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//자바코드 ->미리 객체를 만들어서 관리(=컨테이너)->환경설정파일을 통해서 불러와서 작업
//외부 패키지를 가져올 수 있도록 처리

public class Main {

	public static void main(String[] args) {
     
	//2.자바 환경설정 l파일을 메모리에 올려줄 수 있는 클래스를 통해서 객체를 생성
	   AnnotationConfigApplicationContext context=
			           new AnnotationConfigApplicationContext(AppConfig.class); //xml 대신에 사용.
	   
	   /* 첫번째 방법 ⓐ 객체명.getBean(객체를얻어올클래스명.class);
		   MyBean bean=context.getBean(MyBean.class);
		   System.out.println("bean.getBeanName()=>"+bean.getBeanName());
	  */
	   
	   //두번째 방법
	   MyBean bean=context.getBean("getBeanName",MyBean.class);
	   
	   context.close();//메모리에 올려놓은 모든 빈즈객체들을 모두 메모리해제하라
	}
}