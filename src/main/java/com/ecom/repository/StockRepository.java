package com.ecom.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.ecom.model.Stock;



public interface StockRepository extends JpaRepositoryImplementation<Stock, Integer> {
	
	

}

