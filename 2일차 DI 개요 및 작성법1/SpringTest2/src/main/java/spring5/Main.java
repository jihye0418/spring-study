package spring5;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring2.MessageBeanDI;

public class Main {

	public static void main(String[] args) {
	//1. xml파일(환경설정 파일)의 위치를 불러오는 방법
		//xml파일이 많으면 배열로 관리한다 -> 환경설정에서 파일명을 부여해서 관리한다. 
		String[] configLocation = new String[] {"applicationContext.xml"}; //파일이 지금은 한개니까 하나의 파일명만 작성한다. 
		
		//2. xml 파일을 메모리에 올려줄 수 있는 클래스를 통해 객체 생성
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
				//AbstractApplicationContext : 메모리 관리해주는 인터페이스  (resource는 메모리 관리를 할 수 없다)
		
		//3. 자바프로그램이 종료되면 자동으로 context객체도 같이 종료될 수 있게 해준다.
		context.registerShutdownHook();
		
		//4. 객체 의존성 주입 
		//2.5방식 -> 객체를 가져오고나서 형변환 
		//3.0방식--> 처음부터 형변환시켜 객체 가져오는 방법
		//형식) getBean("의존성객체를 얻어올 id",형변환을 할 클래스명.class);
		SystemMoniter moniter3 = context.getBean("moniter3",SystemMoniter.class);
		System.out.println("moniter3=>" + moniter3);
		
		//5. context도 종료
		context.close(); //메모리에 올려놓은 모든 빈즈객체들 모두 메모리 해제
	}

}
