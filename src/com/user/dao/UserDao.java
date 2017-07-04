package com.user.dao;



import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.user.bean.UserBean;

@Repository
public class UserDao {
	@Autowired
	private SessionFactory factory;
	@Transactional
	public String addUser(UserBean ub)
	{
		Session ses=factory.getCurrentSession();
		ses.save(ub);
		return "UserID: "+ub.getUserId();
	}
	
}
