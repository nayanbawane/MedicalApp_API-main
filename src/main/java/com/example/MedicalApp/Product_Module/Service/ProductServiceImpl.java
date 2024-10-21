package com.example.MedicalApp.Product_Module.Service;

import com.example.MedicalApp.Product_Module.Entity.Product;
import com.example.MedicalApp.Product_Module.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Override
    public Product saveProduct(Product product) {
        UUID uuid = UUID.randomUUID();
        product.setProduct_id(String.valueOf(uuid));
        return productRepo.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return (List<Product>) productRepo.findAll();
    }

    @Override
    public Product getSpecificProduct(String product_id) {
        return productRepo.findProductByProduct_id(product_id);
    }

    @Override
    public Optional<Product> updateProductDetail(Product product, String product_id) {
        Optional<Product> product1 = Optional.ofNullable(productRepo.findProductByProduct_id(product_id));
        if (product1.isPresent()) {

            product1.get().setProduct_name(product.getProduct_name());
            product1.get().setProduct_category(product.getProduct_category());
            product1.get().setProduct_price(product.getProduct_price());
            product1.get().setProduct_stock(product.getProduct_stock());
            product1.get().setProduct_expiry_date(product.getProduct_expiry_date());
            product1.get().setProduct_rating(product.getProduct_rating());
            product1.get().setProduct_description(product.getProduct_description());
            product1.get().setProduct_image(product.getProduct_image());
            product1.get().setProduct_power(product.getProduct_power());
            productRepo.save(product1.get());

        }

        return product1;
    }

    @Override
    public void deleteProductBy_product_id(String product_id) {
            productRepo.deleteByProduct_id(product_id);
    }
}
