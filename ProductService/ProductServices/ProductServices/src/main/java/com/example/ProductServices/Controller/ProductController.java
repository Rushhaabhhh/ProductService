package com.example.ProductServices.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProductServices.Models.ProductModels;
import com.example.ProductServices.Services.ProductService;


@RestController
public class ProductController {
        
    ProductService sc;

    ProductController(ProductService sc) {
        this.sc = sc;
    } 

    @GetMapping("products/{id}")
    public ProductModels getProductById(@PathVariable int id) {

        return sc.getProductById(id);
    }
}
