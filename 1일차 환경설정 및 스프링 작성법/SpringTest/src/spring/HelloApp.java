package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//자바코드 -> 미리 객체를 만들어서 관리(= 컨테이너) -> 환경설정파일을 통해 불러와 작업한다. 
//외부 패키지를 가져올 수 있도록 처리해야 한다. 
public class HelloApp {

	public static void main(String[] args) {
		//1. xml파일(환경설정 파일)의 위치를 불러오는 방법 (절대경로 | 상대경로)
		//1) 절대경로
		//Resource resource=new FileSystemResource("C:/webtest/4.jsp/sou/SpringTest/src/spring/applicationContext.xml");
		//2) 상대경로
		Resource resource = new ClassPathResource("/spring/applicationContext.xml");
									//작게 쓴 resource가 인터페이스 객체명
									//resource에서는 xml 파일을 담고 있다. 
		
		//2. 빈즈공장을 불러와서 객체를 생성해야 한다. 
		BeanFactory factory=new XmlBeanFactory(resource);
		//XmlBeanFactory()는 xml 파일의 정보를 메모리에 올리는 역할을 한다. -> 메모리에 올린 것을 필요할 때마다 하나씩 꺼내올 것임
		
		//3. factory에서 getBean("객체를 불러올 id값을 지정")
		//Message1 me = new Message1();을 사용할 필요가 없다.
		
		//Message1 me = (Message1)factory.getBean("test");
		//Message2 me = (Message2)factory.getBean("test2");
		MessageInter me = (MessageInter)factory.getBean("test2");
		me.sayHello("테스트"); //객체 사용
	}

}
