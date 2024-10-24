package com.example.MedicalApp.History_Module.Controller;

import com.example.MedicalApp.History_Module.Entity.History;
import com.example.MedicalApp.History_Module.Service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/history")
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    //save history
    @PostMapping("/addHistory")
    public ResponseEntity<History> saveHistory(@Validated @RequestBody History history) {
        return new ResponseEntity<History>(historyService.saveHistory(history), OK);
    }

    //get specific data
    @GetMapping("/getSpecificData/{sell_id}")
    public History getHistoryDate(@PathVariable("sell_id") String sell_id) {
        return historyService.getSpecificData(sell_id);
    }


    //get all history data
    @GetMapping("/getAllHistory")
    public List<History> getAllHistoryDate() {
        return historyService.historyList();
    }


    //update history detail
    //delete history

    @PatchMapping("/updateHistory/{sell_id}")
    public ResponseEntity<History> updateHistoryDetail(@RequestBody History history, @PathVariable("sell_id") String sell_id) {
        return new ResponseEntity<History>(historyService.updateHistoryDetail(history, sell_id), OK);
    }
    @DeleteMapping("/delete/{sell_id}")
    public String deleteHistory(@PathVariable("sell_id")
                                String sell_id){

        historyService.deleteHistoryBy_sell_id(sell_id);
        return "Deleted Successfully";
    }
}
