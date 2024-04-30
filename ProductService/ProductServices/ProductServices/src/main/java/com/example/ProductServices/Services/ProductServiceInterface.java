package com.example.ProductServices.Services;

import com.example.ProductServices.DTOs.ProductDTO;
import com.example.ProductServices.Models.ProductModels;

public interface ProductServiceInterface {
    public ProductModels getProductById(int id);

    public ProductModels ConvertDTOtoModel(ProductDTO response);
} 