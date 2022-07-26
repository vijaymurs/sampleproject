package com.sampleproject.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampleproject.dto.UserRequest;
import com.sampleproject.entity.UserEntity;
import com.sampleproject.repository.UserRepository;
import com.sampleproject.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserRequest save(UserRequest userRequest) {
		UserEntity userEntity = new UserEntity();
		UserRequest uq = new UserRequest();
		BeanUtils.copyProperties(userRequest, userEntity);
		
		userEntity = userRepository.save(userEntity);
		BeanUtils.copyProperties(userEntity, uq);
		return uq;
	}

}
