package com.ronyao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ronyao.bean.User;
import com.ronyao.dao.UserMapper;

@Service
public class UserSevice {

	@Autowired
	UserMapper userMapper;

	public User getUserById(Integer userId) {
		
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(userId);
	}

	public User getUserByName(String userName){
		return userMapper.selectByName(userName);
	}

}
