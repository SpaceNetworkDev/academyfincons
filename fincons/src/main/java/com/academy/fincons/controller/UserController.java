package com.academy.fincons.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.academy.fincons.dto.UserDto;
import com.academy.fincons.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(value = "/")
	public @ResponseBody List<UserDto> getUsers(){
		return userService.getUsers();
	}
	
	
}
