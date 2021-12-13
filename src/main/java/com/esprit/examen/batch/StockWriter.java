package com.esprit.examen.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import com.esprit.examen.entities.Stock;
import com.esprit.examen.services.IStockService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StockWriter implements ItemWriter<Stock> {

    @Autowired
    private IStockService stockService;

    /* écrire nos données dans la base de données*/
    public void write(List<? extends Stock> stocks) {
    	
            log.info("Enregistrement des lignes stocks dans la base de données", stocks);
            /*toDo 10*/
            stockService.addStock((List<Stock>) stocks);
    }
}
