package com.example.ProductServices.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProductDTO {
    private int id;
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;   
}
