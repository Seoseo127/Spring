package com.spring.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.biz.common.LogAdvice;
import com.spring.biz.user.UserService;
import com.spring.biz.user.UserVO;

//(실습) 객체생성 + 명칭(userService)설정, UserDAO 타입 의존주입(DI) 철
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	private LogAdvice log;
	
	public UserServiceImpl() {
		System.out.println(">> UserServiceImpl() 객체 생성");
		log = new LogAdvice();
	}
	
	@Override
	public UserVO getUser(UserVO vo) {
		log.printLog();
		return userDAO.getUser(vo);
	}
	
}


