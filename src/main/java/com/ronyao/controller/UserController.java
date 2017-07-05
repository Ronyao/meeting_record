package com.ronyao.controller;

import com.ronyao.bean.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ronyao.bean.User;
import com.ronyao.service.UserSevice;

import javax.servlet.http.HttpSession;

/*
 * 处理员工的增删查改
 * @author honor
 */
@Controller
public class UserController {
	
	@Autowired
	UserSevice userService;
	
	@RequestMapping("/")
	public String getUserById(@RequestParam(value="userId",defaultValue="101")Integer userId, Model model){
		User user = userService.getUserById(userId);
		model.addAttribute("user", user);
		return "index";
	}

	@GetMapping("/index")
	public String getHomePage(){
		return "index";
	}
	
	@GetMapping("/login")
	public String Login(){
		return "login";
	}


	@PostMapping("/login")
	@ResponseBody
	public Msg login(@RequestParam("username") String username, @RequestParam("password") String password,
					 HttpSession session){
		//获取前端传来的数据,判断密码
		User user = userService.getUserByName(username);
		if(password.compareTo(user.getUserPassword())==0){
			//获取到的数据存到session中
			session.setAttribute("username",username);
			return Msg.success();
		}else{
			return Msg.fail();
		}
	}

	@PostMapping("/logout")
	public String logout(HttpSession session){
		session.removeAttribute("username");
		return "index";
	}
	
	@GetMapping("/error")
	public String getErrorPage(){
		return "error";
	}
}
