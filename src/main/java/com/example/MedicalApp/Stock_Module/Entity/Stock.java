package com.example.MedicalApp.Stock_Module.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Integer id;

    @NotNull
    @Column(updatable = false)
    private String product_id;

    @NotNull
    private String product_name;

    private String user_name;
    private String user_id;
    private String product_category;

    private Boolean certificate;

    @NotNull
    @Size(min =1, max = 7)
    private Integer product_price;

    @NotNull
    @Size(min =1, max = 6)
    private Integer product_stock;

}
