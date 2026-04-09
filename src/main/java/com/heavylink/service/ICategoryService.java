package com.heavylink.service;

import com.heavylink.model.Category;

import java.util.List;

public interface ICategoryService {
    Category save(Category category) throws  Exception;
    Category update(Category category, Integer id) throws  Exception;
    List<Category> findAll() throws  Exception;
    Category findById(Integer id) throws  Exception;
    void delete(Integer id) throws  Exception;
}
