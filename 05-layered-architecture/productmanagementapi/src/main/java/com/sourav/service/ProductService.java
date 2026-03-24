package com.sourav.service;

import com.sourav.model.Product;
import com.sourav.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getAll(){
        return repo.getAll();
    }

    public Product Getproductbyid(int id){
        return repo.Getproductbyid(id);
    }

    public void addProduct(Product prod){
        repo.addProduct(prod);
    }
    public String updateProduct(int id, Product prod){
        return repo.updateProduct(id,prod);
    }
    public String deleteProduct(int id){
        return repo.deleteProduct(id);
    }
}
