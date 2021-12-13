package com.esprit.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.esprit.examen.entities.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
}
