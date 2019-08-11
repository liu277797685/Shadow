package com.bawei.liulinli.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bawei.liulinli.bean.User;
import com.bawei.liulinli.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService us;
	@RequestMapping("list.do")
	public String sayList(Model model){
		List<User> sleUser = us.sleUser();
		model.addAttribute("list", sleUser);
		return "list";
	}
}
