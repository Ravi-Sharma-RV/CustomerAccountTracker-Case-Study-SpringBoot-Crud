package com.wipro.CustomerAccountTracker.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.CustomerAccountTracker.Bean.AccountBean;
import com.wipro.CustomerAccountTracker.Dao.AccountDao;
import com.wipro.CustomerAccountTracker.Exception.RecordNotFoundException;

@Service
public class AccountService {
	
	@Autowired
	AccountDao ad;
	
	@Autowired
	CustomerService cs;
	
	public AccountBean GetAccDetailsByAccNum(Long accountNumber) throws RecordNotFoundException
	{
		Optional<AccountBean> account=ad.findByAccountNumber(accountNumber);
		if(account.isPresent()) 
		{
			return account.get();
		}
		else
		{
			throw new RecordNotFoundException("No Customer record exist for given Account Number :"+accountNumber);
		}
	}

}
