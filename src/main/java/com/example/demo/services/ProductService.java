package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.ProductModel;
import com.example.demo.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public ArrayList<ProductModel> getProduct(){
        return (ArrayList<ProductModel>) productRepository.findAll();
    }

    public ProductModel saveProduct(ProductModel product){
        return productRepository.save(product = new ProductModel(product.getId(), product.getName(), product.getUnityPrice(), product.getStatusId()));
    }

    public Optional<ProductModel>getById(Integer id){
        return productRepository.findById(id);
    }

    public boolean deleteProduct(Integer id){
        try{
            productRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
