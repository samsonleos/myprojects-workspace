package com.pass.rec.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("userAccInfo")
public class UserAccountInfoDAOImpl extends AbstractDAO<Integer, UserAccountInfo> 
				implements UserAccountInfoDAO{

	@SuppressWarnings("unchecked")
	@Override
	public List<UserAccountInfo> retrieveUserAccountInfo() {
		
		return createEntityCriteria().setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	}

	@Override
	public void saveAccountInfo(UserAccountInfo info) {
		System.out.println(info.getAccountType().getAccountTypeCode());
		System.out.println(info.getAccountType().getAccountTypeName());
		persist(info);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserAccountInfo> retrieveUserAccountInfo(Long userId) {
		return getSession().createCriteria(UserAccountInfo.class).add(Restrictions.eq("user.id", userId)).list();
		
	}

}
