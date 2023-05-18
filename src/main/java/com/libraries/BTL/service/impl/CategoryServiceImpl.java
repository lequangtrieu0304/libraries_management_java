package com.libraries.BTL.service.impl;

import com.libraries.BTL.dto.category.CategoryDto;
import com.libraries.BTL.exception.NotFoundException;
import com.libraries.BTL.model.Category;
import com.libraries.BTL.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl {
    @Autowired
    CategoryRepository categoryRepository;
    public String create(CategoryDto categoryDto) {
        Category newCategory = new Category();
        newCategory.setNameCategory(categoryDto.getCategoryName());
        categoryRepository.save(newCategory);
        return "success";
    }

    public Category findById(Integer id) throws NotFoundException{
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if(optionalCategory.isEmpty()){
            throw new NotFoundException("Khong tim thay loai san pham");
        }
        return optionalCategory.get();
    }

    public List<Category> getAllCategory() {
        List<Category> categoryList = categoryRepository.findAll();
        return categoryList;
    }
}
