package com.thuongmaidientu.thuongmaidientu.service;

import com.thuongmaidientu.thuongmaidientu.payload.CategoryDTO;
import com.thuongmaidientu.thuongmaidientu.payload.CategoryResponse;

public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryDTO deleteCategory(Long categoryId);
    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
