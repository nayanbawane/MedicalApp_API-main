package com.example.MedicalApp.Stock_Module.Service;


import com.example.MedicalApp.Stock_Module.Entity.Stock;
import com.example.MedicalApp.Stock_Module.Repo.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    StockRepo stockRepo;

    @Override
    public Stock saveStock(Stock stock) {
        return stockRepo.save(stock);
    }

    @Override
    public List<Stock> getAllStock() {
        return (List<Stock>) stockRepo.findAll();
    }


    @Override
    public Optional<Stock> updateStockDetail(Stock stock, Integer id) {
        Optional<Stock> stock1 = stockRepo.findById(id);
        if (stock1.isPresent()) {
            stock1.get().setProduct_id(stock.getProduct_id());
            stock1.get().setProduct_name(stock.getProduct_name());
            stock1.get().setUser_name(stock.getUser_name());
            stock1.get().setUser_id(stock.getUser_id());
            stock1.get().setProduct_category(stock.getProduct_category());
            stock1.get().setCertificate(stock.getCertificate());
            stock1.get().setProduct_price(stock.getProduct_price());
            stock1.get().setProduct_id(stock.getProduct_id());
            stock1.get().setProduct_stock(stock.getProduct_stock());
            stockRepo.save(stock1.get());
        }

        return stock1;
    }

    @Override
    public void deleteStockById(Integer id) {
       stockRepo.deleteById(id);
    }
}
