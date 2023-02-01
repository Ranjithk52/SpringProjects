package com.ojas.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ojas.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "select u from User u where u.uname=?1 and u.password=?2")

	User findUserByUnameAndPassword(String uname, String password );
}
