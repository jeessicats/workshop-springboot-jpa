package com.jeessicats.course.services;

import com.jeessicats.course.entities.Category;
import com.jeessicats.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(int id) {
        Optional<Category> obj = repository.findById((long) id);
        return obj.get();
    }
}
