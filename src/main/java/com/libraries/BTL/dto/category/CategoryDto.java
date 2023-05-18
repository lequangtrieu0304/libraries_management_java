package com.libraries.BTL.dto.category;

public class CategoryDto {
    private String categoryName;

    public CategoryDto(String categoryName) {
        this.categoryName = categoryName;
    }

    public CategoryDto() {
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
