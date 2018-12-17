package com.luv2code.springdemo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.AccountEntity;
import com.luv2code.springdemo.model.Account;

@Repository
public class AccountDaoImpl implements AccountDao {

	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public boolean saveAccount(Account account) {
		boolean saveFlag = true;
		AccountEntity entity = new AccountEntity();
		entity.setFirstname(account.getFirstname());
		entity.setLastname(account.getLastname());

		try {
			Session session = sessionfactory.getCurrentSession();
			session.save(entity);
		} catch (Exception e) {
			e.printStackTrace();
			saveFlag = false;

		}

		return saveFlag;
	}

}
