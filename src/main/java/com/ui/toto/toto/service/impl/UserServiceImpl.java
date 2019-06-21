package com.ui.toto.toto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ui.toto.toto.dao.UserDao;
import com.ui.toto.toto.domain.User;
import com.ui.toto.toto.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	public User selectUserById(Integer userId) {
		// TODO Auto-generated method stub
		return userDao.selectUserById(userId);
	}

}
