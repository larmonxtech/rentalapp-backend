package com.heavylink.controller;

import com.heavylink.model.Category;
import com.heavylink.service.ICategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categories")
public class CategoryController {
    private final ICategoryService service;

    @GetMapping
    public List<Category> findAll() throws Exception{
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Category findById(@PathVariable("id") Integer id) throws Exception{
        return service.findById(id);
    }

    @PostMapping
    public Category save(@RequestBody Category category) throws Exception{
        return service.save(category);
    }

    @PutMapping("/{id}")
    public Category update(@PathVariable("id") Integer id, @RequestBody Category category) throws Exception{
        return service.update(category,id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) throws Exception{
        service.delete(id);
    }
}
