package com.example.MedicalApp.Order_Module.Service;

import com.example.MedicalApp.Order_Module.Entity.UserOrder;

import java.util.List;

public interface UserOrderService {

    //save operation
    UserOrder saveUserOrder(UserOrder userOrder);

    // Read All operation
    List<UserOrder> getAllOrder();

    // Read specific operation
    UserOrder getSpecificUserOrder(String order_id);

    //Delete Operation
    void deleteUserOrderBy_Order_id(String order_id);

}
