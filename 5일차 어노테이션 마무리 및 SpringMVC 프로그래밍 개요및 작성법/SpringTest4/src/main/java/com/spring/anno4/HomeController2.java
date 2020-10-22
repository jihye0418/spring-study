package com.spring.anno4;

import javax.annotation.*;
public class HomeController2 {

	 private Camera camera;
	 
	@Resource(name="camera5")
	public void setCamera(Camera camera) {
		this.camera = camera;
		System.out.println("setCamera5() 이름을 가진 setCamera() 호출됨");
	}
	
	//1. 빈즈 객체 생성 전 초기화 작업을 하고자할 때 필요(= 생성자 역할)
	//객체를 가져오기 전에 해야 할 일 ≒ 물건 구매하기 전에 돈을 지불하는 것.
	@PostConstruct
	public void init() {
		System.out.println("빈즈 객체 생성 전 초기화 작업을 하고자할 때 필요(= 생성자 역할)");
	}
	
	//2. 객체를 가져온 다음에 할 일
	@PreDestroy
	public void close() {
		System.out.println("빈즈 객체 생성 후 메모리 해제(close()) 호출 됨");
	}
	
}