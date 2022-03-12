package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.ProductModel;
import com.example.demo.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product/")
public class ProductController {
    
    @Autowired
    ProductService productService;

    @GetMapping()
    public ArrayList<ProductModel> getProduct(){
        return productService.getProduct();
    }

    @PostMapping()
    public ProductModel postProduct(@RequestBody ProductModel product){
        return this.productService.saveProduct(product);
    }
    
    @GetMapping(path = "/{id}")
    public Optional<ProductModel> getById(@PathVariable("id") Integer id){
        return this.productService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public ProductModel putProduct(@PathVariable("id") Integer id, @RequestBody ProductModel product){
        return this.productService.saveProduct(product);
    }

    @DeleteMapping(path = "/{id}")
    public String DeleteById(@PathVariable Integer id){
        boolean is_deleted = this.productService.deleteProduct(id);
        if (is_deleted){
            return "{producto borrado}";
        }
        else{
            return "{error al borrar el producto}";
        }
    }
}
