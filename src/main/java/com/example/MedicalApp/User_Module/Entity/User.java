package com.example.MedicalApp.User_Module.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.validation.constraints.Email;
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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    @NotNull
    private Integer id;
    private Integer level;

    @Column(updatable = false)
    @NotNull
    private String user_id;

    @CreationTimestamp
    @NotNull
    @Column(updatable = false)

    @NotNull
    private Date date_of_account_creation;

    @Size(min = 6, max = 15)
    @NotNull
    private String password;
    @NotNull
    private String name;

    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
    @NotNull
    private String email;

    @Column(length = 10,name = "phone_Number")
    @NotNull
    private String phone_Number;

    @Column(length = 6)
    private String pinCode;
    private String address;

    private Boolean isApproved;
    private Boolean block;



}
