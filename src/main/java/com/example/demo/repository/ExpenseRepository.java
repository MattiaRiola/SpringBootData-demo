package com.example.demo.repository;

import com.example.demo.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ExpenseRepository extends MongoRepository<Expense,String> {
    @Query("{'name':?0}")
    Optional<Expense> findByName(String name);

    @Query("{'category':?0}")
    List<Expense> findByCategory(String type);
}
