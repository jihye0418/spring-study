package com.spring.anno1;

import org.springframework.beans.factory.annotation.Required;//@Required�� ������ Ŭ����

public class Camera extends Object{

	private int number;//ī�޶�� 
	
	@Required
	public void setNumber(int number) {
		this.number=number;
		System.out.println("setNumber()ȣ���!");
	}
	
	//�޼����̸� ���� ���=>�޼������ �������̵��� �� �޼������� Ȯ�����ִ� ����� ���� ������̼�
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Camera[number="+number+"]";
	}
}




