package com.user.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.user.bean.UserBean;
import com.user.service.UserService;
@Controller
public class UserControllar {
	@Autowired
	UserService uservice;
	@RequestMapping("new")
	public String getUserPage(Model m)
	{
		m.addAttribute("user",new UserBean());
		return "NewUser";
	}
	@RequestMapping(value="addUser", method=RequestMethod.POST)
	public String addUserData(@Valid @ModelAttribute("user")UserBean user, 
			BindingResult br, Model m)
	{
		if(br.hasErrors())
		{
			return "NewUser";
		}
		else
		{
			System.out.println("===============");
			String result=uservice.addUser(user);
			m.addAttribute("message",result);
			System.out.println("********************");
			return "hello";
		}
	}
}