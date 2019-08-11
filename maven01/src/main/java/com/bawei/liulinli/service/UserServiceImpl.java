package com.bawei.liulinli.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bawei.liulinli.bean.User;
import com.bawei.liulinli.mapper.UserMapper;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper um;

	public List<User> sleUser() {
		// TODO Auto-generated method stub
		return um.sleUser();
	}
}
