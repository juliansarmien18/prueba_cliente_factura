package com.example.demo.repositories;

import com.example.demo.models.ProductBillModel;

import org.springframework.data.repository.CrudRepository;

public interface ProductBillRespository extends CrudRepository<ProductBillModel, Integer> {
    
}
