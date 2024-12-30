package com.ecom.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.ecom.model.Supplier;



public interface SupplierRepository extends JpaRepositoryImplementation<Supplier, Integer> {

}
