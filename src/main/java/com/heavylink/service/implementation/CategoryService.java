package com.heavylink.service.implementation;

import com.heavylink.model.Category;
import com.heavylink.repository.ICategoryRepository;
import com.heavylink.service.ICategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService implements ICategoryService {
    // Autowired
    private final ICategoryRepository repo;

    @Override
    public Category save(Category category) throws Exception {
        return repo.save(category);
    }

    @Override
    public Category update(Category category, Integer id) throws Exception {
        // EVALUAR CON EL ID
        // API REFLECTION
        category.setIdCategory(id);
        return repo.save(category);
    }

    @Override
    public List<Category> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Category findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Category());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
