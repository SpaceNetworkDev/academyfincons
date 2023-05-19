package com.academy.fincons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academy.fincons.entity.Users;
@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{

}
