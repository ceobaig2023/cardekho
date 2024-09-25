package com.car.ecom_proj.controller;

import com.car.ecom_proj.model.Product;
import com.car.ecom_proj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    public ProductService service;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
    @RequestMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>( service.getAllProducts(),HttpStatus.OK);
    }
    @RequestMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        Product product = service.getProductById(id);
        if(product != null) {


            return new ResponseEntity<>(product, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/products")
    public ResponseEntity<?> addProduct(@RequestPart Product product,@RequestPart MultipartFile file) {

        //product1
        try{
            Product product1 = service.addProduct(product,imageFile);
        }
        catch(Exception e)

       // return new ResponseEntity<>(service.addProduct(product,image), HttpStatus.CREATED);
    }
}
