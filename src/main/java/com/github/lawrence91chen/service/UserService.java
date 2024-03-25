package com.github.lawrence91chen.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.lawrence91chen.entity.QUser;
import com.github.lawrence91chen.entity.User;
import com.github.lawrence91chen.repository.UserRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private JPAQueryFactory jpaQueryFactory;

	public User findById(Integer id) {
		return userRepository.findById(id).orElse(null);
	}

	public User insert(User user) {
		user.setCreateBy("system");
		user.setUpdateBy("system");
		user.setCreateTime(new Date());
		user.setUpdateTime(new Date());
		return userRepository.save(user);
	}

	@Transactional
	public long update(User user) {
		QUser q = QUser.user;
		return jpaQueryFactory.update(q)
				.where(q.id.eq(user.getId()))
				.set(q.password, user.getPassword())
				.execute();
	}

	public void delete(Integer id) {
		userRepository.deleteById(id);
	}
}
