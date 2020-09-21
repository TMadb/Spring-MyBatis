package com.org.dao;

import org.apache.ibatis.annotations.Param;

public interface AccountDao {
	
	//转账操作
	void updateBalance(@Param("id")Integer id,@Param("balance")Double balance);	
}
