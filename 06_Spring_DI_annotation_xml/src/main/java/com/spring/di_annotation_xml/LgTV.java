package com.spring.di_annotation_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//(실습) LgTV 객체를 생성하고, SonySpeaker 주입
// @Component, @Autowired, @Qulifier 추가해서 설정
@Component
public class LgTV implements TV {
	@Autowired
	private Speaker speaker;
	
	public LgTV() {
		System.out.println(">> LgTV() 실행~");
	}
	
	@Override
	public void powerOn() {
		System.out.println("LgTV - 전원ON");
	}
	
	@Override
	public void powerOff() {
		System.out.println("LgTV - 전원OFF~~");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("LgTV - 소리크게");
		speaker.volumeUp();
	}
	
	@Override
	public void volumeDown() {
		System.out.println("LgTV - 소리작게~~");
		speaker.volumeDown();
	}
	
	//------------
	public void initMethod() {
		System.out.println("> LgTV - initMethod() 실행");
	}
	public void destroyMethod() {
		System.out.println("> LgTV - destroyMethod() 실행");
	}
}
