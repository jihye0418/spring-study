package spring6;

import java.util.List;
//의존객체->has a 관계
public class PerformanceMoniter {

	private List<Double> number;//성능

	public void setNumber(List<Double> number) {
		this.number = number;
		System.out.println("setNumber() 호출=>"+number);
	}	
}
