package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.repositories.ClientRepository;
import com.example.demo.models.ClientModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public ArrayList<ClientModel> getClient(){
        return (ArrayList<ClientModel>) clientRepository.findAll();
    }

    public ClientModel saveClient(ClientModel client){
        return clientRepository.save(client = new ClientModel(client.getId(),client.getFirstName(),client.getFirstLastname(),
                                                                client.getSecondLastname(),client.getDocumentNumber(),client.getAdress(),
                                                                client.getDocumentTypeId()));
    }

    public Optional<ClientModel>getById(Integer id){
        return clientRepository.findById(id);
    }

    public boolean deleteClient(Integer id){
        try{
            clientRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
