package com.sourav.controller;

import com.sourav.model.Product;
import com.sourav.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> FindAll(){
        return service.getAll();
    }
    @GetMapping("/products/{id}")
    public Product Getproductbyid(@PathVariable int id){
        return service.Getproductbyid(id);
    }
    @PostMapping("/products")
    public String addProduct(@RequestBody Product prod){
        service.addProduct(prod);
        return "product " + prod + " added";
    }
    @PutMapping("/products/{id}")
    public String updateProduct(@PathVariable int id,@RequestBody Product prod){
        return  service.updateProduct(id,prod);
    }
    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id){
       return service.deleteProduct(id);
    }
}
