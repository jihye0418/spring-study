package com.spring.anno3;

import org.springframework.beans.factory.annotation.Required;//@Required

public class Camera extends Object{

	private int number;//카메라 
	
	@Required
	public void setNumber(int number) {
		this.number=number;
		System.out.println("setNumber()호출됨!");
	}
	
	//메서드명 위에 기술(이 메서드가 오버라이딩이 제대로 됐는지를 체크해주는 기능)
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Camera[number="+number+"]";
	}
}