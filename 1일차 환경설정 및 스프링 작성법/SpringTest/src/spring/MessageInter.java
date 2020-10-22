package spring;

//업무상 필요로 하는 클래스를 분석한 후 공통으로 사용하는 메서드가 필요하면 그걸 인터페이스로 만든다. 

public interface MessageInter {
	 void sayHello(String name); //추상메서드 (선언만 되어 있는 메서드)
}
