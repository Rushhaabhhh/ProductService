package com.example.ProductServices.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.ProductServices.DTOs.ProductDTO;
import com.example.ProductServices.Models.CategoryModel;
import com.example.ProductServices.Models.ProductModels;

@Service
public class ProductService implements ProductServiceInterface{
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://fakestoreapi.com";

    @Override

    public ProductModels ConvertDTOtoModel(ProductDTO response) {

        ProductModels product = new ProductModels();
        product.setId(response.getId());
        product.setTitle(response.getTitle());
        product.setDescription(response.getDescription());
        product.setPrice(response.getPrice());
        product.setImage(response.getImage());

        CategoryModel category = new CategoryModel();
        category.setTitle(response.getTitle());
        product.setCategory(category);

        return product;
    }

    public ProductModels getProductById(int id){
        int x = 1/0;
        //Used for Arithmetic Exception
        ProductDTO response = restTemplate.getForObject(url + "/products/" + id, ProductDTO.class);

        return ConvertDTOtoModel(response) ;
    }
}
