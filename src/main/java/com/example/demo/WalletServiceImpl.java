package com.example.demo;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.vo.AccountBalanceVo;

@Service(version = "1.0.0")
public class WalletServiceImpl implements WalletService{
	
	private Logger logger = LoggerFactory.getLogger(WalletServiceImpl.class);

	@Override
	public AccountBalanceVo getAccountBalance(String customerCode) {
		logger.info("### WalletService.getAccountBalance called");
		// do something
		AccountBalanceVo vo = new AccountBalanceVo();
		vo.setCustomerCode(customerCode);
		vo.setAvailableBalance(BigDecimal.valueOf(1000));
		return vo;
	}
	
	
}
