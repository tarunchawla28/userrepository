package com.example.demo.dao.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.UserDao;
import com.example.demo.model.UserRegistry;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<UserRegistry> getUsers() {
		return this.sessionFactory.getCurrentSession().createQuery("from UserRegistry").list();
	}

	@Override
	public String saveUsers(UserRegistry userRegistry) {
		this.sessionFactory.getCurrentSession().save(userRegistry);
		return "successfully saved";
	}

}
