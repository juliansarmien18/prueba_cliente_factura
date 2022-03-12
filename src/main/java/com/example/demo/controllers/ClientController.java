package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.ClientModel;
import com.example.demo.services.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/client/")
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping()
    public ArrayList<ClientModel> getClients(){
        return clientService.getClient();
    }

    @GetMapping(path = "/{id}")
    public Optional<ClientModel> getById(@PathVariable("id") Integer id){
        return this.clientService.getById(id);
    }

    @PostMapping()
    public ClientModel postClient(@RequestBody ClientModel client){
        return this.clientService.saveClient(client);
    }

    @PutMapping(path = "/{id}")
    public ClientModel putClient(@PathVariable("id") Integer id, @RequestBody ClientModel client){
        return this.clientService.saveClient(client);
    }

    @DeleteMapping(path = "/{id}")
    public String DeleteById(@PathVariable Integer id){
        boolean is_deleted = this.clientService.deleteClient(id);
        if (is_deleted){
            return "{cliente borrado}";
        }
        else{
            return "{error al borrar al cliente}";
        }
    }
}
