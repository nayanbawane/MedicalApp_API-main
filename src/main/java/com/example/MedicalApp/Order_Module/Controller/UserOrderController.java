package com.example.MedicalApp.Order_Module.Controller;

import com.example.MedicalApp.Order_Module.Entity.UserOrder;
import com.example.MedicalApp.Order_Module.Service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class UserOrderController {

    @Autowired
    UserOrderService userOrderService;

    //save order
    @PostMapping("/add_order")
    public UserOrder addOrder(@Validated @RequestBody UserOrder order) {
        return userOrderService.saveUserOrder(order);
    }

    //get all order list
    @GetMapping("/get_all_order")
    public List<UserOrder> getAllOrderList() {
        return userOrderService.getAllOrder();
    }

    //get specific order item
    @GetMapping("/get_specific_order/{order_id}")
    public UserOrder getSpecificOrder(@PathVariable("order_id") String order_id) {
        return userOrderService.getSpecificUserOrder(order_id);
    }

    //Delete By order id
    @DeleteMapping("/delete/{order_id}")
    public String deleteProduct(@PathVariable("order_id") String order_id) {
        userOrderService.deleteUserOrderBy_Order_id(order_id);
        return  "Order id "+order_id+" delete Successfull";
    }

}
