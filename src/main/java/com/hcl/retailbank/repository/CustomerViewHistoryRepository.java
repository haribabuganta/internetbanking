package com.hcl.retailbank.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hcl.retailbank.entity.CustomerViewHistory;

public interface CustomerViewHistoryRepository  extends CrudRepository<CustomerViewHistory,Integer> {
}
