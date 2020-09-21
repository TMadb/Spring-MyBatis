package com.org.dao.impl;

import com.org.dao.AccountDao;
import com.org.service.AccountService;

//@Service
public class AccountDaoImpl implements AccountService {
	
//	@Resource
	AccountDao accountDao;
	
	
	//设值注入使用，在主配置文件中配置
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

		
	@Override
	/*Spring-AOP内置事务管理之注解
	 * isolation 设置事务的隔离级别，一般为默认
	 * propagation 设置事务的传播机制，默认Propagation.REQUIRED
	 * 如果当前没有事务，就新建一个事务，如果已存在一个事务中，加入到这个事务中，这是最常见的选择
	 * rollbackFor 回滚
	 */
//	@Transactional(isolation = Isolation.DEFAULT,
//	               propagation = Propagation.REQUIRED,
//	               rollbackFor = Exception.class)
	public void transferAccount(Integer from, Integer to, Double balance) throws Exception {
		
		//调用转账方法
		accountDao.updateBalance(from, balance*-1);
		//测试
		if(true) {
			throw new Exception("运行异常");
		}
		accountDao.updateBalance(to, balance);
	}
}
