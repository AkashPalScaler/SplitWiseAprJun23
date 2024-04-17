package com.example.splitwise.Repositories;

import com.example.splitwise.models.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepositories extends JpaRepository<Expense, Long> {
}
