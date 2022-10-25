package com.experion.service;

import com.experion.entity.Account;

public interface SavingsCurrentService {
	public Account atmWithdrawal(Account account);
	public void onlineBanking();

}
