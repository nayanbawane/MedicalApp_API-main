package com.example.MedicalApp.Stock_Module.Service;

import com.example.MedicalApp.Stock_Module.Entity.Stock;

import java.util.List;
import java.util.Optional;

public interface StockService {

    //save operation
    Stock saveStock(Stock stock);

    // Read operation
    List<Stock> getAllStock();

    //update operation
    Optional<Stock>  updateStockDetail(Stock stock,Integer id);

    // Delete operation by id
    void deleteStockById(Integer id);

}
