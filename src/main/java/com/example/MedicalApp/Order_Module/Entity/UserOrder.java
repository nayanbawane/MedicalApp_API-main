package com.example.MedicalApp.Order_Module.Entity;

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
public class UserOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    @NotNull
    private Integer id_Order;


    private String orderId;
    private String user_id;
    private String product_id;
    private String product_name;
    private String product_category;
    private String user_name;

    private Integer product_quantity;
    private Integer product_price;
    private Integer subtotal_price;
    private Integer delivery_charge;
    private Integer tax_charge;
    private Integer total_price;

    private Date order_date;
    private Boolean isApproved;


}
