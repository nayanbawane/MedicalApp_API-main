package com.example.MedicalApp.Stock_Module.Repo;
import com.example.MedicalApp.Stock_Module.Entity.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StockRepo extends CrudRepository<Stock, Integer> {


}
