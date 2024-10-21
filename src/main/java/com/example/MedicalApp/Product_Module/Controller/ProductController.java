package com.example.MedicalApp.Product_Module.Controller;

import com.example.MedicalApp.Product_Module.Entity.Product;
import com.example.MedicalApp.Product_Module.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    //save product
    @PostMapping("/addProduct")
    public ResponseEntity<Product> saveProduct(@Validated @RequestBody Product product)
    {
        return new ResponseEntity<Product>(productService.saveProduct(product), OK);
    }


    //get all product list
    @GetMapping("/getAllProduct")
    public List<Product> getAllUserList()
    {
        return productService.getAllProduct();
    }

    @GetMapping("/getProduct/{product_id}")
    public Product getSpecificProductItem(@PathVariable("product_id") String product_id)
    {
        return productService.getSpecificProduct(product_id);
    }

    //update product detail
    @PatchMapping("/updateProduct/{product_id}")
    public ResponseEntity<Optional<Product>> updateUserDetail(@RequestBody Product product, @PathVariable("product_id") String product_id)
    {
        return new ResponseEntity<Optional<Product>>(productService.updateProductDetail(product,product_id), OK);
    }

    //Delete By id
    @DeleteMapping("/delete/{product_id}")
    public String deleteProduct(@PathVariable("product_id") String product_id) {
        productService.deleteProductBy_product_id(product_id);
        return  "Product id and product item delete Successfull"+product_id;
    }



}

