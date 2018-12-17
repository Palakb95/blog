package com.luv2code.springdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.luv2code.springdemo.model.Account;
import com.luv2code.springdemo.model.CreateBlog;
import com.luv2code.springdemo.service.AccountService;
import com.luv2code.springdemo.service.LoginService;

@Controller
@RequestMapping("/account")
public class AccountController {
	@Autowired
	LoginService loginservice;

	@Autowired
	AccountService accountservice;

	@RequestMapping("/home")
	public String showHomePage() {
		return "index";
	}

	@RequestMapping("/new")
	public String newAccount() {
		// model.addAttribute("account",new Account());
		return "newAccount";
	}

	@RequestMapping("/showDetails")
	public String showDetails() {
		return "showDetails";
	}

	@RequestMapping("/login")
	public String LoginDetails() {
		return "login";
	}

	@RequestMapping("/processform")
	public String processForm(HttpServletRequest request, Model model) {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		System.out.println(firstname + lastname);
		boolean result = loginservice.checkLogin(firstname, lastname);
		System.out.println("result is " + result);
		if (result == false) {
			return "login";
		} else
			return "Followers";
	}

	@RequestMapping(value = "/saveAccount")
	public String saveAccount(Model model, Account account) {
		model.addAttribute("account", account);
		System.out.println(account.toString());
		accountservice.SaveAccount(account);
		return "showAccount";

	}

	@RequestMapping("/createblog")
	public String createBlog() {
		return "create_blog";
	}

	@RequestMapping("/logout")
	public String Logout() {
		return "login";
	}

	@RequestMapping("/showMyPage")
	public String showMyPage(HttpServletRequest request, Model model) {
		String myBlog = request.getParameter("blog");
		System.out.println(myBlog);
		model.addAttribute("myblog",myBlog);
		return "showMyPage";
	}

}
