package ru.gb;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gb.persist.model.Product;

public class Utils {
    public static interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
    }
}
