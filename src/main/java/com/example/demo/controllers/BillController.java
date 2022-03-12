package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.BillModel;
import com.example.demo.services.BillService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bill/")
public class BillController {
    @Autowired
    BillService billService;

    @GetMapping()
    public ArrayList<BillModel> getBills(){
        return billService.getBill();
    }

    @GetMapping(path = "/{id}")
    public Optional<BillModel> getById(@PathVariable("id") Long id){
        return this.billService.getById(id);
    }

    @PostMapping()
    public BillModel postBill(@RequestBody BillModel bill){
        return this.billService.saveBill(bill);
    }

    @PutMapping(path = "/{id}")
    public BillModel putBill(@PathVariable("id") Long id, @RequestBody BillModel bill){
        return this.billService.saveBill(bill);
    }

    @DeleteMapping(path = "/{id}")
    public String DeleteById(@PathVariable Long id){
        boolean is_deleted = this.billService.deleteBill(id);
        if (is_deleted){
            return "{factura borrada}";
        }
        else{
            return "{error al borrar factura}";
        }
    }
}
