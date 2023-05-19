package com.academy.fincons.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.academy.fincons.dto.UserDto;
import com.academy.fincons.entity.Users;

@Component
public class EntityToUserConverter implements Converter<Users, UserDto>{

	@Override
	public UserDto convert(Users source) {
		UserDto userDto = new UserDto();
		userDto.setId(source.getId());
		userDto.setName(source.getName());
		userDto.setSurname(source.getSurname());
		userDto.setEmail(source.getEmail());
		userDto.setPhone(source.getPhone());
		return userDto;
	}

}
