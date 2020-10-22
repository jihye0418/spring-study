package com.spring.anno6;

//인터페이스 + 클래스, 클래스 + 클래스(has a관계)
public class MyBeanImpl implements MyBean {

	@Override
	public String getBeanName() {
		return "My Service Bean";
	}
}
