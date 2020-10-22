package com.spring.anno6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//xml 대신 빈 클래스를 등록시켜 환경설정을 해주는 역할의 클래스.
@Configuration
public class AppConfig {
	
	//xml에서의 빈즈 생성 : <bean id="mybean" class="com.spring.anno6.MyBeanImpl"/>
	//자바 환경설정에서의 빈즈생성 : @Bean 어노테이션 사용
	//@Bean => <bean>태그 대신 빈즈를 등록시켜주는 어노테이션.
	/*
	 형식)

		@Bean
		public 객체를얻어올자료형  메서드명(){
    	객체를 얻어오는 구문 작성
		}  
		
		<bean id="getBeanName" class="com.spring.anno6.MyBeanImpl"/>
	 
	 */
	
	@Bean
	public MyBean getBeanName() {
		/*
		MyBean my = new MyBeanImpl();
		
		MyBeanImpl my = new MyBeanImpl();
		return my;
		*/
		return new MyBeanImpl();
	}
}
