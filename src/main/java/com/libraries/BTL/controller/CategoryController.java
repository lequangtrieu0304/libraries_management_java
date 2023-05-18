package com.libraries.BTL.controller;

import com.libraries.BTL.dto.category.CategoryDto;
import com.libraries.BTL.exception.NotFoundException;
import com.libraries.BTL.model.Category;
import com.libraries.BTL.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryServiceImpl categoryServiceImpl;
    @PostMapping("/create")
    public ResponseEntity<String> createCategory(@RequestBody CategoryDto categoryDto){
        String result = categoryServiceImpl.create(categoryDto);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable("id") Integer id) throws NotFoundException {
        Category category = categoryServiceImpl.findById(id);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }
    @GetMapping("/")
    public  ResponseEntity<List<Category>> getAllCategory(){
        List<Category> categoryList = categoryServiceImpl.getAllCategory();
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }
}
