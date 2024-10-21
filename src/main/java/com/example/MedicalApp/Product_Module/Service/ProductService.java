package com.example.MedicalApp.Product_Module.Service;

import com.example.MedicalApp.Product_Module.Entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    //save operation
    Product saveProduct(Product product);

    // Read operation
    List<Product> getAllProduct();

    // Update operation
    Optional<Product> updateProductDetail(Product product, String product_id);


}
