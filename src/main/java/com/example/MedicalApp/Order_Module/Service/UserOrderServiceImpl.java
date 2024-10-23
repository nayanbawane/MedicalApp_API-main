package com.example.MedicalApp.Order_Module.Service;

import com.example.MedicalApp.Order_Module.Entity.UserOrder;
import com.example.MedicalApp.Order_Module.Repo.UserOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class UserOrderServiceImpl implements UserOrderService {

    @Autowired
    UserOrderRepo userOrderRepo;

    @Override
    public UserOrder saveUserOrder(UserOrder userOrder) {
        UUID uuid = UUID.randomUUID();
        String id= "O_"+uuid;
        userOrder.setOrderId(id);
        return userOrderRepo.save(userOrder);
    }

    @Override
    public List<UserOrder> getAllOrder() {
        return (List<UserOrder>) userOrderRepo.findAll();
    }

    @Override
    public UserOrder getSpecificUserOrder(String order_id) {
        return userOrderRepo.findByOrder_order_id(order_id);
    }

    @Override
    public void deleteUserOrderBy_Order_id(String order_id) {
        userOrderRepo.deleteByOrder_order_id(order_id);
    }
}

