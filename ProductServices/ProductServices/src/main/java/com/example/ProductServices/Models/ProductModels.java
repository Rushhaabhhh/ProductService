package com.example.ProductServices.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProductModels {
    private int id;
    private String title;
    private double price;
    private String description;
    private String image;
    private CategoryModel category;
}
