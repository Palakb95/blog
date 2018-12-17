package com.luv2code.springdemo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springdemo.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	 private LoginDao loginDAO;

	@Override
	@Transactional
	public boolean checkLogin(String firstname, String lastname) {
		 System.out.println("In Service class...Check Login");
         return loginDAO.checklogin(firstname, lastname);
	}

}
