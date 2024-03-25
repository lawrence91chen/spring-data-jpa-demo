package com.github.lawrence91chen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.github.lawrence91chen.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>, QuerydslPredicateExecutor<User> {

}
