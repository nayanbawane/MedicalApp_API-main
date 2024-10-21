package com.example.MedicalApp.Product_Module.Service;

import com.example.MedicalApp.Product_Module.Entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    //save operation
    Product saveProduct(Product product);

    // Read All operation
    List<Product> getAllProduct();

    // Read specific operation
    Product getSpecificProduct(String product_id);

    // Update operation
    Optional<Product> updateProductDetail(Product product, String product_id);

    //Delete Operation
    void deleteProductBy_product_id(String product_id);


}
