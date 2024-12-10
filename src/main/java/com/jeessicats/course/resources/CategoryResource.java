package com.jeessicats.course.resources;

import com.jeessicats.course.entities.Category;
import com.jeessicats.course.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService category;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = category.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable int id) {
        Category obj = category.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
