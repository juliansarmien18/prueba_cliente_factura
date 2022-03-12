package com.example.demo.repositories;

import com.example.demo.models.BillModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends CrudRepository<BillModel, Long>{
    
}
