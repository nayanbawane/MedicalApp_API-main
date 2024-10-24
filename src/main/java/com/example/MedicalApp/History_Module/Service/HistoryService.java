package com.example.MedicalApp.History_Module.Service;

import com.example.MedicalApp.History_Module.Entity.History;

import java.util.List;

public interface HistoryService {

    //save operation
    History saveHistory(History history);

    //get specific history data
    History getSpecificData(String sell_id);

    //read all history data
    List<History> historyList();

    // Update operation
    History updateHistoryDetail(History history, String sell_id);

    //Delete Operation
    String deleteHistoryBy_sell_id(String sell_id);


}
