package com.academy.fincons.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.academy.fincons.converter.EntityToUserConverter;
import com.academy.fincons.dto.UserDto;
import com.academy.fincons.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	EntityToUserConverter convertToEntity;
	
	@Autowired
	EntityToUserConverter converter;
	

	@Override
	public List<UserDto> getUsers() {
		return userRepository.findAll().stream().map(user -> converter.convert(user)).collect(Collectors.toList());
	}


	
}
