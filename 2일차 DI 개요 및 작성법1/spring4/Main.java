package spring4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring2.MessageBeanDI;

//자바코드 ->미리 객체를 만들어서 관리(=컨테이너)->환경설정파일을 통해서 불러와서 작업
//외부 패키지를 가져올 수 있도록 처리

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //1.xml파일이 여러개 존재=>배열로 관리->파일명부여
		String[] configLocation=new String[] {"applicationContext.xml"};
		
	//2.xml파일을 메모리에 올려줄 수 있는 클래스를 통해서 객체를 생성->p49
	   AbstractApplicationContext context=
			           new ClassPathXmlApplicationContext(configLocation);
	   //3.자바프로그램이 종료=>자동적으로 context객체도 같이 종료될수 있도록 처리
	   context.registerShutdownHook();
	   //4.xml에서 만들어진 객체를 가져와서 처리
	   SystemMoniter moniter=(SystemMoniter)context.getBean("moniter2");
	   System.out.println("moniter=>"+moniter);
	   //5.context도 종료
	   context.close();//메모리에 올려놓은 모든 빈즈객체들을 모두 메모리해제하라
	}
}










