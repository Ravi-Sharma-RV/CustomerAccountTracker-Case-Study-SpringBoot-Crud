package com.wipro.CustomerAccountTracker.Dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wipro.CustomerAccountTracker.Bean.AccountBean;

@Repository
public interface AccountDao extends CrudRepository<AccountBean, Integer> {
	
	Optional<AccountBean> findByAccountNumber(long accountNumber);

}
