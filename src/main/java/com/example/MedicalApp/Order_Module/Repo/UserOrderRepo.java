package com.example.MedicalApp.Order_Module.Repo;

import com.example.MedicalApp.Order_Module.Entity.UserOrder;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserOrderRepo extends CrudRepository<UserOrder, Integer> {


    @Query(nativeQuery = true, value = "select * FROM user_order where order_id = :order_id")
    UserOrder findByOrder_order_id(String order_id);

    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "Delete FROM user_order where order_id = :order_id")
    void deleteByOrder_order_id(String order_id);
}

