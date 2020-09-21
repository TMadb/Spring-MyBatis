package com.org.dao.impl;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.service.AccountService;

public class AccountDaoImplTest {
	
	AccountService accountService;
	
	@Before
	public void setUp() {
		ApplicationContext api = new ClassPathXmlApplicationContext("applicationContext.xml");
		accountService =(AccountService) api.getBean("accountDaoImpl");
	}
	
	@Test
	public void testtransferAccount() throws Exception {
		accountService.transferAccount(1, 2, 100.0);
	}
}
