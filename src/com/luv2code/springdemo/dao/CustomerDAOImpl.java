package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	public SessionFactory sessionfactory;

	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		Session session = sessionfactory.getCurrentSession();
		
		System.out.println("inside dao");
		//create a query
		Query<Customer> query =session.createQuery("from customer",Customer.class);
		
		System.out.println("inside");
		//execute aang get list
		List<Customer> customers = query.getResultList();
		
		return customers;
	}

}
