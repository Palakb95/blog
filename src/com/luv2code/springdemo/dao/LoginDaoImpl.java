package com.luv2code.springdemo.dao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	private SessionFactory sessionfactory;


	@Override
	public boolean checklogin(String firstname, String lastname) {
		boolean userfound = false;
		Session session = sessionfactory.getCurrentSession();
		System.out.println(firstname + lastname);
		System.out.println("inside checklogin");
		try {
		Query query = session.createQuery("from AccountEntity as user where user.firstname = :firstname and user.lastname = :lastname");
		query.setParameter("firstname",firstname);
		query.setParameter("lastname",lastname);
//		System.out.println(query);
		List list = query.list();
		if(list != null && list.size() > 0)
		{
			userfound = true;
			System.out.println("userfound" + userfound);
		}
		}
		catch(Exception e)
		{
		session.close();
		e.printStackTrace();
		
		}
		return userfound;
	}

}
