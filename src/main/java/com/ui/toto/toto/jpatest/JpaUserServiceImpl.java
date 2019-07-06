package com.ui.toto.toto.jpatest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JpaUserServiceImpl implements JpaUserService {
	@Autowired
	private JpaUserRepository jpaUserRepository;

	@Override
	public JpaUser getUser(Integer userId) {
		return jpaUserRepository.getUser(userId);

	}

}
