package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Document("expense")
public class Expense {
    @Id
    private String id;

    @Field(name="person")
    private Person person;

    @Indexed(unique= true)
    private String name;
    @Field(name="category")
    private ExpenseCategory expenseCategory;
    @Field(name="amount")
    private BigDecimal expenseAmount;

    public Expense(String id, String name, ExpenseCategory expenseCategory, BigDecimal expenseAmount) {
        this.id = id;
        this.name = name;
        this.expenseCategory = expenseCategory;
        this.expenseAmount = expenseAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExpenseCategory getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(ExpenseCategory expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public BigDecimal getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(BigDecimal expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

}
