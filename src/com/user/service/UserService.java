package com.user.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.bean.UserBean;
import com.user.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao udao;
	public String addUser(UserBean ub)
	{
		if(ub==null||ub.getUserName().length()<=2||ub.getPassword().length()<6)
		{
			return "Invalid UserData";
		}
		else
		{
			
			String result=udao.addUser(ub);
			return result;
		}
	}
	
	
}
