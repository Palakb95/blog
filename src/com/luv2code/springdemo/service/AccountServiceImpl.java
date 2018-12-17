package com.luv2code.springdemo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.AccountDao;
import com.luv2code.springdemo.model.Account;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountDao accountdao;
	@Override
	@Transactional
	public boolean SaveAccount(Account account) {
		return accountdao.saveAccount(account);
	}

}
