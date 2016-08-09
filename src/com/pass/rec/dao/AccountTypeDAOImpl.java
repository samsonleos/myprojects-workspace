package com.pass.rec.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("accountTypeDAO")
public class AccountTypeDAOImpl extends AbstractDAO<String, AccountType> implements AccountTypeDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<AccountType> retrieveAccountTypes() {
		return createEntityCriteria().setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	}

}
