package ru.gb;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gb.persist.model.Category;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {
}
