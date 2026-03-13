package com.thuongmaidientu.thuongmaidientu.repositories;

import com.thuongmaidientu.thuongmaidientu.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByCategoryName(String categoryName);
}
