package com.example.demo;

import com.example.demo.vo.AccountBalanceVo;

public interface WalletService {
	
	AccountBalanceVo getAccountBalance(String customerCode);
	
}
