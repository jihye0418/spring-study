package com.spring.anno5;

import org.springframework.stereotype.Component;

/*
 * 빈즈에 관련된 클래스가 30개 이상이면
 * <bean id="camera" class="com.spring.anno5.Camera"/> 태그가 많아진다. 
 * 
 * -> @Component 어노테이션을 사용하면 된다. (클래스에 사용)
 * 
 * @Component
 * -> 스프링 컨테이너가 어느 특정 패키지를 지정하면 -> 자동으로 그 패키지에 들어가 있는 모든 클래스를 자동으로
 * 빈즈객체로 등록을 시켜주는 역할을 하는 어노테이션.
 */

@Component
public class Camera {}