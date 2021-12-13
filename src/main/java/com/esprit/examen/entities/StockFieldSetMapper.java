package com.esprit.examen.entities;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;

public class StockFieldSetMapper implements FieldSetMapper<Stock> {
    @Override
    public Stock mapFieldSet(FieldSet fieldSet) {
        return Stock.builder()
               .libelleStock(fieldSet.readString(0))
                .qte(10)
                .qteMin(100)
                .build();
    }
    
  
}

