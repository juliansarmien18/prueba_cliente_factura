package com.example.demo.services;

import com.example.demo.models.BillModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillService extends CrudRepository<BillModel, Long>{
    
}
