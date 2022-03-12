package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.BillModel;
import com.example.demo.repositories.BillRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService {
    @Autowired
    BillRepository billRepository;

    public ArrayList<BillModel> getBill(){
        return (ArrayList<BillModel>) billRepository.findAll();
    }

    public BillModel saveBill(BillModel bill){
        return billRepository.save(bill = new BillModel(bill.getId(),bill.getProductsQuantity(),bill.getProductBillCollection(),
                                                        bill.getCashierId(),bill.getCheckoutId(),bill.getClientId()));
    }

    public Optional<BillModel>getById(Long id){
        return billRepository.findById(id);
    }

    public boolean deleteBill(Long id){
        try{
            billRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
