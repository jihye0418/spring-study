package spring10;

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
		String[] configLocation=new String[] {"app.xml"};
		
	//2.xml파일을 메모리에 올려줄 수 있는 클래스를 통해서 객체를 생성->p49
	   AbstractApplicationContext context=
			           new ClassPathXmlApplicationContext(configLocation);
	   //3.자바프로그램이 종료=>자동적으로 context객체도 같이 종료될수 있도록 처리
	   context.registerShutdownHook();
	   //4.객체를 의존성 주입=>2.5방식의 코딩(객체를 가져오고나서 형변환시켜준다.)
	   //                       =>3.x버전대로 코딩(처음부터 형변환시켜서 객체가져오기)
	   //SystemMoniter moniter=(SystemMoniter)context.getBean("moniter");
	   //형식) getBean("의존성객체를 얻어올 id",형변환을 할 클래스명.class)
	   SystemMoniter moniter=context.getBean("systemMoniter",
			                                                       SystemMoniter.class);
			                                                         
	   //요청할때 한개의 객체가 만들어줘서 여러사람이 공유해서 사용을 하고 있다.(default)
	   //{soap=spring9.SoapHandler@30b8a058, rest=spring9.RestHandler@7494e528}
	   System.out.println("moniter=>"+moniter);
	
	   //5.context도 종료
	   context.close();//메모리에 올려놓은 모든 빈즈객체들을 모두 메모리해제하라
	}
}










