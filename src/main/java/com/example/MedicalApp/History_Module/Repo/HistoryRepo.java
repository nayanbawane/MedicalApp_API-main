package com.example.MedicalApp.History_Module.Repo;

import com.example.MedicalApp.History_Module.Entity.History;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepo extends CrudRepository<History,Integer> {

    @Query(nativeQuery = true, value = "select * FROM history where sell_id = ?")
    History findByHistory_sell_id(String sell_id);

}
