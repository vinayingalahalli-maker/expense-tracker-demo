package com.northbeam.expensetracker.repository;

import com.northbeam.expensetracker.domain.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class CategoryRepository {

    private final Map<String, Category> store = new ConcurrentHashMap<>();
    private final AtomicInteger counter = new AtomicInteger(1);

    public List<Category> findAll() {
        return new ArrayList<>(store.values());
    }

    public Optional<Category> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public Category save(Category category) {
        if (category.getId() == null) {
            category.setId("cat_" + String.format("%03d", counter.getAndIncrement()));
        }
        store.put(category.getId(), category);
        return category;
    }

    public boolean existsById(String id) {
        return store.containsKey(id);
    }
}
