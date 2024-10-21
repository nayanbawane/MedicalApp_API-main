package com.example.MedicalApp.Product_Module.Repo;

import com.example.MedicalApp.Product_Module.Entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository<Product, String> {

    @Query(nativeQuery = true, value = "SELECT * FROM product where product_id=?")
    Product findProductByProduct_id(String product_id);




}
