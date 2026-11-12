package com.northbeam.expensetracker.repository;

import com.northbeam.expensetracker.domain.Expense;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class ExpenseRepository {

    private final Map<String, Expense> store = new ConcurrentHashMap<>();
    private final AtomicInteger counter = new AtomicInteger(1);

    public List<Expense> findAll() {
        return new ArrayList<>(store.values());
    }

    public Optional<Expense> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public Expense save(Expense expense) {
        if (expense.getId() == null) {
            expense.setId("exp_" + String.format("%03d", counter.getAndIncrement()));
        }
        store.put(expense.getId(), expense);
        return expense;
    }

    public void deleteById(String id) {
        store.remove(id);
    }

    public boolean existsById(String id) {
        return store.containsKey(id);
    }
}
