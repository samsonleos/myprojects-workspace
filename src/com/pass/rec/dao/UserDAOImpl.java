package com.pass.rec.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;


@Repository("userDao")
public class UserDAOImpl extends AbstractDAO<Integer, User> implements UserDAO{

		
	@Override
	public List<User> retrieveUsers() {
		
		@SuppressWarnings("unchecked")
		List<User> listUsers = createEntityCriteria()
									.setResultTransformer( Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUsers;
	}
	
	@Override
	public void saveUser(User user) {
		persist(user);
	}

}
