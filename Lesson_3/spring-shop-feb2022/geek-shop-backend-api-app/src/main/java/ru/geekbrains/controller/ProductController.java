package ru.geekbrains.controller;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.geekbrains.controller.dto.ProductDto;
import ru.geekbrains.service.ProductService;

import java.util.Optional;

@Controller
@RequestMapping("/v1/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public Page<ProductDto> findAll(@RequestParam("categoryId") Optional<Long> categoryId,
                                    @RequestParam("namePattern") Optional<String> namePattern,
                                    @RequestParam("brandId") Optional<Long> brandId,
                                    @RequestParam("page") Optional<Integer> page,
                                    @RequestParam("size") Optional<Integer> size,
                                    @RequestParam("sortField") Optional<String> sortField) {
        return productService.findAll(categoryId,
                namePattern,
                brandId,
                page.orElse(1) - 1,
                size.orElse(5),
                sortField.filter(fld -> !fld.isBlank()).orElse("id"));
    }
}
