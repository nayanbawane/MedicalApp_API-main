package com.example.MedicalApp.History_Module.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    @NotNull
    private Integer id;

    @NotNull
    private Integer quantity;

    @NotNull
    private Integer remaining_stock;

    @NotNull
    private Date date_of_sell;

    @NotNull
    private String sell_id;

    @NotNull
    private String product_id;

    @NotNull
    private String product_name;

    @NotNull
    private String product_category;

    @NotNull
    private String user_name;

    @NotNull
    private String user_id;

    private Float total_amount;
    private Float price;

}
