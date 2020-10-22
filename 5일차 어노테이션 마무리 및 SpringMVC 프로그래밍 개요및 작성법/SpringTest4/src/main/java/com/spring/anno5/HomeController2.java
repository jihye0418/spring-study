package com.spring.anno5;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("homeCvn") //패키지에 들어가 있는 모든 클래스를 자동으로 빈즈객체로 등록  -> 자동으로 빈즈 등록해줌
public class HomeController2 {
	
	@Inject //알아서 객체를 호출해준다. (신버전)
	 private Camera camera;
	
	@Autowired //알아서 객체를 호출해준다. - 자료형이 같은 것을 찾음 (구버전)
	private Camera2 camera2;

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "HomeController2[camera="+camera+", camera2="+camera2+"]";
	}
	
}