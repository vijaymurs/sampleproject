/**
 * 
 */
package com.sampleproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sampleproject.dto.UserRequest;
import com.sampleproject.entity.UserEntity;
import com.sampleproject.service.UserService;

/**
 * @author Vijayakumar
 *
 */

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping(value = "/saveUser", produces = MediaType.APPLICATION_JSON_VALUE )
	public HttpEntity<UserRequest> welcome(@RequestBody UserRequest userRequest) {

		UserRequest av = userService.save(userRequest);
		
		return new HttpEntity<UserRequest>(av);
	}

}
