package com.sourav.repository;

import com.sourav.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepo {

    List<Product> prodlist = new ArrayList<>();

    public List<Product> getAll(){
        return prodlist;
    }
    public  Product Getproductbyid(int id){
        for(Product pr : prodlist){
            if(id == pr.getId()) return pr;
        }
        return  new Product();
    }

    public void addProduct(Product pr){
        prodlist.add(pr);
    }

    public String updateProduct(int id, Product pr){
        String message = "no product with id " + id;
        for(Product product : prodlist){
            if(id == product.getId()) {
                message = "product " + pr + " Updated Successfully";
                product.setId(pr.getId());
                product.setName(pr.getName());
                product.setPrice(pr.getPrice());
                product.setQuantity(pr.getQuantity());
            }
        }
        return message;
    }
    public String deleteProduct(int id){
        String message = "no product with id " + id;
        for(int i =0;i< prodlist.size();i++){
            if(id == prodlist.get(i).getId()) {
                prodlist.remove(i);
                message = "product with id " + id + " deleted Successfully";

            }
        }
        return message;
    }


}
