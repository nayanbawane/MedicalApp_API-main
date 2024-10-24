package com.example.MedicalApp.History_Module.Service;

import com.example.MedicalApp.History_Module.Entity.History;
import com.example.MedicalApp.History_Module.Repo.HistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HistoryServiceImpl implements HistoryService {

    @Autowired
    private HistoryRepo historyRepo;

    @Override
    public History saveHistory(History history) {
        UUID uuid = UUID.randomUUID();
        String id = "H_" + uuid;
        history.setSell_id(id);
        return historyRepo.save(history);
    }

    @Override
    public History getSpecificData(String sell_id) {
        History history1=new History();
        history1 =  historyRepo.findByHistory_sell_id(sell_id);
        System.out.println(history1);
        return history1;
    }

    @Override
    public List<History> historyList() {
        return (List<History>) historyRepo.findAll();
    }

    @Override
    public History updateHistoryDetail(History history, String sell_id) {
        History history1 = historyRepo.findByHistory_sell_id(sell_id);

        if (history.getQuantity() !=null){
            history1.setQuantity(history.getQuantity());
        }

        if (history.getRemaining_stock() !=null){
            history1.setRemaining_stock(history.getRemaining_stock());
        }

        if (history.getDate_of_sell() !=null){
            history1.setDate_of_sell(history.getDate_of_sell());
        }

        if (history.getProduct_id() !=null){
            history1.setProduct_id(history.getProduct_id());
        }

        if (history.getProduct_name() !=null){
            history1.setProduct_name(history.getProduct_name());
        }

        if (history.getProduct_category() !=null){
            history1.setProduct_category(history.getProduct_category());
        }

        if (history.getUser_name() !=null){
            history1.setUser_name(history.getUser_name());
        }

        if (history.getUser_id() !=null){
            history1.setUser_id(history.getUser_id());
        }

        if (history.getTotal_amount() !=null){
            history1.setTotal_amount(history.getTotal_amount());
        }

        if (history.getPrice() !=null){
            history1.setPrice(history.getPrice());
        }

        historyRepo.save(history1);
        return history1;
    }

    @Override
    public String deleteHistoryBy_sell_id(String sell_id) {
        History history = new History();
        //System.out.println(sell_id);
        history = historyRepo.findByHistory_sell_id(sell_id);
        //System.out.println(history);
        historyRepo.delete(history);
        return "Delete Successfully";
    }
}
