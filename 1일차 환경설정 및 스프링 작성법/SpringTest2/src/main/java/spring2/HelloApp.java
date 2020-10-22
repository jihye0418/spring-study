package spring2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloApp {

	public static void main(String[] args) {
	//1. xml파일(환경설정 파일)의 위치를 불러오는 방법
		Resource resource = new ClassPathResource("/spring2/initContext.xml");
		
		//2. 빈즈 공장을 불러와서 객체 생성
		BeanFactory factory=new XmlBeanFactory(resource);
		
		//3. factory에서 getBean("객체를 불러올 id값을 지정")
		MessageBeanDI bean = (MessageBeanDI)factory.getBean("mBean");
		bean.sayHello(); 
	}

}
