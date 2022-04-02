package ru.geekbrains.controller.dto;

import javax.validation.constraints.NotBlank;

public class BrandDto {

    private Long id;

    @NotBlank
    private String name;

    private String description;

    public BrandDto() {
    }

    public BrandDto(Long id) {
        this.id = id;
    }

    public BrandDto(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public BrandDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
