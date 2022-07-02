package com.sampleproject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampleproject.entity.UserEntity;
import com.sampleproject.repository.UserRepository;
import com.sampleproject.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserEntity save(UserEntity userEntity) {
		
		return userRepository.save(userEntity);
	}

}
