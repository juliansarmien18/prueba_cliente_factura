package com.example.demo.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

import com.example.demo.models.BillModel;
import com.example.demo.models.ProductBillModel;
import com.example.demo.repositories.BillRepository;
import com.example.demo.repositories.ProductBillRespository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService {
    @Autowired
    BillRepository billRepository;
    ProductBillRespository productBillRespository;

    public ArrayList<BillModel> getBill(){
        return (ArrayList<BillModel>) billRepository.findAll();
    }

    public BillModel saveBill(BillModel bill){

        float total_price = 0;
        int products_quantity = 0;
        Iterator<ProductBillModel> it = bill.getproductBillList().iterator();

        while(it.hasNext()) {
            ProductBillModel pb = new ProductBillModel();
            total_price += pb.getQuantity() * (pb.getProductId().getUnityPrice()); 
            products_quantity += pb.getQuantity();
        }

        bill = new BillModel(bill.getId(),products_quantity,total_price,bill.getproductBillList(),
                                                        bill.getCashierId(),bill.getCheckoutId(),bill.getClientId());
        
        return billRepository.save(bill);

        //productBillRespository.saveAll(bill.getproductBillList());

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
