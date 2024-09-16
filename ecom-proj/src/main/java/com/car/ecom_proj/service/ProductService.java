package com.car.ecom_proj.service;

import com.car.ecom_proj.model.Product;
import com.car.ecom_proj.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;
    public List<Product> getAllProducts() {

        return repo.findAll();


    }
}
