package com.sst.productservicesst.controllers;
import com.sst.productservicesst.models.Product;
import com.sst.productservicesst.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {

        return productService.getProductById(id);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}


//        ResponseEntity<Product> responseEntity = null;
//        Product product = null;
//        try {
//            product = productService.getProductById(id);
//            responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
//            System.out.println("Hello");
//            return responseEntity;
//        } catch (RuntimeException exception) {
//            ExceptionDto dto = new ExceptionDto();
//            dto.setMessage("Something went wrong");
//            ResponseEntity<ExceptionDto> response =
//                    new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
//            return response;
//        }
