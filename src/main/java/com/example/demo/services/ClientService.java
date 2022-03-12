package com.example.demo.services;

import com.example.demo.models.ClientModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientService extends CrudRepository<ClientModel, Integer> {
    
}
