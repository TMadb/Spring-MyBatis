package com.org.dao.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.interceptor.TransactionAttribute;
import org.springframework.transaction.interceptor.TransactionProxyFactoryBean;

import com.org.dao.AccountDao;
import com.org.service.AccountService;

@Service
public class AccountDaoImpl implements AccountService {
	
	@Resource
	AccountDao accountDao;
	
	
	//设值注入使用，在主配置文件中配置
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}


	@Override
	public void transferAccount(Integer from, Integer to, Double balance) {
		
		//调用转账方法
		accountDao.updateBalance(from, balance*-1);
		//测试
//		if(true) {
//			throw new Exception("运行异常");
//		}
		accountDao.updateBalance(to, balance);
	}
}
