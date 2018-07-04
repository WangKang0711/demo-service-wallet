package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.vo.AccountBalanceVo;

@RestController
public class RestWalletService {
	
	private Logger logger = LoggerFactory.getLogger(RestWalletService.class);
	
	@Autowired
	private WalletServiceImpl walletService;

	@RequestMapping(value = "/getAccountBalance")
	public AccountBalanceVo getAccountBalance(@RequestParam(value = "customerCode") String customerCode) {
		logger.info("### RestWalletService.getAccountBalance called");
		return walletService.getAccountBalance(customerCode);
	}
	
	
}
