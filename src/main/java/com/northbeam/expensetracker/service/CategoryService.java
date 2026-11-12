package com.northbeam.expensetracker.service;

import com.northbeam.expensetracker.domain.Category;
import com.northbeam.expensetracker.dto.CategoryRequest;
import com.northbeam.expensetracker.dto.CategoryResponse;
import com.northbeam.expensetracker.exception.ResourceNotFoundException;
import com.northbeam.expensetracker.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<CategoryResponse> listAll() {
        return categoryRepository.findAll().stream()
                .map(this::toResponse)
                .toList();
    }

    public CategoryResponse getById(String id) {
        return categoryRepository.findById(id)
                .map(this::toResponse)
                .orElseThrow(() -> new ResourceNotFoundException("Category " + id + " does not exist"));
    }

    public CategoryResponse create(CategoryRequest request) {
        Category category = Category.builder()
                .name(request.getName())
                .description(request.getDescription())
                .receiptThreshold(request.getReceiptThreshold())
                .build();
        return toResponse(categoryRepository.save(category));
    }

    public CategoryResponse update(String id, CategoryRequest request) {
        Category existing = categoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Category " + id + " does not exist"));

        if (request.getName() != null) existing.setName(request.getName());
        if (request.getDescription() != null) existing.setDescription(request.getDescription());
        if (request.getReceiptThreshold() != null) existing.setReceiptThreshold(request.getReceiptThreshold());

        return toResponse(categoryRepository.save(existing));
    }

    public Category findDomainById(String id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Category " + id + " does not exist"));
    }

    private CategoryResponse toResponse(Category c) {
        return CategoryResponse.builder()
                .id(c.getId())
                .name(c.getName())
                .description(c.getDescription())
                .receiptThreshold(c.getReceiptThreshold())
                .build();
    }
}
