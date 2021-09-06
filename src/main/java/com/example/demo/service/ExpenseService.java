package com.example.demo.service;

import com.example.demo.model.Expense;
import com.example.demo.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository){
        this.expenseRepository = expenseRepository;
    }

    public void addExpense(Expense expense){
        expenseRepository.insert(expense);
    }

    public void updateExpense(Expense expense){
        Expense savedExpense = expenseRepository.findById(expense.getId())
                .orElseThrow(()-> new RuntimeException(
                        String.format("Cannot Find Expense by ID %s", expense.getId())));
        savedExpense.setExpenseAmount(expense.getExpenseAmount());
        savedExpense.setName(expense.getName());
        savedExpense.setExpenseCategory(expense.getExpenseCategory());
        expenseRepository.save(savedExpense);

    }

    public List<Expense> getAllExpenses(){
        return expenseRepository.findAll();
    }
    public Expense getExpenseByName(String name){
        return expenseRepository.findByName(name).orElseThrow(()->
                new RuntimeException(String.format("Cannot find expense by name %s",name)));

    }

    public void deleteExpense(String id){
        expenseRepository.deleteById(id);
    }

    public List<Expense> getExpenseByCategory(String type) {
        return expenseRepository.findByCategory(type);
    }
}