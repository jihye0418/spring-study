package spring4;

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
		
		//4. xml에서 만들어진 객체를 가져와서 처리 (메모리에 올릴 대상) ------------------> xml이 바뀌지 않으면 이 부분만 변경하면 된다.
		SystemMoniter moniter = (SystemMoniter)context.getBean("moniter2"); 
		//메모리에 저장되어 있는 것을 꺼내오기 때문에 형변환이 일어난다. 
		System.out.println("moniter=>" + moniter);
		
		//5. context도 종료
		context.close(); //메모리에 올려놓은 모든 빈즈객체들 모두 메모리 해제
	}

}
