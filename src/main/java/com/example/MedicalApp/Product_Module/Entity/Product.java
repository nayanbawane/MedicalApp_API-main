package com.example.MedicalApp.Product_Module.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Integer id;

    @NotNull
    @Column(updatable = false)
    private String product_id;

    @NotNull
    private String product_name;

    @NotNull
    private String product_category;

    @NotNull
    @Size(min =1, max = 7)
    private Integer product_price;

    @NotNull
    @Size(min =1, max = 6)
    private Integer product_stock;

    @NotNull
    private String product_expiry_date;


    private Float product_rating;
    private String product_description;
    private String product_image;
    private String product_power;





}
