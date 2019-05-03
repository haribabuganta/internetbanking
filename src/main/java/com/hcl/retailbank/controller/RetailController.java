package com.hcl.retailbank.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.retailbank.entity.CustomerViewHistory;
import com.hcl.retailbank.repository.CustomerViewHistoryRepository;

@RestController
@RequestMapping("/retailmapping")
public class RetailController {
	@Autowired
	private CustomerViewHistoryRepository customerViewHistoryRepository;

	/*
	 * public FundTransferResponce fundTransfer(FundTransferrequest) {
	 * 
	 * 
	 * 
	 * }
	 */

	@GetMapping("/viewHistory")
	public List<CustomerViewHistory> getCustomerViewHistory() {

		CustomerViewHistory customerViewHistory = new CustomerViewHistory();
		customerViewHistory.setFromAccountNumber(1);
		customerViewHistory.setToAccountNumber(2);
		customerViewHistory.setTransactionAmount(300);
		customerViewHistory.setTransactionDate(new Date());
		customerViewHistory.setTransactionId(344);
		customerViewHistory.setTransactionType("create");
		customerViewHistoryRepository.save(customerViewHistory);
		List<CustomerViewHistory> customerViewHistoryData=(List<CustomerViewHistory>) customerViewHistoryRepository.findAll();
		return customerViewHistoryData;
	}



}
