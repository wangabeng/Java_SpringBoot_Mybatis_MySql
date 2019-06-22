package com.ui.toto.toto.dao;

// mapper java类
import org.apache.ibatis.annotations.Mapper;

import com.ui.toto.toto.domain.User;
@Mapper
public interface UserDao {
	public User selectUserById(Integer userId);
	
}
