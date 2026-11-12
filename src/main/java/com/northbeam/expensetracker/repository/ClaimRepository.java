package com.northbeam.expensetracker.repository;

import com.northbeam.expensetracker.domain.Claim;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class ClaimRepository {

    private final Map<String, Claim> store = new ConcurrentHashMap<>();
    private final AtomicInteger counter = new AtomicInteger(1);

    public List<Claim> findAll() {
        return new ArrayList<>(store.values());
    }

    public Optional<Claim> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public Claim save(Claim claim) {
        if (claim.getId() == null) {
            claim.setId("clm_" + String.format("%03d", counter.getAndIncrement()));
        }
        store.put(claim.getId(), claim);
        return claim;
    }

    public boolean existsById(String id) {
        return store.containsKey(id);
    }
}
