package com.example.MedicalApp.Stock_Module.Controller;

import com.example.MedicalApp.Stock_Module.Entity.Stock;
import com.example.MedicalApp.Stock_Module.Service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    StockService stockService;

    //get user signup
    @PostMapping("/save_stock")
    public Stock saveStock(@Validated @RequestBody Stock stock) {
        return stockService.saveStock(stock);
    }

    //get all stock
    @GetMapping("/getallstock")
    public List<Stock> getAllStockList() {
        return stockService.getAllStock();
    }


    //update user detail
    @PatchMapping("update/{id}")
    public ResponseEntity<Optional<Stock>> updateStockDetail(@RequestBody Stock stock,
                                                           @PathVariable("id") Integer id) {
        return new ResponseEntity<Optional<Stock>>(stockService.updateStockDetail(stock, id), HttpStatus.OK);
    }



    //delete stock
    @DeleteMapping("/delete/{id}")
    public String deletestockFile(@PathVariable("id") Integer id) {
        stockService.deleteStockById(id);
        return  "Stock id "+id+" delete Successfull";
    }


}
